import java.util.Locale;

public class ToStringRExam {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("java  Programming");
        String str = null;
        str = sb1.toString();
        System.out.println("str.toUpperCase = " + str.toUpperCase()); // str.toUpperCase = JAVA  PROGRAMMING
    }
}
