import java.util.*;
public class Checkprime{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no : ");
		int n=sc.nextInt();
		int factor=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				factor=factor+1;
			}
		}
		if(factor==2){
			System.out.println("prime");
		}
		else{
			System.out.println("not prime");
		}
	
	}
}
