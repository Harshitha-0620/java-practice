import java.util.Scanner;
public class Pattern2{
    public static void main(String[] args){
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int rows=s1.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j = 1; j <= rows - i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        s1.close();

    
    }
}