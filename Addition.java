import java.io.*;
class Addition{
	public static void main(String[] args) throws Exception{
		int a,b,c;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the first number:");
		a=Integer.parseInt(br.readLine());
		System.out.println("Enter the second number: ");
		b=Integer.parseInt(br.readLine());
		c=a+b;
		System.out.println("\nSum of two numbers:"+c);
	}
}
