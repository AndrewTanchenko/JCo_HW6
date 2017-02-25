// Javacore / Tanchenko A.
/*
 * 4. Дано целое число K и массив из десяти целых ненулевых чисел. Вывести номер первого числа в массиве, большего K. Если таких чисел нет, то вывести 0.
 * 5. Дано целое число K и массив из десяти целых ненулевых чисел. Вывести номер последнего числа в массиве, большего K. Если таких чисел нет, то вывести 0.
 * 6. Дано вещественное число B, целое число N и массив из N целых чисел, упорядоченных по возрастанию. Вывести элементы массива вместе с числом B, сохраняя упорядоченность выводимых чисел.
 * 7. Дано целое число N и массив из N целых чисел, упорядоченный по возрастанию. Данный набор может содержать одинаковые элементы. Вывести в том же порядке все различные элементы данного массива.
 */

//import java.util.Scanner;
//import java.io.*;
import java.util.Arrays;

class Dz6_4567 {
    
  static  int compareArrayValueLtoR(int[] arr, int k) {
    int j=0;
     for(int i = 0;i<=arr.length-1;i++){
       if(arr[i]>k){j=i+1;break;};
     }
    return j;
  }
  
  static  int compareArrayValueRtoL(int[] arr, int k) {
    int j=0;
     for(int i = arr.length-1;i>=0;i--){
       if(arr[i]>k){j=i+1;break;};
     }
    return j;
  }

  static  boolean checkArrayOrder(int[] arr) {
    boolean fl_=true;
     for(int i = 1;i<arr.length;i++){
       if(arr[i]<arr[i-1]){fl_=false;break;};
     }
    return fl_;
  }

  static  int getArrayIndex(int[] arr, double k) {
    int i=0,l=0,r=arr.length-1;
    if(checkArrayOrder(arr)){
     while(r-l>1){
       i=(r+l)/2;
       //System.out.println (""+i);
       if(arr[i]==k){l=i;break;}
       if(arr[i]>k){r=i;}
       else{l=i;};
     }
    }
    return l;
  }
  
  static  String getArrayUpd(int[] arr, double k) {
    String strArr="";
    int i_k=getArrayIndex(arr,k);
     for(int i=0;i<arr.length;i++){
       strArr+=arr[i]+" ";
       if(i==i_k){strArr+=k+" ";}
     }
    return strArr;
  }
  
  static  String getArrayUniqVal(int[] arr) {
    String strArr=""+arr[0]+" ";
     for(int i=1;i<arr.length;i++){
       if(arr[i]!=arr[i-1]){strArr+=arr[i]+" ";}
     }
    return strArr;
  }
  
    public static void main(String[] args) {
      
    // Input user data block  
      int arr[] = {1,2,3,2,3,5,4,7,6,2};
      int arr1[] = {1,2,3,4,5,6,7,8,9,10};
      int arr2[] = {1,1,2,4,5,6,7,7,9,10};
      int k=3;
      double k1=3.5;
    ////////////////////////  
      
      System.out.println ("Index of element > "+k+" from L to R in "+Arrays.toString(arr)+" is : "+ compareArrayValueLtoR(arr,k));
      System.out.println ("Index of element > "+k+" from R to L in "+Arrays.toString(arr)+" is : "+ compareArrayValueRtoL(arr,k));
      System.out.println ("Print "+k1+" into array --> "+Arrays.toString(arr1)+" UpdArray : "+ getArrayUpd(arr1,k1));
      System.out.println ("Get array "+Arrays.toString(arr2)+" unique elements : "+getArrayUniqVal(arr2));
      
   } 
 }
