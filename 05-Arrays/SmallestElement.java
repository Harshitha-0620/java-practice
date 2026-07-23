import java.util.Scanner;
public class SmallestElement{
    public static void main(String[] args){
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
        int arr[]=new int[n];
    
        
        for(int i=0;i<n;i++){
            arr[i]=s1.nextInt();          
        }
        int smallest=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.print(smallest);
        s1.close();
    }
}