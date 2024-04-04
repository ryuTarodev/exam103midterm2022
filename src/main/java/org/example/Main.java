package org.example;

import commenting.trin.CommentList032;
import util.trin.Comment;
import util.trin.CommentPlus032;
import util.trin.Grade032;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        testCommentPlus();
        System.out.println("=====================");
        testCommentList();

    }
    static void  testCommentPlus(){
        CommentPlus032 commentPlus = new CommentPlus032("ko dee", Grade032.AVERAGE);
        CommentPlus032 commentPlus2 = new CommentPlus032("ko dee", null);
        CommentPlus032 commentPlus3 = new CommentPlus032(null, null);
        System.out.println(commentPlus);
        System.out.println(commentPlus2);

    }
    static void testCommentList(){
        CommentList032 commentList = new CommentList032();
        commentList.addComment("dee");
        commentList.addComment("keng", Grade032.GOOD);
        commentList.addComment("krang", Grade032.AVERAGE);
        System.out.println(commentList);
        System.out.println(commentList.removeComment("krang"));

        System.out.println("was remove "+ commentList);
        commentList.addComment("mid", Grade032.AVERAGE);
        commentList.addComment("ad", Grade032.GOOD);
        commentList.addComment("sd", Grade032.POOR);
        System.out.println(commentList);
        commentList.sort();
        System.out.println(commentList);
        System.out.println(commentList.extract(Grade032.GOOD));
//        System.out.println(commentList.inspect032());
    }
}