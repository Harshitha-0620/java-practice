import java.util.Scanner;
public class Armstrong{
    public static void main(String[] args){
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=s1.nextInt();
        int original=num;
        int sum=0;
        while(num!=0){
            int rem=num%10;
            sum +=rem*rem*rem;
            num=num/10;
        }
        if(sum == original){
        System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not armstrong number");
        }
        s1.close();
    }
}