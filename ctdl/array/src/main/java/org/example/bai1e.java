package org.example;

public class bai1e {
    public   int removeElement(int[] a, int x) {
        int k =0;
for (int i = 0; i<a.length; i++){
    if (a[i] !=x){
        a[k] = a[i];
        k++;
    }
}
return k;
    }


        }

