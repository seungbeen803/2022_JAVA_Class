public class Book {
    String title; // 제목
    String author; // 작가
    
    void show() { // 단순 출력, 제목과 작가를 출력
        System.out.println(title + " " + author);
    }

    public Book() { // 매개변수가 없는 생성자, 매개변수가 2개 있는 생성자를 호출
        this("공백", "공백");
        System.out.println("생성자 호출됨"); // 생성자 호출됨 이라고 출력
    }

    public Book(String title) { // 제목을 입력하여 객체 생성 작가를 모를 경우 사용
        this(title, "작자미상");
    }

    public Book(String title, String author) { // 다 알 경우에 작성
        this.title = title;
        this.author = author;
    }
    
    public static void main(String[] args) {
        // 제목과 작가를 아는 경우 객체 생성
        Book littlePrince = new Book("어린왕자", "생텍쥐페리");
        Book loveStory = new Book("춘향전"); // 제목만 아는 경우
        Book emptyBook = new Book(); // 제목 작가 둘다 모르는 경우
        littlePrince.show();
        loveStory.show();
        emptyBook.show();
    }
}
