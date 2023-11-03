package task12_16;

import java.util.Comparator;

public class BookByTitleAuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int titleComparison = o1.getTitle().compareTo(o2.getTitle());
        if (titleComparison != 0) {
            return titleComparison;
        } else {
            return o1.getAuthor().compareTo(o2.getAuthor());
        }
    }
}
