package org.example;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {

            SinhVien sv1 = new SinhVien(150,"Pham Binh On", "lop10",15) ;
            SinhVien sv2 = new SinhVien(200,"Pham Thi Minh Huong", "lop9",14);
            SinhVien sv3 = new SinhVien(199,"Pham Ngoc Binh An ", "lop8",13);
        SinhVien sv4 = new SinhVien(208,"Pham Ngoc Binh  ", "lop7",10);

        SinhVien[] a_sv = new SinhVien[] {sv1, sv2,sv3};

            System.out.println(" ban dau:" + Arrays.toString(a_sv));
            // Ham sap xep
        Arrays.sort(a_sv);
        System.out.println(" sau  khi sap xep:" + Arrays.toString(a_sv));

        // Tim kiem
        System.out.println(" tim kiem An "+ Arrays.binarySearch(a_sv,sv3));
        System.out.println(" tim kiem An "+ Arrays.binarySearch(a_sv,sv4));


























//            System.out.println(sv1.compareTo(sv2));
//            System.out.println(sv3.compareTo(sv1));
        }
}
