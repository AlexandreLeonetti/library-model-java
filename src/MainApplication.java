public class MainApplication {
    public static void main(String[] args) {
        Library library = new Library();
        LibraryService libraryService = new LibraryService(library);

        libraryService.addBook("1984", "George Orwell");
        libraryService.addBook("To Kill a Mockingbird", "Harper Lee");

        libraryService.listBooks();
    }
}
