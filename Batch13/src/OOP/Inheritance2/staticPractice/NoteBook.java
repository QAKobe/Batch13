package OOP.Inheritance2.staticPractice;

public class NoteBook extends Book {

    // double price;
    public NoteBook() {
        super("Novel", 500, 19.98);
    }

    public int getPageCount() {// if we use static method it'll make this method belong to this class
        System.out.println("Success");
        return 200;

    }

    public static void main(String[] args) {

        Book book = new Book("Dream", 100, 12);

        System.out.println(book.pageCount); // 100
        System.out.println("coming from Book " + book.getPageCount()); // 404

        NoteBook noteBook = new NoteBook();

        System.out.println("coming from NoteBook " + noteBook.pageCount); // 500 from super on top
        System.out.println("coming from Notebook " + noteBook.getPageCount()); // 404 from Book class's getPageCount method

        System.out.println(book.price); // static answer
        System.out.println(noteBook.price); // static answer from 'Book' class

        Book book2 = new Book("Game", 1000, 30);

        System.out.println(book2.price);// all the answers will be 30 because these are 'static double price;' from Book class
        System.out.println(noteBook.price); // static is changing the game
        System.out.println(book.price);// still 30 loop up

        System.out.println(book.pageCount);


    }
}
