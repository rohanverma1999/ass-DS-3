import java.util.Scanner;

class rev{
	public static void reverse(int arr[],int i){
		if(i>=0){
			System.out.print(arr[i]+" ");
			i--;
			reverse(arr,i);
		}
		else{
			return;
		}
		
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int s=sc.nextInt();
		int arr[]=new int[s];
		for(int i=0;i<s;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("reverse of array:");
		reverse(arr,(arr.length-1));
	}
}