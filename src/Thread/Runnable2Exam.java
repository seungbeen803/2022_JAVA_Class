package Thread;
class RTop2 implements Runnable {
    public void run(){
        for(int i = 0; i < 50; i++) {
            System.out.print(i+ "\t");
        }
    }
}

public class Runnable2Exam {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        Thread thd1 = new Thread(new RTop2());
        Thread thd2 = new Thread(new RTop2());
        thd1.start();
        thd2.start();
        System.out.println("프로그램 종료");
    }
}
