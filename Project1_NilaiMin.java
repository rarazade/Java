public class SmallestElement_array {
public static void main(String[] args) {
//Initialize array
int [] arr = new int [] {44, 23, 55, 76, 21, 100};
//inisialisasi nilai awal min.
int min = arr[0];
//perulangan dengan array
for (int i = 0; i < arr.length; i++) {
//Membandingkan elemen array ke I terhadap nilai min
if(arr[i] <min)
min = arr[i];
}
System.out.println(" Bilangan terkecil di dalam array adalah: " + min);
}
}