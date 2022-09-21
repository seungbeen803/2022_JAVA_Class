package Vector;

import java.util.Vector;

class Point{
    private int x, y;
    public Point(int x, int y){ // 생성자
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "(" + x + "," + y + ")"; // toString 오버라이드(재정의)
    }
}
public class PointVectorEx {
    public static void main(String[] args) {
        // Point 객체를 요소로 갖는 벡터 생성
        // Point 객체를 요소로만 가지는 벡터 생성
        Vector<Point> pv = new Vector<Point>();
        
        // Point 객체 삽입
        // 객체 타입에 있는 생성자 사용
        pv.add(new Point(2, 3)); // 인덱스 0
        pv.add(new Point(-5, 20)); // 인덱스 1
        pv.add(new Point(30, -8)); // 인덱스 2
        
        // 지우기
        pv.remove(1); // 인덱스 1의 Point 객체 값 삭제

        // 기본형만 자동 언박싱이 가능하다
        // 기본형이 아니면 같은 객체로 맞춰줘야한다.
        // 벡터 값 출력
        // 벡터에 있는 Point 객체 모두 검색하여 출력
        for (int i = 0; i < pv.size(); i++) {
            Point p = pv.get(i); // 벡터에서 i 번째 Point 객체 얻어내기
            // p로 출력해도 상관없음
            System.out.println(p); // p.toString()을 이용하여 출력
        }
    }
}
