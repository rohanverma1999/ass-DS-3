import java.util.*;

class Search{
	public static boolean search(int arr[],int num){
	if(arr.length==0){
		return false;
	}
	if(arr[0]==num){
		return true;
	}
	int smallArray[]=new int[arr.length-1];
	for(int i=0;i<smallArray.length;i++){
		smallArray[i]=arr[i+1];
	}
	boolean smallAns=search(smallArray,num);
	if(smallAns){
		return true;
	}
	else{
		return false;
	}
	}
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of array:");
	int Size=sc.nextInt();
	int arr[]=new int[Size];
	for(int i=0;i<Size;i++){
		arr[i]=sc.nextInt();
	}
	System.out.println("enter the value u wanna search:");
	int n=sc.nextInt();
	boolean a=search(arr,n);
	System.out.println(a);
	}
	}