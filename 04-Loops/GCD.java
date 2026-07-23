import java.util.Scanner;
public class GCD{
    public static void main(String[] args){
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int a=s1.nextInt();
        int b=s1.nextInt();
        int min;
        int gcd=1;
        if(a<b){
             min=a;
        }
        else{
            min =b;
        }
        for(int i=1;i<=min;i++){
            if(a%i ==0 && b%i == 0){
                gcd=i;

            }
        }
        System.out.println(gcd);
        
        s1.close();
    }
}