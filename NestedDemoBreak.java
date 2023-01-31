package com.NovemberBatch;

public class NestedDemoBreak {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=3; j++)
			{
				System.out.println("Kodnest");
				if (j==2)
				{
					break;
				}
			}
			System.out.println("i--->"+i);
		}
		System.out.println("Technologies");
	}

}
