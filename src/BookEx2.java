public class BookEx2 {
    String title;
    String author;
    void show(){
        System.out.println((title + " " + author));
    }
    public BookEx2() {
        this(",");
        System.out.println("생성자 호출됨");
    }
    public BookEx2(String t) {
        this(t, "작자미상");
    }
    public BookEx2(String t, String a){
        title = t;
        author = a;
    }

    public static void main(String[] args) {
        BookEx2 littlePrince = new BookEx2("어린왕자", "생텍쥐페리");
        BookEx2 loveStory = new BookEx2("춘향전");
        BookEx2 emptyBook = new BookEx2();
        loveStory.show();
        System.out.println(littlePrince.title + " " + littlePrince.author);
        System.out.println(loveStory.title + " " + loveStory.author);
    }
}