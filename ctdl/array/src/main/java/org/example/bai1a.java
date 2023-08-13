package org.example;

public class bai1a {
    public static int findNumbers(int[] nums) {
        int bienDiem =0;
        for (int a : nums) {
            // ktra so chu so cua a
            // neu so chu so la chan => tang bien dem len 1
            int soLgChuSo = tinhSoChuSo(a);
            if (soLgChuSo % 2 == 0) {
                bienDiem++;

            }
        }
return bienDiem;
    }
    private  static  int tinhSoChuSo(int a){
        int bienDem = 0;
        int kq =a;
        while(kq != 0){
            kq = a/10;
            a = kq;
            bienDem++;

        }
        return bienDem;

    }

    public static void main(String[] args) {
        int[] nums = {1, 22, 34, 4444};
        int[] n2 = new int[4];
//        System.out.println(tinhSoChuSo(1));
//        System.out.println(tinhSoChuSo(99));
//        System.out.println(tinhSoChuSo(345));
        System.out.println(findNumbers(nums));


//        n2[0] = 4; // = 4-0 | n2.length -i
//        n2[1] = 3;// = 4-1  | n2.length -i
//        n2[2] = 2;// = 4-2  | n2.length -i
//        n2[3] = 1;// = 4-3  | n2.length -i
//
//
//        for (int ai : n2) {
//            System.out.println("ai =" + ai);
//        }
//        for (int i = 0; i < n2.length; i++) {
//            n2[i] = n2.length - i;
////            System.out.println("a[i] = "+nums[i]);
//        }
//        for (int i = 0; i < n2.length; i++) {
//
////            System.out.println("a[i] = "+nums[i]);
//        }

    }
    }

