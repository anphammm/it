package org.example;

public class bai1c {

    public static int removeElement(int[] a, int val) {
        int n = a.length;
        for(int i = 0; i<n; i++){
            if(a[i] == val ){
                //Xoa phan tu a[i]
                for (int j = i; j <= (n-2);i++){
                    a[j] = a[j+1];
                }
                n--;
            }
            else {// ko phai xoa
                i++;
            }
        }





        return n;
    }
    public static void main(String[]args){
        int[] a= {3,2,2,3};
        System.out.println(removeElement(a,2));
        System.out.println("Done");

    }
}
