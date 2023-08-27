package org.example;

import java.util.Arrays;

public class Vidu {
    public static void main(String[] args){
        String s ="Xin chao cac ban, tui la An";

        String[] a = s.split(" ");
        System.out.println(Arrays.toString(a));

        String[] b= s.split(", ");
        System.out.println(Arrays.toString(b));

        String s2 =" Xin chao, mk la An. Tui dang tu hoc lap trinh";
        String[] c = s2.split("\\.|\\,");
        System.out.println(Arrays.toString(c));

        String s3 =" Pham Ngoc Binh An";
        String[] d = s3.split(" ");
        System.out.println(Arrays.toString(d));
        System.out.println("Ten: "+d[d.length-1]);
    }
}
