package File;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // System.in --> 운영체제 상에서 input값
        FileWriter fout = null; // null값으로 초기화 시켜줌
        int c;
        try{
            fout = new FileWriter("test.txt", true); // 파일 생성 하겠다. append : true로  파일 추가가 가능해짐
            // append의 값이 없으면 재시작 할 때마다 덮어 씌워짐
            // true이면 재시작 할 때 그 밑에 작성
            while (true) {
                String line = scanner.nextLine();
                if(line.length() == 0) // 0은 엔터키, 한 줄에 <Enter>키만 입력한 경우
                   break; // 즉 엔터를 두 번 입력하면 종료
                // 한 줄 단위로 출력
                fout.write(line, 0, line.length()); // line.length()는 line에 입력된 만큼 출력 됨
                fout.write("\r\n", 0, 2); // 한 줄 끝에 줄바꿈 기호 입력
            }
            fout.close();
        }catch (IOException e) {
            System.out.println("입출력 오류");
        }
        scanner.close(); // scanner 닫아주기
    }
}
