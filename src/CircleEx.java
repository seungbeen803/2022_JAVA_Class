public class CircleEx {
    int radius; // 원의 반지름 필드
    String name; // 원의 이름 필드
    public CircleEx() {} // 원의 생성자
    public double getArea() { // 원의 면적 계산 메서드
        return 3.15 * radius * radius;
    }

    public static void main(String[] args) {
        CircleEx pizza = new CircleEx(); // Circl 객체 생성
        pizza.radius = 10; // 피자의 반지름을 10으로 설정
        pizza.name = "고구마피자"; // 피자의 이름 지정
        System.out.println(pizza.radius);
        System.out.println(pizza.name);
    }
}
