import java.util.StringTokenizer;

public class dataValueExam {
    public static void main(String[] args) {
        String line;
        String tmpStr = "hong 용산구 10.5 20.5";
        StringTokenizer parse = new StringTokenizer(tmpStr); // 띄어쓰기를 기준으로 Token 생성
        String name;
        String address;
        double math;
        double english;
        double total;
        double avg;
        // index 값이 없는 배열이라고 생각!
        name = parse.nextToken(); // name에 Token을 리턴하면 hong이 나온다
        address = parse.nextToken();
        // valueOf() -> String형 타입에서, Wrapper형 데이터로 변환 시켜줌
        // parsse.nextToken() -> 기본 데이터 타입
        math = Double.valueOf(parse.nextToken()).doubleValue();
        // valueOf가 String -> Wrapper
        // doubleValue Wrapper -> 기본 타입
        english = Double.valueOf(parse.nextToken()).doubleValue();
        total = math + english;
        avg = total/2.0;
        System.out.println(name + "\t" + address + "\t" + math + "\t" + english + "\t" + total + "\t" + avg);
    }
}
