public class ViDu {
    public static void main(String[]args){
        String s1 ="Binhan.ut";
        String s2 ="binhan.ut";
        String s3 ="Binhan.ut";

        //Ham equals => ss 2 chuoi khac nhau, cos phan biet hoa thuong
        System.out.println("s1 euquals s2:"+s1.equals(s2));
        System.out.println("s1 euquals s3:"+s1.equals(s3));

        // Ham equalsIgnoreCase, ss 1 chuoi giong nhau, ko phan biet hoa thuong
        System.out.println("s1 equalsIgnoreCase s2:"+s1.equalsIgnoreCase(s2));
        System.out.println("s1 equalsIgnoreCase s3:"+s1.equalsIgnoreCase(s3));

        // Ham CompareTo => ss < > =
        String sv1 ="Nguyen Van A";
        String sv2 ="Nguyen Van B";
        String sv3 ="Nguyen Van";
        String sv4 ="Nguyen Van A";

        System.out.println(("sv1 compareTo sv2:"+ sv1.compareTo(sv2)));
        System.out.println(("sv1 compareTo sv4:"+ sv1.compareTo(sv4)));
        System.out.println(("sv1 compareTo sv3:"+ sv1.compareTo(sv3)));

        //Ham compareToIgnoreCase => Tuong tu ham CompareTo, ko phan biet chu hoa chu thuong

        // Ham regionMatches => ss 1 doan
        String r1 ="BINHAN.ut";
        String r2 ="BAN.u";
        boolean check = r1.regionMatches(2,r2,0,4);
        System.out.println(check);

        // Ham starWith => Ham ktra chuoi bat dau hang....
        String sdt = "038902217";
        System.out.println(sdt.startsWith("038"));
        System.out.println(sdt.startsWith("034"));

        // Ham endWith => ham ktra chuoi ket thuc =.....
        String ten1 ="I love.NP";
        String ten2 ="Hoc JAva.PDF";

        if (ten2.endsWith(".NP")){
            System.out.println("File 1 la hinh anh");
        }else if (ten2.endsWith(".PDF")){
            System.out.println("File 1 la file PDF");
        }
    }
}
