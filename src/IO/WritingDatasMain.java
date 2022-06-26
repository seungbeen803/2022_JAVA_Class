package IO;
import java.io.*;
import java.util.StringTokenizer;

class MDataRWExam {
    int length;
    String[] name = new String[10];
    String[] address = new String[10];
    double[] math = new double[10];
    double[] english = new double[10];
    double[] total = new double[10];
    double[] avg = new double[10];

    public void writingData(String fname, boolean append) throws IOException { // fname 전달 받는 값
        // throws는 메서드 안에서 발생한 에러를 뒤에 Exception 클래스로 넘김
        FileWriter fw = null; // null값으로 초기화
        BufferedWriter bw = null;
        try { // 코드 상황에서 발생한 내역을 예외처리
            fw = new FileWriter(new File(fname));
            bw = new BufferedWriter(fw);
//          bw = new BufferedWriter(new FileWriter(new File(fname)));

            for(int i = 0; i < length; i++) {
                bw.write(name[i] + "\t" + address[i] + "\t" + math[i] + "\t" + english[i] + "\t" + total[i] + "\t" + avg[i] + "\t");
                bw.newLine();
            }
            bw.close();
            fw.close();

        }catch (FileNotFoundException fe) {
            System.out.println("잘못된 파일 입력");
        }
    }

    public void readingData(String fname) throws IOException {
        try {
            FileReader fr = new FileReader(new File(fname)); // 메인 스트림
            BufferedReader br = new BufferedReader(fr); // 메인 스트림을 받는 보조 스트림
//          BufferedReader br = new BufferedReader(new FileReader(new File(fname)));
            String csvStr = "";
            String tmpStr = "";
            do {
                tmpStr = br.readLine();
                if (tmpStr != null) {
                    csvStr += tmpStr + "\t";
                }
            }while (tmpStr != null) ; // 문장이 끝나지 않으면
            StringTokenizer parse = new StringTokenizer(csvStr, "\t");
            // 입력받은 텍스트(문자열)을 \t을 기준으로 토큰 생성
            int length = parse.countTokens() / 4; // 토큰의 개수만큼 할당

            for (int i = 0; i < length; i++) {
                name[i] = parse.nextToken();
                address[i] = parse.nextToken();
                math[i] = Double.valueOf((parse.nextToken())).doubleValue();
                english[i] = Double.valueOf((parse.nextToken())).doubleValue();
                total[i] = math[i] + english[i];
                avg[i] = total[i] / 2.0;
            }

            // 콘솔에 출력
            for (int i = 0; i < length; i++) {
                System.out.println(name[i] + "\t" + address[i] + "\t" + math[i] + "\t" + english[i] + "\t" + total[i] + "\t" + avg[i] + "\t");
            }

        }catch (FileNotFoundException e) {
            System.out.println("잘못된 파일 이름을 입력했습니다.");
        }
    }
}


public class WritingDatasMain {
    public static void main(String[] args) {
        MDataRWExam mrw = new MDataRWExam();
        try {
            mrw.readingData("writed.txt");
            mrw.writingData("writing.txt", false); // false는 덮어쓰기, true는 붙여쓰기
        }catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}
