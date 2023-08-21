package org.example;

public class bai3 {
    public static void xinchaomn(String s) {
        if(s.equals("BB")){
            System.out.println("Xin chao Moi ng");
        }else{
            System.out.println("Xin chao ... a");
        }
    }
    public static void main(String[] args) {
        String s = " Hello World! 2612";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c) == true) {
                System.out.print(c + " ");
            }
        }

        char myChar = 'B';
        System.out.println("\n" + myChar + " co ma ascii la: " + (int) myChar);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                System.out.print(c + " ");


            }
        }

        String s1 ="Hello";
        String s2 ="Hello";
        String s3 = new String("hello");
        System.out.println("s1 == s2:  "+ (s1 == s2));
        System.out.println("s2 == s3:  "+ (s2 == s3));
        System.out.println("s1 == s3:  "+ (s1 == s3));


        System.out.println("s1.equals(s2):  "+ (s1.equals(s2)));
        System.out.println("s2.equals(s3):  "+ (s2.equals(s3)));
        System.out.println("s1.equals(s3):  "+ (s1.equals(s3)));

        String k1 ="BB";
        String k2 = new String("BB");
        xinchaomn(k1);
        xinchaomn(k2);

    }
}
