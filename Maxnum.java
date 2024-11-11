package LogicClass;

public class Maxnum {

	public static void main(String[] args) {
		int arr[]= {9,3,5,2,4,8,6,7};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
       System.out.println(max);
	}

}
