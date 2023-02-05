package ujan11propro;

import java.util.Scanner;

public class Demomatrix {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int a[][] = {{2,3},{4,5}};
	int b[][] = {{1,2},{3,4}};
	int c[][] = {{1,2},{3,4}};
	for (int i = 0; i < 2; i++) {
		for (int j = 0; j < 2; j++) {
			for (int k = 0;  k < 2; k++) {
				c[i][j]=c[i][j]+a[i][k]*b[k][i];
			}
		}
	}
	for (int i = 0; i < 2; i++) {
		for (int j = 0; j < 2; j++) {
			System.out.print(c[i][j]+" ");
		}
		System.out.println();
	}
}
}
