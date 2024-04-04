package util.trin;

import java.util.Comparator;
import java.util.function.Predicate;


public class CommentPlus032 extends Comment{

    private final Grade032 grade032;

    public static final Comparator<CommentPlus032> GRADE032_COMPARATOR
            = Comparator.comparing(g -> g.grade032);
//TODO:    (g1, g2) -> g1.grade032.compareTo(g2.grade032);

    public static Predicate<CommentPlus032> match032(Grade032 grade){
        return (CommentPlus032 commentPlus032) -> grade.equals(commentPlus032.grade032);
    }

    public CommentPlus032(String message, Grade032 grade032) {
        super(message == null ? message = "NO_COMMENT" : message);
        this.grade032 = grade032 == null ? Grade032.NONE : grade032;
    }

    @Override
    protected String getContent() {
            return super.getContent() + " [" + grade032 + "]";
    }


}
