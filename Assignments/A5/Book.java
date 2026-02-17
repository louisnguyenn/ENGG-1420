public class Book {
    private String title;
    private String authorName;
    private int numPages;
    private int yearPublished;
    private int price;

    //    default constructor without parameters
    public Book() {
        this.title = "";
        this.authorName = "";
        this.numPages = 0;
        this.yearPublished = 0;
        this.price = 0;
    }

    //     constructor with given parameters
    public Book(String title, String authorName, int numPages, int yearPublished, int price) {
        setTitle(title);
        setAuthorName(authorName);
        setNumPages(numPages);
        setYearPublished(yearPublished);
        setPrice(price);
    }

    void setTitle(String title) {
        this.title = title;
    }

    void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    void setNumPages(int numPages) {
        if (numPages > 0) {
            this.numPages = numPages;
        }
    }

    void setYearPublished(int yearPublished) {
        if (yearPublished > 0) {
            this.yearPublished = yearPublished;
        }
    }

    void setPrice(int price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public String getTitleInTitleCase() {
        StringBuilder titleCase = new StringBuilder();

        for (int i = 0; i < this.title.length(); i++) {
            char ch = title.charAt(i);

            if (i == 0 || this.title.charAt(i - 1) == ' ') {
                titleCase.append(Character.toUpperCase(ch));
            } else {
                titleCase.append(Character.toLowerCase(ch));
            }
        }

        return titleCase.toString();
    }

    public boolean contains(String other) {
        for (int i = 0; i < this.title.length(); i++) {
            if (i == 0 || this.title.charAt(i - 1) == ' ') {
                StringBuilder word = new StringBuilder();

                while (i < this.title.length() && this.title.charAt(i) != ' ') {
                    word.append(this.title.charAt(i));
                    i += 1;
                }

                if (other.equalsIgnoreCase(word.toString())) {
                    return true;
                }
            }
        }

        return false;
    }

    public void printAuthors() {
        System.out.println(this.authorName);
    }
}
