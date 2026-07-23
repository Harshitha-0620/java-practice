import java.util.Scanner;
public class SumofArray{
    public static void main(String[] args){
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=s1.nextInt();          
        }
        for(int i=0;i<n;i++){
            sum +=arr[i];
        }
        System.out.print(sum);
        s1.close();
    }
}