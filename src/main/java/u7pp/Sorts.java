package u7pp;
import java.util.List;
import java.util.ArrayList;

public class Sorts {
  public Sorts(){
    
  }
public static int[] selectionSort(int[] x){

 for(int i=0;i < x.length; i++ ){
   int min = i;
   for(int j= i+1; j < x.length; j++){
     if (x[min] > x[j]){
       min = j; 
     }
   
   }
  if (min != i ){
    int temp = x[i];
    x[i] = x[min];
    x[min] = temp;
  }
 } 
  return x;
}
public static int[] insertionSort(int[] x){
  for(int i=1; i<x.length; i++){
    int bin = x[i];
    int j = i-1;
    while (j >= 0 && x[j] > bin){
      x[j+1] = x[j];
      j = j-1;
    }
    x[j+1] = bin;
  }
  return x;
}
 public static List<Integer> selectionSort(List<Integer> x){
 
   int[] temp = new int[x.size()];
   for(int i = 0;  i < x.size(); i++){
     temp[i] = x.get(i);
   }
     selectionSort(temp);
   int index = 0;
   for(int i = temp.length -1; i >= 0; i--){
     x.set(index, temp[i]);
     index++;
   }
    return x;
 }
 public static List<Integer> insertionSort(List<Integer> x){
 
   int[] temp = new int[x.size()];
   for(int i = 0;  i < x.size(); i++){
     temp[i] = x.get(i);
   }
     insertionSort(temp);
   int index = 0;
   for(int i = temp.length -1; i >= 0; i--){
     x.set(index, temp[i]);
     index++;
   }
    return x;
 }
}





  
    

  


