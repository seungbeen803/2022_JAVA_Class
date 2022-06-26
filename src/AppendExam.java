public class AppendExam {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer(" JAVA Programming");
        StringBuffer sb2 = new StringBuffer(" Project");
        StringBuffer str1 = null; // 문자열은 반드시 초기화 해야 한다. -> 범위를 얼마만큼의 공간을 할당해야하는지 모르므로 반드시 초기화 시켜야함
        StringBuffer str2 = null; // 문자열은 반드시 초기화 해야 한다.
        str1 = sb1.append(" Project"); // sb1 = JAVA Programming Project
        System.out.println("str1 = " + str1);
        str2 = sb1.append(sb2); // str2 = JAVA Programming Project Project

        System.out.println("sb1 = " + sb1); // sb1 =  JAVA Programming Project Project
        System.out.println("sb2 = " + sb2); // sb2 =  Project
        System.out.println("str1 = " + str1); // str1 =  JAVA Programming Project Project, append() 메서드는 주소값을 전달
        System.out.println("str2 = " + str2); // str2 =  JAVA Programming Project Project
        System.out.println();
    }
}
