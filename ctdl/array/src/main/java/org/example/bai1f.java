package org.example;

public class bai1f {
    public static int maximumWealth(int[][] a) {
        int soKhachHang = a.length;
        int soNganHang = a[0].length;
        int max = 0; // max phai dc gan = gia tri nho nhat


        for (int i = 0; i < soKhachHang; i++) {
            int tinhTongHangI = 0;
            for (int j = 0; j < soNganHang; j++) {
                tinhTongHangI += a[i][j];

            }
            if (tinhTongHangI > max) {
                max = tinhTongHangI;
            }
        }

        return max;
    }
}

//    public static void main(String[] args) {
//        int[][] a = {{1, 2, 3}, {3, 2, 1}};
//        int[][] b = {{1,5},{7,3},{3,5}};
//      System.out.println(  maximumWealth(b));
//
//    }
//}
//







//    public  int maximumWealth(int[][] a) {
//        int soKhachHang = a.length;
//        int soNganHang = a[0].length;
//        int[] tongTaiSan = new int[soKhachHang];
//
//        for (int i = 0; i < soKhachHang; i++) {
//            int tinhTongHangI = 0;
//            for (int j = 0; j < soNganHang; j++) {
//                tinhTongHangI += a[i][j];
//
//            }
//            tongTaiSan[i] = tinhTongHangI;
//        }
//        int max =0; // max phai dc gan = gia tri nho nhat
//        for (int i = 0; i < soKhachHang; i++) {
//            System.out.println("Tongtaisan KH" + i + ":" + tongTaiSan[i]);
//            if (tongTaiSan[i]>max){
//                max = tongTaiSan[i];
//            }
//        }
//
//        return max;
//    }
