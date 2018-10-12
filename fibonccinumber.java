import java.util.*;

class FibonacciNumber{
	public static int fibo(int a){
	    if (a == 0)
    {
        return 0;
    }
    else if (a == 1)
    {
        return 1;
    }
    else
    {
        return(fibo(a - 1) + fibo(a - 2));
    }

}
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the place of nth fibonacci no.");
	int n=sc.nextInt();
	int f=fibo(n);
	System.out.print("Nth fibonacci no."+f);
	}
}