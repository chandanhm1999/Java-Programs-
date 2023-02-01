package dec16;

public class Dec16Demo1 {
public static void main(String[] args) {
	int []arr1= {10,20,30,40,50};
	int []arr2 = new int [arr1.length];
	int j = arr2.length-1;
	for (int i = 0; i <= arr1.length-1; i++) {
		arr2[j]=arr1[i];
		j--;
	}
	System.out.print("arr1---->");
	for (int i = 0; i <= arr1.length-1; i++) {
		System.out.print(arr1[i]+" ");
	}
	System.out.println();
	System.out.print("arr2---->");
	for (int i = 0; i <= arr2.length-1; i++) {
		System.out.print(arr2[i]+" ");
	}
}
}
