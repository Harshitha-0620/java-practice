import java.util.Scanner;
public class LinearSearch{
    public static void main(String[] args){
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter key: ");
        int key=s1.nextInt();
        boolean found=false;
        for(int i=0;i<n;i++){
            arr[i]=s1.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i] == key){
                found=true;
                break;
            }
        }
            if(found == true){
                System.out.println("Found");
            }
            else{
                System.out.println(" Not Found");
            }
        
        s1.close();
    }
}