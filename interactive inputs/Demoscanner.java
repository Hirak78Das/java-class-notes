import java.util.*;
public class Demoscanner{
	public static void main(String[] args){
		// create an object for the Scanner class named Scanner and sc is Variable
		// its syntax is :  
		Scanner sc= new Scanner(System.in);
		// System.in means it takes input from the keyboard
		System.out.println("chack whether a no is even or not.\n enter a no : ");
		//System is a class just like Scanner
		int a=sc.nextInt();  //to take input from keyboard
		// a is the variable which is pointing to the object Scanner
		if(a%2==0){
			System.out.println("the no is even");
		}
		else{
			System.out.println("The no is odd");
		}
		
	}
}
