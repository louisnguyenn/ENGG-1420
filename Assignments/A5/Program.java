public class Program {
    public static void main(String[] args) {
        Book myBook = new Book("i love programming", "Jungkook", 129, 2025, 50);
        System.out.println(myBook.getTitleInTitleCase());
        System.out.println(myBook.contains("coding"));
        System.out.println(myBook.contains("programming"));
        myBook.printAuthors();
    }
}
