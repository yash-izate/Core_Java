package oops.test;

class Book {
    static int totalNoOfBooks;
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    static {
        totalNoOfBooks = 0;
    }

    {
        // object instantiation
        totalNoOfBooks++;
    }

    Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    Book(String isbn) {
        this(isbn, "Unknown", "Unknown");
    }

    static int getTotalBooks() {
        return totalNoOfBooks;
    }

    void borrowBook() {
        if (isBorrowed) {
            System.out.println("This Book is already borrowed !");
        } else {
            this.isBorrowed = true;
            System.out.println("Enjoy the book !");
        }
    }

    void returnBook() {
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed, Please leave a review !");
        } else {
            System.out.println("This book is already in the library !");
        }
    }

    public static void main(String[] args) {
        Book vlsi = new Book("1Z458", "ASIC Design", "A.D. Tijare");
        Book myBook = new Book("2Y123");
        System.out.println(Book.getTotalBooks());
//        myBook.borrowBook();
        vlsi.borrowBook();
        vlsi.returnBook();
        myBook.returnBook();

    }
}