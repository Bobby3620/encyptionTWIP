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

        //Where the user chooses encryption key -> Caeser Cipher
        int containKey;

        System.out.println("Please enter any number between 1-26");
        int key = kbInput.nextInt();

            if (key <= 26) {
                containKey = user1.encryptionKey(key);
            }
        System.out.println("Your encrypted word is ");
        System.out.print(user1.setEncryptKey(userWord1));

        //Where the user decides if they would like to decrypt it
        Scanner kbInput2 = new Scanner(System.in);
        System.out.println("Would you like to decrypt it?");
        String yesOrno = kbInput2.nextLine();

        if(yesOrno.equalsIgnoreCase("yes")){
            System.out.println("What is the decryption key(same as encryption key)");
            int decryptionKey = kbInput.nextInt();
                if(decryptionKey == key){
                    System.out.println("Your decrypted word is ");
                    System.out.print(user1.setDecryptionKey(userWord1).toLowerCase());
                }
        }
        else if(yesOrno.equalsIgnoreCase("no")){
            System.out.println("Okay, goodbye!");
        }






    }
}
