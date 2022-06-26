class Shape { // 상위 클래스 슈퍼 클래스 부모 클래스
    public Shape next; // 자기 자신을 참조

    public Shape() {
        next = null; // null 값으로 초기화한다
    }

    public void draw() {
        System.out.println("Shape"); // 출력만하는 메서드
    }
}

class Line extends Shape {
    @Override // @ <-- 컴파일러에게 다는 주석
    public void draw() { // Shape클래스에 있는 draw를 Line에 재정의한 것
        System.out.println("Line"); // 출력
    }
}

// Circle
// Rect
// Triangle
// Alt + Shift

class Circle1 extends Shape {
    @Override
    public void draw() { // Shape클래스에 있는 draw를 Circle1에 재정의
        System.out.println("Circle1");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() { // Shape클래스에 있는 draw를 Rectangle에 재정의
        System.out.println("Rectangle");
    }
}

class Triangle extends Shape {
    @Override
    public void draw() { // Shape클래스에 있는 draw를 Triangle에 재정의
        System.out.println("Triangle");
    }
}

public class OverridingEx {
    // 물어보기!
        // static은 위 클래스들이 draw()에 접근할 수 있게하기 위해서 사용한다.
    //p 레퍼런스를 통해 위에 정의된 도형 클래스들에 전부 접근할 수있게 하기 위해
        static void paint(Shape p) { // Shape p = line(업캐스팅) <--- Line line = new Line()
            p.draw(); // p를 line.draw로 인식한다 그래서 line 클래스의 draw를 호출한다
        }

    public static void main(String[] args) {
//      Line : 객체, line : 레퍼런스(참조해야하는 부분), new : 객체생성 연산자, Line() : 생성자
        Line line = new Line();

        // Circle1 circle1 = new Circle1();

        // Rectangle rectangle = new Rectangle();

        // Triangle triangle = new Triangle();

        paint(line); // line이 Shape p로 간다
//      paint : 메서드, () : 전달하는 매개변수
        paint(new Circle1()); // (new Circle1())를 Shape p로 보낸다 -> Shape p = new Circle1();(업캐스팅을 이용해서 객체생성)
        paint(new Rectangle());
        paint(new Triangle());
    }


}
