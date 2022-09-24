package Thread;

class Summing { // 숫자를 1~num까지 더하는 클래스
    private int sum;
    public synchronized void sumTo(int num) { // 더하는 메서드
        sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i; // sum 값을 받아서 1~num까지 더한다
            System.out.print("스레드: " + Thread.currentThread().getName());
            System.out.println("의 1~" + i + "까지의 합은 " + sum);
            try {
                Thread.sleep(500); // 0.5초
            }catch (InterruptedException e){

            }// catch 닫음
        }// for 닫음
    }// sumTo 닫음
    public int getSum(){ // getter()
        return sum;
    }// getSum 닫음
}

public class MultiThreadExam extends Thread { // 스레드를 상속 받아서 run 메서드 구현
        private Summing sum;
        private int num;
        public MultiThreadExam(String s, Summing sum, int num) {
            // 생성자(매개변수 3개)
            super(s); // Thread(이름)
            this.sum = sum;
            this.num = num;
            System.out.println("스레드: " + getName() + "가 시작됨");
        }
        public void run() { // run 스레드로 동작할 내용을 정의할 필요 없이 스레드로 동작할 메서드를 호출해도 된다
            sum.sumTo(num);
            System.out.println("스레드: " + getName() + "가 종료됨");
        }

    public static void main(String[] args) {
        Summing sum = new Summing();
        MultiThreadExam a = new MultiThreadExam("A", sum, 5);
        MultiThreadExam b = new MultiThreadExam("B", sum, 5);
        a.setPriority(8);
        b.setPriority(10);
        a.start();
        b.start();
    }
}
