import java.util.*;
public class Sum{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter start: ");
		int start = sc.nextInt();
		System.out.println("enter end : ");
		int end=sc.nextInt();
		System.out.println("sum of odd nos are: ");
		int add=0;
		for(start++;start<end;start++){
			if(start%2 !=0 ){
				add = add+start;
			}
		}

		System.out.println(add);
	}
}
