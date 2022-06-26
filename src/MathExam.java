public class MathExam {
    public static void main(String[] args) {
        System.out.println("abs() 절대값");
        System.out.println(Math.abs(25));
        System.out.println(Math.abs(-25));
        System.out.println(Math.abs(25.5));
        System.out.println(Math.abs(-25.5));

        System.out.println("round() 반올림");
        System.out.println(Math.round(25));
        System.out.println(Math.round(25.3));
        System.out.println(Math.round(25.5));
        System.out.println(Math.round(-25.4));
        System.out.println(Math.round(-25.5));
        System.out.println(Math.round(-25.6));

        System.out.println("pow() 거듭제곱");
        System.out.println(Math.pow(3, 2));
        System.out.println(Math.pow(3.0f, 2.0f));
        System.out.println(Math.pow(5.0, 2));
        System.out.println(Math.pow(-5.0, 3.0));

        System.out.println("sqrt() 제곱근");
        System.out.println(Math.sqrt(9));
        System.out.println(Math.sqrt(9.0f));
        System.out.println(Math.sqrt(9.0));
        System.out.println(Math.sqrt(-9.0));

        System.out.println("random() 랜덤값");
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println((int)Math.random()*5); // 항상 0
        System.out.println((int)(Math.random()*5));
        System.out.println((int)(Math.random()*10));
        System.out.println((int)(Math.random()*100));
    }
}
