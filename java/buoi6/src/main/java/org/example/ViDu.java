package org.example;

public class ViDu {
    public static void main(String[]args){
        String s1 = " Xin Chao Co Chu, Xin Chao Cac Ban, Xin Chao!";
        String s2 = " Xin Chao";
        String s3 = " Xin Chao 123";
        char c1 = 'o';

        // Ham indeexOf
        System.out.println(" Vi tri cua s2 trong s1 la: "+s1.indexOf(s2));
        System.out.println(" Vi tri cua s3 trong s1 la: "+s1.indexOf(s3));

        // su dung vi tri bat dau
        System.out.println(" Vi tri cua s2 trong s1 la: "+s1.indexOf(s2,2));

        // Tim kiem char
        System.out.println(" Vi tri cua c1 trong s1 la: "+s1.indexOf(c1 ));
        System.out.println(" Vi tri cua c1 trong s1 la: "+s1.indexOf(s1, 20));

        // Ham lastIndexof => tim kiem tu phai sang trai
        System.out.println("Vi tri cua s2 trong s1  (tu phai sanag trai)");

        // tenFile ="bai tap.excel.lop10.xls"
    }

}
