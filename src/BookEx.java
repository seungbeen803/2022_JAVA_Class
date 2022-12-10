public class BookEx {
    String title;
    String author;
    public BookEx(String t) {
        title = t;
        author = "작자미상";
    }
    public BookEx(String t, String a) {
        title = t;
        author = a;
    }

    public static void main(String[] args) {
        BookEx littlePrince = new BookEx("어린왕자", "생텍쥐페리");
        BookEx loveStory = new BookEx("춘향전");
        System.out.println(littlePrince.title + " " + littlePrince.author);
        System.out.println(loveStory.title + " " + loveStory.author);
    }
}
