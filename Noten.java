import java.util.Scanner;
class Noten{
    public static void main(String args[]){
        System.out.println("Enter the size of array : ");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int num[]=new int[n];
        System.out.println("Enter the values: ");
            for(int i=0;i<n;i++){
                num[i]=input.nextInt();
            }
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+num[i];
        }
        System.out.println("sum of array is : "+sum);

    }
}
