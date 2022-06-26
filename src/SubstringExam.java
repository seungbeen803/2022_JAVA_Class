public class SubstringExam {
    public static void main(String[] args) {
//        전체 선택 ctrl + alt + shift + J
        String strData1 = "I Love You";
        String strData3;
        strData3 = strData1.substring(7); // start만 생김
        System.out.println("strData.substring(7) -> " + strData3); // You

        strData3 = strData1.substring(2, 5); // start 지점 ~ end - 1 지점까지
        System.out.println("strData.substring(2, 5) -> " + strData3); // Lov
    }
}
