package Thread;
class DerivedThread extends Thread {
    public void run(){
        for(int i = 0; i < 50; i++) {
            System.out.print(i+ "\t");
        }
    }
}

public class Thread2Exam {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        // 객체 생성
        DerivedThread d1 = new DerivedThread();
        DerivedThread d2 = new DerivedThread();
        // main 메서드 역할은 스레드 호출로 끝
        // main은 start만 해주고 빠짐
        d1.start();
        d2.start(); // 스레드의 숫자는 3개 d1, d2, main
        System.out.println("프로그램 종료");
    }
}
