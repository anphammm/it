package org.example;

public class bai4 {
    public boolean arrayStringsAreEqual(String[] arr1, String[] arr2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String r2 ="";
        for(String s : arr1) {
            sb1.append(s);
        }
        for (String s : arr2){
            sb1.append(s);
        }

        return sb1.toString().equals(sb2.toString());


    }
}