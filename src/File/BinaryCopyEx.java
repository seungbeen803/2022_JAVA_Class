package File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class BinaryCopyEx {
    public static void main(String[] args) {
        // File 클래스 : 생성 삭제 편집은 안함 세부정보(경로 종류 확장자 크기)만 한다
        File src = new File("C:\\Windows\\Web\\Wallpaper\\Theme1\\img1.jpg");
        //윈도우 10의 경우c:\\Windows\\Web\\Wallpaper\\Theme1\\img1.jpg
        File dst = new File("copyimg.jpg");
        int c;
        try {
            // 출력하기 위해서 input과 output
            FileInputStream fi = new FileInputStream(src);
            FileOutputStream fo = new FileOutputStream(dst);
            // byte 배열
            byte [] buf = new byte[1024*10]; // 1024byte = 1KB = 2^10, 10KB

            while (true) {
                int n = fi.read(); // 버퍼 크기만큼 읽는다.
                fo.write(buf, 0, n); // buf [0]부터 n 바이트 쓰기(0~n)
                // 파일 끝에 도달하면 버퍼의 크기가 작아짐
                if(n < buf.length)
                    break; // 버퍼 크기보다 작게 읽었기 때문에 파일 끝에 도달
            }
            // stream은 출력이 끝나면 close를 꼭 해주어야한다
            fi.close();
            fo.close();
            System.out.println(src.getPath() + "를 " + dst.getPath() + "로 복사하였습니다.");
        } catch (IOException e) {
            System.out.println("파일 복사 오류");
        }
    }
}
