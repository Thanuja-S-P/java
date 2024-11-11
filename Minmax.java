package LogicClass;

import java.util.Arrays;

public class Minmax {
	public static void main(String[] args) {
	int [] arr= {9,3,5,2,4,8,6,7};
	int min=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]<min)
		{
			min=arr[i];
		}
	}
	System.out.println(min);
}
}
