import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args){
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter how many terms: ");
        int n=s1.nextInt();
        int a=0;
        int b=1;
        int c=0;
        for(int i=0;i<n;i++){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}