import java.util.Scanner;
class Fourteen{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Bubble sort: ");
        
        for(int i=0;i<n;i++){ 
			for(int j=1;j<n-i;j++){
				if(arr[j]<arr[j-1]){
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
            }
    }
    System.out.println("array after sorting: ");
    for(int i=0;i<n;i++){
        System.out.println(arr[i]);
    }
}
}

