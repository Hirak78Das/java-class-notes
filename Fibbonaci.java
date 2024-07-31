import java.util.*;
public class Fibbonaci{	

	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no of terms: ");
	int n=sc.nextInt();
	int a=0,b=1;
	int c=0;
	
	for(int i=0;i<n;i++){
		
		System.out.print(a+",");
		c=a+b;
		a=b;
		b=c;
	
	}
	

}


} 
