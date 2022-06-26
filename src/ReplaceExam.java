public class ReplaceExam {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("java Programming");
        StringBuffer sb2 = null;
        // start ~ end - 1까지의 숫자로 지정
        sb2 = sb1.replace(0, 4, "JAVA");
        System.out.println("sb2 = " + sb2); // sb2 = JAVA Programming
    }
}
