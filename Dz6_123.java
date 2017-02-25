// Javacore / Tanchenko A.
/*
 * 1.         Дан массив из десяти целых чисел. Найти их сумму.
 * 2.         Дан массив из десяти целых чисел. Найти их произведение.
 * 3.         Дан массив из десяти целых чисел. Найти их среднее арифметическое.
 */

//import java.util.Scanner;
//import java.io.*;
import java.util.Arrays;

class Dz6_123 {
    
  static  int summArray(int[] arr) {
    int sum=0;
     for(int i = 0;i<=arr.length-1;i++){
       sum+=arr[i];
     }
    return sum;
  }
  
  static  int multArray(int[] arr) {
    int mult=1;
     for(int i = 0;i<=arr.length-1;i++){
       mult*=arr[i];
     }
    return mult;
  }
  
  static  int avrgArray(int[] arr) {
    int avrg=summArray(arr)/arr.length;
    return avrg;
  }
  
    public static void main(String[] args) {
      
    // Input user data block  
      int arr[] = {1,2,3,4,5,};
    ////////////////////////  
      
      System.out.println ("Summ of array elements "+Arrays.toString(arr)+" is : "+summArray(arr));
      System.out.println ("Mult of array elements "+Arrays.toString(arr)+" is : "+multArray(arr));
      System.out.println ("Average of array elements "+Arrays.toString(arr)+" is : "+avrgArray(arr));
      
   } 
 }
