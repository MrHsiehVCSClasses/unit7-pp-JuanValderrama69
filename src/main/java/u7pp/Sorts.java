package u7pp;

import java.util.List;
import java.util.ArrayList;

public class static Sorts {

public int[] selectionSort(int[] x)
 
 for(j=0;j<n;j++){

int iMin = j;
 }
for(i=j+1;i<n; i++){

}
for (a[i]) < a[iMin]){
iMin = i;
}
if(lilMin !=j){
swap(a[j],a[iMini]);
}

public int[] insertionSort(int[] x)
 int n = array.length;  
for (int j = 1; j < n; j++) {  
int key = array[j];  
int i = j-1;  
 while ( (i > -1) && ( array [i] > key ) ){  
array [i+1] = array [i];  
i--;  
}  
array[i+1] = key;  
}  
public int List<Integer> selectionSort(List<Integer> x)
for(int i = 0; i < a.length-1; i++){
int maxPosition=i;
int minPosition=i;
for(int j = i+1; j < a.length; j++){
if(a[j] < a[minPosition]){
minPosition = j;
}
if(a[j] > a[maxPosition])
maxPosition = j;
}
}
swap(a,maxPosition,i);
swap(a,minPosition,a.length-i-1);
}
System.out.println();
}
public static void swap(int[]a, int i, int j){
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
}
public int List<Integer> insertionSort(List<Integer> x)
}  
