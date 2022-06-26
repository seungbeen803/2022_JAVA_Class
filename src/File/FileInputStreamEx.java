package File;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {
    public static void main(String[] args) {
        byte b [] = new byte[6]; // 비어있는 배열 하나 선언
        try {
            FileInputStream fin = new FileInputStream("test.out");
            int n = 0, c;
            while((c = fin.read()) != -1 ) { // 파일의 끝(EOF)
                b[n] = (byte) c;
                n++;
            }
            System.out.println("test.out 에서 읽은 배열을 출력");
            for (int i = 0; i < b.length; i++) {
                System.out.print(b[i] + " ");
            }
            fin.close();
        }catch (IOException e){
            System.out.println("test.out 에서 읽지 못했습니다. 경로를 체크하라고 이자식아");
        }
    }
}
