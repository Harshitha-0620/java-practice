import java.util.Scanner;
public class palindrome{
    public static void main(String[] args){
        Scanner s1=new Scanner(System.in);
        int num=s1.nextInt();
        int original =num;
        int reversenum=0;
        while(num!=0){
            int rem=num%10;
            reversenum =reversenum*10 +rem;
            num=num/10;

        }
        if(reversenum==original){
            System.out.println("Palindrome");
        }
        s1.close();
    }
}