package File;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
    public static void main(String[] args) {
        byte b[] = {7, 51, 3, 4, -1, 24};
        try {
            FileOutputStream fout = new FileOutputStream("test.out");
            for (int i = 0; i < b.length; i++) {
                fout.write(b[i]);
            }
            fout.close();
        }catch (IOException e){
            System.out.println("test.out 에 저장할 수 없었습니다. 경로명을 확인해라 이자식아");
            return;
        }
        System.out.println("test.out 을 저장했습니다.");
    }
}
