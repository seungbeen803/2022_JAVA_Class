package Thread;

class Bank {
    // 1. 계좌개설
    private int money = 10000;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    // 메서드 생성

    // 2. 입금
    public void saveMoney(int save) {
        int m = this.getMoney(); // 입금되어 있는 돈을 가져옴
        try {
            Thread.sleep(500); // 0.5초 정지
        } catch (InterruptedException e) { // 스레드가 멈추는 상황이 발생했을 때 예외를 처리해줌
            e.printStackTrace();
        }
        this.setMoney(m + save);
    }// saveMoney 닫음

    // 3. 출금
    public void minusMoney(int minus) {
        int m = this.getMoney(); // 입금되어 있는 돈을 가져옴
        try {
            Thread.sleep(500); // 0.5초 정지
        } catch (InterruptedException e) { // 스레드가 멈추는 상황이 발생했을 때 예외를 처리해줌
            e.printStackTrace();
        }
        this.setMoney(m - minus);
    }// minusMoney 닫음
}// Bank 닫음

class Family1 extends Thread {
    public void run() {
        synchronized (BankExam.mybank) {
            BankExam.mybank.saveMoney(5000); // 5000원 입금
        }
        System.out.println("saveMoney(5000):" + BankExam.mybank.getMoney());
    }
}// Family1 닫음

class Family2 extends Thread {
    public void run() {
        synchronized (BankExam.mybank) {
            BankExam.mybank.minusMoney(2000); // 2000원 출금
        }
        System.out.println("minusMoney(2000):" + BankExam.mybank.getMoney());
    }
}// Family2 닫음
public class BankExam {
    public static Bank mybank = new Bank();
    public static void main(String[] args) {
        System.out.println("원금 :" + mybank.getMoney()); // 원금 출력
        Family1 f1 = new Family1(); // Family1 스레드 객체 생성
        Family2 f2 = new Family2(); // Family2 스레드 객체 생성
        f1.start();
        try {
            Thread.sleep(200); // 0.2초
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        f2.start();
    }// main 닫음
}// BankExam 닫음

