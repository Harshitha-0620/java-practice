import java.util.Scanner;
public class reversenum{
    public static void main(String[] args){
        Scanner s1=new Scanner(System.in);
        int num=s1.nextInt();
        int revnum = 0;
        while(num !=0){
            int rem=num%10;
            revnum = revnum *10 +rem;
            num=num/10;
        }
        System.out.print(revnum);
    }
}