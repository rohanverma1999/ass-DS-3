import java.util.*;
class StringSum{
	public static int sum(String n,int i){
		if(i==n.length()){
			return 0;
				}
		else{
			int result=Character.getNumericValue(n.charAt(i))+sum(n,(i+1));
			return result;
		}
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string in the form of number");
		String str=sc.nextLine();
		int j=0;
		int l=sum(str,j);
		System.out.println("Sum of digits in string:"+l);		
	}
}