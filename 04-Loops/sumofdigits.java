import java.util.Scanner;
public class sumofdigits{
    public static void main(String[] args){
        Scanner s1=new Scanner(System.in);
        int num=s1.nextInt();
        int sum=0;
        while(num!=0){
            int rem=num%10;
            sum +=rem;
            num=num/10;

        }
        System.out.println(sum);
        s1.close();
    }
}