public class ValueofExam {
    public static void main(String[] args) {
        char ch = 'A'; // 문자
        String strData1 = "A"; // 문자열
        String strData2;
        strData2 = String.valueOf(ch); // 문자 A를 문자열로 변경
        if(strData1.equals(ch))
            System.out.println("같음");
        else
            System.out.println("다름");

        if(strData1.equals(strData2))
            System.out.println("같음");
        else
            System.out.println("다름");
    }
}
