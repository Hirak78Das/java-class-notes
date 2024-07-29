import java.io.*;
public class Findrange{
	public static void main(String args[]) throws Exception{
		int start,end;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the start and end of the range: ");
		start=Integer.parseInt(br.readLine());
		end=Integer.parseInt(br.readLine());
		System.out.println("the range is : ");
		for(start++;start<end;start++){
			System.out.println(start);
		}
	}
	
}
