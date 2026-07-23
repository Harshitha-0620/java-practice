import java.util.Scanner;
public class ReverseArray{
    public static void main(String[] args){
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=s1.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s1.nextInt();
        }
        for(int j=n-1;j>=0;j--){
            System.out.println(arr[j]);
        }
        
        s1.close();
    }
}