public class Circle {
    int radius; // 원의 반지름
    String name; // 원 이름

    //  생성자가 하는 일은 값을 초기화한다
    public Circle() { // 사용자가 만든 매개변수없는 생성자
        radius = 1;
        name = "";
    }
    
    public Circle(int r, String n) { // 매개변수가 있는 생성자
        radius = r;
        name = n;
    }

    public Circle(int r) { // 매개변수가 한 개있는 생성자
        radius = r;
    }

    public Circle(String n) { // 매개변수가 한 개있는 생성자
        name = n;
    }
    
    public double getArea() { // 원의 면적 계산 메소드
        return 3.14*radius*radius;
    }

    // ctrl + shift + F10 = 실행버튼
    public static void main(String[] args) {
        Circle pizza = new Circle(10, "자바피자"); // Circle pizza = new Circle();
        // pizza = new Circle(); // pizza 객체 초기화
        // pizza.radius = 10;
        // pizza.name = "자바피자";
        double area = pizza.getArea(); // 피자의 면적 계산
        System.out.println(pizza.name + "의 면적은 " + area); // sout + enter

        Circle donut = new Circle(); // 도넛 객체 생성
        donut.name = "자바도넛";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);

        Circle pizza2 = new Circle(5);
        pizza2.name = "pizza2";
        area = pizza2.getArea();
        System.out.println(pizza2.name + "의 면적은 " + area);

        Circle donut2 = new Circle("donut2");
        donut2.radius = 5;
        area = donut2.getArea();
        System.out.println(donut2.name + "의 면적은 " + area);
    }
}
