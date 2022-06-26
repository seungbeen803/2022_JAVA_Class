abstract class Calculator { // 추상 클래스
    // 추상메서드는 중괄호 없이 세미콜론(;)으로 마감
    public abstract int add(int a, int b);
    public abstract int subtract(int a, int b);
    public abstract double average(int[] a);
    // 추상 메서드 -> 상속 받은 서브클래스(자식) 꼭 재정의 해서 사용
}

public class GoodCalc extends Calculator {
    @Override
    public int add(int a, int b) { // 추상 메서드 구현
        return a + b;
    }

    @Override
    public int subtract(int a, int b) { // 추상 메서드 구현
        return a - b;
    }

    @Override
    public double average(int[] a) { // 추상 메서드 구현
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum/a.length;
    }
    public static void main(String[] args) {
        GoodCalc c = new GoodCalc();
        System.out.println(c.add(2, 3));
        System.out.println(c.subtract(2, 3));
        System.out.println(c.average(new int[]{2, 3, 4}));
    }
}
