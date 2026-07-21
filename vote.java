import java.util.Scanner;
public class vote{
    public static void main(String[] args){
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=s1.nextInt();
        if(age>18){
            System.out.println("Eligible to vote");
        }
        s1.close();
    }
}