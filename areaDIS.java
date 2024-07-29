import java.io.*;
public class areaDIS{
	public static void main(String[] args){
		int radius;
		double area;
		try
		{
			DataInputStream d=new DataInputStream(System.in);
			System.out.println("Enter the radius ");
			String radiusn=d.readLine();
			radius=Integer.parseInt(radiusn);
			area=3.14*radius*radius;
			System.out.println("the area is "+area);
		}
		catch(IOException e){
			System.out.println("Wrong input");
		}
		
	}
}
