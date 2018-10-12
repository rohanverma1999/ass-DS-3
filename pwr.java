import java.util.Scanner;
class Power{
	public static int Calculate(int a,int b){
		if(b==0){
			return 1;
		}
		else{
			int result=a*Calculate(a,b-1);
			return result;
		}
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.");
		int x=sc.nextInt();
		System.out.println("enter the power:");
		int y=sc.nextInt();
		int c=Calculate(x,y);
		System.out.println(c);
	}
}