package org.example;

public class SortingAlgorthm {
    public static void printArray(int no, int[] a){
        System.out.printf("%d: ", no);
        for (int i = 0; i< a.length; i++){
            System.out.printf("%d ", a[i]);
        }
        System.out.println();
    }

    // sap xep noi bot
    public static void bubbleSort(int[] a){
        int n = a.length;
        for( int i = 0; i<n; i++){
            boolean isSorted = true;
        for( int j = 0; j<n-i-1; j++) {
            if(a[j] > a[j+1])
            {
                isSorted = false;
             int t = a[j];
             a[j] = a[j+1];
             a[j+1] = t;

            }
        }
        printArray(i,a);
        if(isSorted){
            break;
        }
        }
    }
    // sap xep chen
    public  static void insertionSort(int[] a){
        int n = a.length;
        for (int i =1; i<n; i++){
            // chen a[i] vao day 0 -> i-1
            int ai = a[i];
            int j = i-1;
            while (j >=0 && a[j] > ai){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = ai;
            printArray(i,a);
        }

    }
    // sap xep chon
    public  static void selectionSort(int[]a){
        int n = a.length;
         for (int i=0; i< n; i++){
             int minIdex = i;
             for (int j = i+1; j<n; j++){
                 // Tim min[i,n]
                 if(a[j]<a[minIdex]){
                     minIdex =j;
                 }
             }
             if(minIdex !=1){
                 int t = a[i];
                 a[i] = a[minIdex];
                 a[minIdex] = t;

             }
              printArray(i,a);
         }
    }
    public static void main(String[] args) {
        int[] a ={5,3,2,7,8,1,2};
        selectionSort(a);

//        insertionSort(a);
//        int[] b ={1,2,3,4,5,7,6};
//        bubbleSort(b);






    }
    }
