import java.util.Scanner;
public class CountEvenOdd{
    public static void main(String[] args){
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=s1.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s1.nextInt();
        }
        int evencount=0;
        int oddcount=0;

        for(int i=0;i<n;i++){
            if(arr[i]%2 == 0){
                evencount++;
            }
            else{
                oddcount++;
            }
        }
        System.out.println("Even"+" = "+evencount);
        System.out.println("Odd"+" = "+oddcount);
        s1.close();
    }
}