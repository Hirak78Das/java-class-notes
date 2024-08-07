import java.util.Scanner;
public class Hello{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n=input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        //Selection sort
        //we select the largest element and swap with last index of each changing array
        for(int i=0;i<n;i++){  // the outer loop indicates how many time we are going to find the largest element
            int maxindex=0;// let
            // now find maxelement in the decreasing size array
            for(int j=0;j<n-i-1;j++){ // each time the inner loop runs the size of the array is decrease by ith index as we dont need the sorted elements, hence skip
               //find max
               if(arr[maxindex]<arr[j+1]){
                   maxindex=j+1;
               }
        
        }
        //now swap the greatest element with the last inedex 
        int temp=arr[maxindex];
        arr[maxindex]=arr[n-i-1];
        arr[n-i-1]=temp;
     }
     // print the sorted array
     System.out.println("sorted array : ");
     for(int i=0;i<n;i++){
         System.out.print(arr[i]+",");
     }
  }
}
