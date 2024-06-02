



public class LibraryService {
    private Library library;

    public LibraryService(Library library) {
        this.library = library;
    }

    public void addBook(String title, String author) {
        library.addBook(new Book(title, author));
    }

    public void listBooks() {
        for (Book book : library.getBooks()) {
            System.out.println(book);
        }
    }
}
