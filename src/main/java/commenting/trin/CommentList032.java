package commenting.trin;

import util.trin.Comment;
import util.trin.CommentPlus032;
import util.trin.Grade032;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.stream.Collectors;

import static util.trin.CommentPlus032.match032;

public class CommentList032 implements CommentablePlus032 {
    private final LinkedList<CommentPlus032> comments032 = new LinkedList<>();

    @Override
    public boolean addComment(String message) {
        return false;
    }

    @Override
    public boolean addComment(String message, Grade032 grade) {
        if (message == null) {
            return false;
        }
        return comments032.add(new CommentPlus032(message, grade));
    }

    @Override
    public boolean removeComment(String message) {
        if (message == null) {
            return false;
        }


     return comments032.removeIf( commentPlus -> commentPlus.toString().contains(message));
    }

    @Override
    public Iterator<CommentPlus032> iterator() {
        return comments032.iterator();
    }

    @Override
    public void sort() {
        comments032.sort(CommentPlus032.GRADE032_COMPARATOR);
    }

    @Override
    public String toString() {
        return "CommentList032{" +
                "comments032=" + comments032 +
                '}';
    }

    @Override
    public Collection<String> extract(Grade032 grade) {
        return comments032.stream()
                .filter(match032(grade))
                .map(Comment::toString)
                .collect(Collectors.toList());


    }
}
