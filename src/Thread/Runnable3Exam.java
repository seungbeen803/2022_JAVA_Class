package Thread;
class RTop3 implements Runnable {
    public void run(){
        for(int i = 0; i < 30; i++) {
            // Thread.currentThread() 현재 작동 중인 스레드 명시
            System.out.print((Thread.currentThread()).getName() + i + "\t");
        }
    }
}

public class Runnable3Exam {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        RTop3 t = new RTop3();
        Thread thd1 = new Thread(t, "a"); // 스레드 이름 지정
        Thread thd2 = new Thread(t, "b");
        // 스레드 우선순위 리턴
        System.out.println(thd1.getPriority());
        System.out.println(thd2.getPriority());
        // 스레드 이름 변경
        thd1.setName("new_a");
        thd2.setName("new_b");
        // 스레드 우선순위 지정
        thd1.setPriority(9);
        thd2.setPriority(Thread.MIN_PRIORITY);
        System.out.println(thd1.getPriority());
        System.out.println(thd2.getPriority());
        thd1.start();
        thd2.start();
        System.out.println("프로그램 종료");
    }
}
