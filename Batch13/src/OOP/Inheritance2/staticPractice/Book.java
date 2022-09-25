package OOP.Inheritance2.staticPractice;

public class Book {

    String title;
    int pageCount = 200;
   static double price;

    public Book(String title, int pageCount, double price) {
        this.title = title;
        this.pageCount = pageCount;
        this.price = price;
    }

    public int getPageCount(){// if we use static keyword these are now totally different methods
                                // see 'NoteBook' class for the same overridden method and see the difference using static keyword
        System.out.println("Page not found");
        return 404;
    }
}
