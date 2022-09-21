package Exception;

import java.util.TreeMap;

public class ThrowExam {
    // throws가 continue랑 비슷한 의미
    public static void arrayMethod() throws ArrayIndexOutOfBoundsException // throws 뒤에 예외 종류 작성
    {
        String[] irum = new String[3]; // 배열 선언
        // 배열 안에 문자열을 넣을 때는 + 1을 해줘야한다
        irum[3] = "홍길동";
    }

    public static void main(String[] args) {
        ThrowExam ts = new ThrowExam();
        try{
            arrayMethod();
        }catch (ArrayIndexOutOfBoundsException ae){
            // 자주 사용
            ae.printStackTrace();

            // getMessages()는 가져오는 것만 하므로 print문 작성해주기
            // 에러 메세지 가져올 때 많이 사용
            System.out.println("예외 발생" + ae.getMessage());
            System.out.println("예외 발생" + ae.toString());
        }
    }
}
