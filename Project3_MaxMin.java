public class MaxMinExample {
public static void main(String args[]){
int arr[] = new int[]{44, 23, 55, 76, 21, 100};
// memanggil fungsi getMax untuk mendapat nilai max
int max = getMax(arr);

System.out.println("Bilangan terbesar adalah : "+max);
// memanggil fungsi getMin untuk mendapat nilai min
int min = getMin(arr);
System.out.println("Bilangan terkecil adalah : "+min);
}
// Method untuk memdapatkan nilai max
public static int getMax(int[] inputArray){
int max = inputArray[0];
for(int i=1;i < inputArray.length;i++){
if(inputArray[i] > max ){
max = inputArray[i];
}
}
return max ;
}
// Method untuk memdapatkan nilai max
public static int getMin(int[] inputArray){
int min = inputArray[0];
for(int i=1;i<inputArray.length;i++){
if(inputArray[i] < min ){
min = inputArray[i];
}
}
return min ;
}
}