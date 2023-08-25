
    package org.example;







    public class SinhVien  implements Comparable<org.example.SinhVien>{
        private int maSinhVien;
        private  String hoVaTen;
        private String tenLop;
        private double diemTrungBinh;
        public  SinhVien(int maSinhVien, String hoVaTen,String tenLop, double diemTrungBinh){

            this.diemTrungBinh = maSinhVien;
            this.maSinhVien = maSinhVien;
            this.hoVaTen = hoVaTen;
            this.tenLop = tenLop;

        }

        public int getMaSinhVien() {
            return maSinhVien;
        }

        public void setMaSinhVien(int maSinhVien) {
            this.maSinhVien = maSinhVien;
        }

        public double getDiemTrungBinh() {
            return diemTrungBinh;
        }

        public void setDiemTrungBinh(double diemTrungBinh) {
            this.diemTrungBinh = diemTrungBinh;
        }

        public String getTenLop() {
            return tenLop;
        }

        public void setHoVaTen(String hoVaTen) {
            this.hoVaTen = hoVaTen;
        }

        public String getHoVaTen() {
            return hoVaTen;
        }

        public void setTenLop(String tenLop) {
            this.tenLop = tenLop;
        }
        public String getTen() {
            String s = this.hoVaTen.trim();
            if(s.indexOf(" ")>=0) {
                int vt = s.lastIndexOf(" ");
                return s.substring(vt+1);
            }else {
                return s;
            }
        }
@Override
public  String toString(){
            return " Sinh Vien [maSinhVVien="+ maSinhVien+", hoVaTen= "+ hoVaTen
                    +",diemTrungBinh= " + diemTrungBinh+"]";
}
        @Override
        public int compareTo(org.example.SinhVien o) {
            // <0
            //=0
            //>0
            // dua tren so sanh ten
            // Ten: Binh An; BeNa
            String tenThis = this.getTen();
            String ten0 =o.getTen();
            return tenThis.compareTo(ten0);
        }
    }

//
//    public class SinhVien {
//        public static void main(String[] args) {
//            SinhVien sv1 = new SinhVien(150,"Pham Binh On", "lop10",15) ;
//            SinhVien sv2 = new SinhVien(200,"Pham Thi Minh Huong", "lop9",14);
//            SinhVien sv3 = new SinhVien(199,"Pham Ngoc Binh An ", "lop8",13);
//
//
////            System.out.println(sv1.compareTo(sv2));
////            System.out.println(sv3.compareTo(sv1));
//        }
//    }