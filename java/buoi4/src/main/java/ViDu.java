
import java.util.Scanner;

public class ViDu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println(" Nhap Vao CHuoi");
        s = sc.nextLine();
        System.out.println("----");

        // Ham Length() => lau do dai chuoi
        System.out.println(s.length());
        int doDai = s.length();

        //Ham charAt(vi tri) => lay ra 1 ky tu tai vi ti
        for(int i = 0; i<doDai;i++){
            System.out.println("Vi Tri "+i+"la:"+s.charAt(i));

            //Ham getChars(vi tri bat dau, vi tri ket thuc
            //Mang luu du lieu, vi tri bat dau luu mang
            char[] arrayChar = new char[100];
            s.getChars(2,4,arrayChar,0);
            for (i = 0; i < arrayChar.length; i++) {
                System.out.println("Gia tri mang tai" + i + "la:" + arrayChar[i]);
            }

//            for (int i=0; i< arrayChar.length; i++){
//                System.out.println("Gia tri mang tai"+i+"la:"+arrayChar[i]);
//            }
            //HAm getBytes => co 3 cach, lay ra gia tri cua cac ky tu thanh mot manh
            byte[] arrayBytes = s.getBytes();
            for (byte b: arrayBytes){
                System.out.println(b);
            }
        }
    }
    }

