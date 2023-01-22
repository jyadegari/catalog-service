package jyad.catalogservice.domain;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(String isbn) {
        super("The boon with ISBN " + isbn + " was not found.");
    }
}
