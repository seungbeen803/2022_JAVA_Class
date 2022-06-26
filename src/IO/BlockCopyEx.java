package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BlockCopyEx {
    public static void main(String[] args) {
        // 복사 대상
        File src = new File("C:\\Windows\\Web\\Wallpaper\\Theme1\\img1.jpg");
        // 복사된 이미지
        File dest = new File("copy_img.jpg");
        try {
            FileInputStream fi = new FileInputStream(src); // 입력 스트림 생성
            FileOutputStream fo = new FileOutputStream(dest); // 출력 스트림 생성
            
            byte[] buf = new byte[1024*10]; // 10KB 크기 버퍼
            while(true){
                int n = fi.read(buf); // 버퍼 크기만큼 읽기, n은 실제 읽은 바이트
                fo.write(buf, 0, n); // 버퍼의 시작지점과 끝 지점을 표시
                if(n < buf.length)
                    break; // 버퍼 크기보다 작게 읽었기 때문에 파일 끝에 도달
            }
            fi.close();
            fo.close();
            System.out.println(src.getPath() + "를 " + dest.getPath() + "로 복사");
        }catch(IOException e){
            System.out.println("파일 복사 오류");
        }

    }
}
