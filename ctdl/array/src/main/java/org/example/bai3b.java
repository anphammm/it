package array.src.main.java.org.example;

public class bai3b {
    public static int firstUniqChar(String s) {
        char[] arr = s.toCharArray();
        int[] count = new int[123];

        for(int i=0; i< arr.length; i++){
            char c = arr[i];
            int index = (int)c;
            count[index]++;

        }
        for(int i=0; i< arr.length; i++) {
            char c = arr[i];
            int index = (int)c;
            if(count[index] == 1){
                return index;
            }


        }



        return -1;
    }







    public static void  main(String[] args){
        String s = " Loveleetcode";
System.out.println (firstUniqChar(s));;

    }
}
