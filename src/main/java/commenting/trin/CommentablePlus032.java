package commenting.trin;

import util.trin.CommentPlus032;

import java.util.Iterator;
//        (10 points) a default "inspect999()" method that returns a String.
//                This method uses the iterator of its super-interface to iterate
//                over all comments, convert them to Strings, and returns
//                the concatenation of those Strings.
//???????????????????
public interface CommentablePlus032 extends Commentable{
    default String inspect032(){
        StringBuilder sb = new StringBuilder();
        while (this.iterator().hasNext()) {
            sb.append(this);
        }
        return sb.toString();
    }


}
