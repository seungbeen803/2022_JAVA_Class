package Thread;
class Top extends Thread {
    public void run(){
        for(int i = 0; i < 50; i++) {
            System.out.print(i+ "\t");
        }
    }
}

public class Thread1Exam {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        Top d = new Top();
        d.start(); // main 메서드 역할은 스레드 호출로 끝
        System.out.println("프로그램 종료");
    }
}
