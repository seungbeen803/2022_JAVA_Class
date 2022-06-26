package File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PhoneWriter {
    public static void main(String[] args) {
        FileWriter fw = null; // Stream은 초기화를 반드시 해줘야한다(초기화를 하지 않으면 에러 발생)
        File f = new File("Phone.txt");
        try {
            fw = new FileWriter(f);
            Scanner scanner = new Scanner(System.in); // System.in : 키보드로 통한 입력
            System.out.println("전화번호 입력 프로그램입니다.");
            while(true) {
                System.out.print("name PhoneNumber>>");
                String line = scanner.nextLine(); // 한 줄 읽기
                if(line.contentEquals("꺼져")) // 입력된 말이 괄호 안에 말과 일치한지 판별
                    break;
                fw.write(line + "\r\n"); // 한 줄 띄어 저장하기
            }
            System.out.println(f.getPath() + "저장"); // Phone.txt에 한 줄씩 계속 저장하고 있다
            // 반드시 close()해주기
            scanner.close();
            fw.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
