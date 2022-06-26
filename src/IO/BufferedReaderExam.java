package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExam {
    public static void main(String[] args) {
        // 보조 스트림과 메인 스트림은 한 줄로 작성함
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        // 메인 스트림
//        InputStreamReader isr = new InputStreamReader(System.in);
//        // 보조 스트림
//        BufferedReader b = new BufferedReader(isr);
        try {
            String aa = br.readLine(); // readLine() : 한 줄을 읽는다. 근데 엔터는 줄의 끝을 의미
            System.out.println(aa);
        }catch (IOException e) { }
    }
}
