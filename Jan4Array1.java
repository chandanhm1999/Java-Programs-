package jan4pro;

public class Jan4Array1 {
public static void main(String[] args) {
	int arr[] = {10,20,30,40,50};
	int ele = 40;
	int flag = 0;
	int loc = 0;
	for (int i = 0; i <= arr.length-1; i++) 
	{
		if(arr[i]==ele)
		{
			flag = 1;
			loc = i;
			break;
		}
		else
		{
			flag = 0;
		}
	}
	if(flag==1)
	{
		for (int i = loc+1; i <= arr.length-1; i++) 
		{
			arr[i-1] = arr[i];
		}
		System.out.println("After deleting");
		for (int i = 0; i <= arr.length-2; i++) 
		{
			System.out.println(arr[i]);
		}
	}
	else
	{
		System.out.println("Elements not found");
	}
}
}
