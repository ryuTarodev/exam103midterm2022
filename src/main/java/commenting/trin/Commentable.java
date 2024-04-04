package commenting.trin;

import java.util.Collection;
import java.util.Iterator;
import util.trin.*;


public interface Commentable extends Iterable<CommentPlus032> {
    default boolean addComment(String message) { return addComment(message, null); }
    boolean addComment(String message, Grade032 grade);
    boolean removeComment(String message);
    Iterator<CommentPlus032> iterator();
    Collection<String> extract(Grade032 grade);
    void sort();
}
