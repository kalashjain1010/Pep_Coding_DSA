/*1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are required to find the span of input. Span is defined as difference of maximum value and minimum value. */
import java.io.*;
import java.util.*;

public class spamOfArray {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr;
        arr = new int[n];
        
    
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int ans;
        int max=arr[0];
        int min=arr[0];
       for (int i = 0; i < arr.length; i++) {
    
           if (max<arr[i]) {
               max=arr[i];
           } 
    
           if(min>arr[i]){
               min=arr[i];
           }
        }
        ans = max-min;
        System.out.println(ans);
     }
}
