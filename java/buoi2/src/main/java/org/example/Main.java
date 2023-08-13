package org.example;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Test cau a:");
        MayTinhCasiofx500 mfx500 = new MayTinhCasiofx500();
        MayTinhVinaca1500 mvm500 = new MayTinhVinaca1500();
        System.out.println("5+3= " + mfx500.cong(5.0, 3.0));
        System.out.println("5*4= " + mvm500.nhan(5.0, 4.0));
        System.out.println("4/0= " + mvm500.chia(4.0, 0.0));
        System.out.println("Test cau b:");
        double[] arr1 = new double[]{5.0, 2.0, 3.0, 6.0, 8.0, 7.0, 0.0};
        double[] arr2 = new double[]{4.0, 6.0, 3.0, 1.0, 2.0, 9.0, 4.0};
        SapXepChen sxc = new SapXepChen();
        SapXepChon sxcn = new SapXepChon();
        sxc.sapXepTang(arr1);

        int i;
        for(i = 0; i < arr1.length; ++i) {
            System.out.print(arr1[i] + " ");
        }

        System.out.print("         ");
        sxcn.sapXepGiam(arr2);

        for(i = 0; i < arr2.length; ++i) {
            System.out.print(arr2[i] + " ");
        }

        System.out.print("         ");
        System.out.println(" Test cau c");
        PhanMenMayTinh pmmt = new PhanMenMayTinh();
        System.out.println("3+5= " + pmmt.cong(3.0, 5.0));
        double[] arr3 = new double[]{6.0, 2.0, 7.0, 9.0, 2.0, 4.0, 5.0};
        pmmt.sapXepTang(arr3);

        for(i = 0; i < arr3.length; ++i) {
            System.out.println("" + arr3[i]);
        }

    }
}