class Point {
    private int x, y;

    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void showPoint() { // 점의 좌표 출력
        System.out.println("(" + x + "," + y + ")");
    }
}

class ColorPoint extends Point {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }
    public void showColorPoint() {
        System.out.println(color);
        showPoint(); // Point 클래스의 showPoint() 호출
    }
}
public class ColorPointEx {
    public static void main(String[] args) {
        Point p = new Point(); // Point 객체 생성
        p.set(1, 2);
        p.showPoint(); // 좌표 출력
        
        ColorPoint cp = new ColorPoint();
        cp.set(3, 4);
        cp.setColor("red");
        cp.showColorPoint(); // 컬러와 좌표를 출력
    }

}
