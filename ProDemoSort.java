package ujan18;

import java.util.Arrays;

public class ProDemoSort {
public static void main(String[] args) {
	int a[] = {1, 2, 3, 3, 5};
	int n = a.length;
	Arrays.sort(a);
	int arr1[] = new int[n];
	int temp[] = new int[n];
	for (int i = 0; i <= a.length-2; i++) 
	{
		if(a[i]!=a[i+1])
		{
			temp[i++] = a[i];
			i++;
		}
		for (int j = 0; j < temp.length-1; j++) {
			System.out.println(temp[j]);
		}
	}
}
}
