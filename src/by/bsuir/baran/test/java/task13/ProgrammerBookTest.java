package task13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgrammerBookTest extends ProgrammerBook {

    @Test
    public void testEquals() {
        ProgrammerBook book1 = new ProgrammerBook("Book1","Author1",25,"abc","Java",2);

        ProgrammerBook book2 = new ProgrammerBook("Book2","Author2",15,"abc","C",1);

        ProgrammerBook book3 = new ProgrammerBook("Book1","Author1",25,"abc","Java",2);

        assertEquals(book1, book3);
        assertNotEquals(book1, book2);
    }

    @Test
    public void testToString() {
        ProgrammerBook book = new ProgrammerBook("Book","Author",15,"abc","C",1);

        String expected = "(\"Book\", Author, 19, 15), C, 1";
        assertEquals(expected, book.toString());
    }

    @Test
    public void testHashCode() {
        ProgrammerBook book1 = new ProgrammerBook("Book1","Author1",25,"abc","Java",2);

        ProgrammerBook book2 = new ProgrammerBook("Book2","Author2",15,"abc","C",1);

        ProgrammerBook book3 = new ProgrammerBook("Book1","Author1",25,"abc","Java",2);

        assertEquals(book1.hashCode(), book3.hashCode());
        assertNotEquals(book1.hashCode(), book2.hashCode());
    }
}