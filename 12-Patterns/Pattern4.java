import java.util.Scanner;
public class Pattern4{
    public static void main(String[] args){
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int rows=s1.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        s1.close();

    
    }
}