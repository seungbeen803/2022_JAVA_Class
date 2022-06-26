package File;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) {
        FileReader in = null; // FileReader는 문자열 스트림이다.
        try { // 반드시 입출력은 예외처리 필수!!!
            in = new FileReader("c:\\windows\\system.ini"); // 입력을 받음
            int c;
            while ((c = in.read()) != -1) { // 한 문자씩 끝까지 읽는다.
                // 파일의 끝은 -1이기 때문에 -1이 될 때까지 출력된다.
                System.out.print((char) c);
            }
            in.close(); // 스트림 닫기
        }catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }
}
