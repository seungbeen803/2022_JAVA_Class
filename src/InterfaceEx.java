
interface PhoneInterface { // 인터페이스 선언
    final int TIMEOUT = 10000; // 인터페이스 내에 상수 필드 선언 가능
    // public static 생략 가능
    void sendCall(); // 인터페이스 내에 추상메서드 선언
    // public abstract 생략 가능
    void receiveCall(); // 인터페이스 내에 추상메서드 선언
    // public abstract 생략 가능
    default void printLogo() { // public 생략 가능
        System.out.println("** Phone **");
    } // 인터페이스 내에 생성된 디폴트 메서드
}
//class 대신에 interface를 써준다
interface MobilePhoneInterface extends PhoneInterface {
    void sendSMS(); // 인터페이스 내에 추상 메서드 선언
    // public adstract 생략 가능
    void receiveSMS(); // 인터페이스 내에 추상 메서드 선언
    // public adstract 생략 가능
}

class PDA { // 클래스 작성
    public int calculate(int x, int y) {
        return x + y; // 매개 변수의 값을 받아서 return으로 계산해줌
    }
}

interface MP3Intereface {
    public void play(); // 추상 메서드(abstract 생략)
    public void stop();
}

//SmartPhone 클래스는 PDA를 상속 받고, MobilePhoneInterface와 MP3Interface를 구현한다.
class SmartPhone extends PDA implements MobilePhoneInterface, MP3Intereface { // 인터페이스 다중 구현
    // 인터페이스에 있는 추상 메서드 재정의
    @Override
    public void sendCall() {
        System.out.println("따르릉따르릉~");
    }

    @Override
    public void receiveCall() {
        System.out.println("전화 왔슈~~");
    }

    @Override
    public void sendSMS() {
        System.out.println("문자가 갑니다. 쟈니?");
    }

    @Override
    public void receiveSMS() {
        System.out.println("문자 왔슈 (꺼져)");
    }

    @Override
    public void play() {
        System.out.println("start music");
    }

    @Override
    public void stop() {
        System.out.println("음악 멈춰!!! (락교 폭력 멈춰 느낌으로)");
    }
    // 추가로 smartPhone 클래스의 메서드 작성
    public void schedule() {
        System.out.println("난 니가 지난 여름에 한 일을 알고 있다.");
    }
}

class  SamsungPhone implements PhoneInterface {// 인터페이스 구현
// PhoneInterface의 모든 추상 메서드 구현
    @Override
    public void sendCall() {
        System.out.println("띠리리링");
    }

    @Override
    public void receiveCall() {
        System.out.println("전화가 왔습니다.");
    }
    
    // 삼성폰만의 메서드 작성
    public void flash() {
        System.out.println("전화기에 불이 들어와유~~~");
    }
}
public class InterfaceEx {
    public static void main(String[] args) {
        SamsungPhone phone = new SamsungPhone();
        phone.printLogo();
        phone.sendCall();
        phone.receiveCall();
        phone.flash();

        SmartPhone sPhone = new SmartPhone();
        sPhone.printLogo();
        sPhone.sendCall();
        sPhone.receiveCall();
        sPhone.sendSMS();
        sPhone.receiveSMS();
        sPhone.play();
        sPhone.stop();
        System.out.println("3과 5를 더하면 : " + sPhone.calculate(3,5)); // 상속 받았기 때문에 사용 가능하다
        sPhone.schedule();
    }
}
