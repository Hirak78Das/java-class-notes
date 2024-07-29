// to generate the nos btwn the given range of nos

import java.util.*;
public class Homework{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the start : ");
		int start = input.nextInt();
		System.out.println("Enter the end : ");
		int end= input.nextInt();
		System.out.print("\n");
		for(start++;start<end;start++){
			System.out.print(start +(start<end-1 ? "," : "\n"));
		}


	}
}
