package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Where objects exist
        encrypt user1;

        //Where the user is asked to input a word
        Scanner kbInput = new Scanner(System.in);
        System.out.println("Please input a word for encryption");
        String userWord1 = kbInput.nextLine();
        user1 = new encrypt(userWord1);

















        //testing
        String cool = "dlso";
        char[] chars = cool.toCharArray();
        System.out.println(chars);



    }
}
