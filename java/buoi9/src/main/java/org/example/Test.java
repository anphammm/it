package org.example;

public class Test {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(150,"Pham Binh On", "lop10",15) ;
        SinhVien sv2 = new SinhVien(200,"Pham Thi Minh Huong", "lop9",14);
        SinhVien sv3 = new SinhVien(199,"Pham Ngoc Binh An ", "lop8",13);


        System.out.println(sv1.compareTo(sv2));
        System.out.println(sv3.compareTo(sv1));
    }
}
