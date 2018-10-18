package com.company;

/**
 * Created by rd568 on 10/15/18.
 */
public class encrypt {

    //State vars
    public String word;
    public int encryptKey;
    public int greaterZ = (int)(Math.random() * 5);

    public encrypt(String kbInput){
        word = kbInput;
    }

    public int encryptionKey(int kbInput){
        encryptKey = kbInput;
        return encryptKey;
    }

    public String setEncryptKey(String kbInput){
        String d = "";
        String forReturn = "";
        for(int index = 0; index < kbInput.length(); index++){
            char caeserShift = (char)(kbInput.charAt(index) + encryptKey);
            System.out.println(caeserShift);
            if(caeserShift >= 'z'){
                d = d + (char)(word.charAt(index) - (26 - greaterZ));
                System.out.println(caeserShift + d);
                System.out.println("I don't know where the random symbols are coming from if userWord1 is greater than z");
                break;
            }
        }
        return forReturn;
    }

    public String setDecryptionKey(String kbInput){
        String forReturn = "";
        String d = "";
        for(int index = 0; index < kbInput.length(); index++){
            char caeserShift = (char)(kbInput.charAt(index) - encryptKey);
            System.out.println(caeserShift);
            if(caeserShift >= 'z'){
                d = d + (char)(word.charAt(index) - (26 - greaterZ));
                System.out.println(caeserShift + d);
            }
        }
        return forReturn;
    }





}
