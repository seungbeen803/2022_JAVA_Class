package Vector;

import java.util.Vector;

// 주로 만든 클래스에서 실행하면 편하다
public class VectorEx {
    public static void main(String[] args) {
        // 정수 값만 다루는 제네릭 벡터 생성
        // 왼쪽 벡터 <>안에 타입 선언을 한다면 오른쪽 <>에는 작성하지않아도 된다.
        // 기본형
        Vector<Integer> v = new Vector<Integer>();
        
        // 총 14개가 됐을 때 20이 됨 10개 단위씩
        // 단위가 10개씩 나눠진다
        v.add(1); // 5 삽입 자동 박싱 Wrapper 클래스 자동 사용
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);
        v.add(6);
        v.add(7);
        v.add(8);
        v.add(9);
        v.add(10);
        v.add(11);
        v.add(12);
        v.add(13);
        // 컬렉션의 경우 위치에 값이 있다면 그 값을 밀어내고 삽입됨 5, 4, 100, -1 
        // 배열의 경우 5 4 100
        // 위치(인덱스), 넣고자 하는 요소
        // 컬렉션은 배열의 상위 개념
        v.add(2, 100);

        System.out.println("벡터내의 요소 객체 수 : " + v.size()); // 예상 4출력
        System.out.println("벡터의 현재 용량 : " + v.capacity());
        
        // 모든 요소 출력
        // 배열, 컬렉션을 출력하기 위해서는 반복문을 사용한다.
        for (int i = 0; i < v.size(); i++) { // 요소 수만큼 반복
            int n = v.get(i); // 자동 언박싱
            System.out.println(n);
        }
        // 벡터 내의 모든 정수 더하기
        int sum = 0;
        for (int i = 0; i < v.size(); i++) {
            int n = v.elementAt(i); // get, elemenAt 둘다 요소 값을 리턴, 차이없음
            sum += n;
        }
        System.out.println("벡터에 있는 정수의 합 : " + sum);
    }
}
