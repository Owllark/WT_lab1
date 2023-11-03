package task12_16;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookTest extends Book {
    private Book book1;
    private Book book2;
    private Book book3;

    public void setUp() {
        book1 = new Book("Book1", "Author1", 100, "123abc");
        book2 = new Book("Book2", "Author2", 100, "123abc");
        book3 = new Book("Book2", "Author2", 100, "123abc");
    }

    @Test
    public void testToString() {
        Book bookActual = new Book("Book1", "Author1", 100, "123abc");
        String expectedString = "\"Book1\", Author1, 19, 100";
        assertEquals(expectedString, bookActual.toString());
    }

    @Test
    public void testEquals() {
        setUp();
        assertEquals(book2, book3);
        assertNotEquals(book1, book2);
    }

    @Test
    public void testHashCode() {
        setUp();
        assertEquals(book2.hashCode(),book3.hashCode());
        assertNotEquals(book1.hashCode(),book2.hashCode());
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        Book originalBook = new Book("Title", "Author", 1234, "1a2b3c");

        Book clonedBook = (Book) originalBook.clone();

        assertNotSame(originalBook, clonedBook);

        assertEquals(originalBook.getTitle(), clonedBook.getTitle());
        assertEquals(originalBook.getAuthor(), clonedBook.getAuthor());
        assertEquals(originalBook.getPrice(), clonedBook.getPrice());
        assertEquals(originalBook.getEdition(), clonedBook.getEdition());
        assertEquals(originalBook.getIsbn(), clonedBook.getIsbn());
    }

    @Test
    public void testSort(){
        List<Book> testListOfBooks = new ArrayList<>();
        testListOfBooks.add(new Book("Book", "Author1", 15, "1aaaa"));
        testListOfBooks.add(new Book("Book", "Author2", 30, "32bbb"));
        testListOfBooks.add(new Book("Book", "Author3", 8, "222ee"));
        Collections.sort(testListOfBooks);
        assertEquals(testListOfBooks.get(0).getIsbn(),"1aaaa");
        assertEquals(testListOfBooks.get(1).getIsbn(),"222ee");
        assertEquals(testListOfBooks.get(2).getIsbn(),"32bbb");
    }
}