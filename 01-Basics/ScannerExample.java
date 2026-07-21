import java.util.Scanner;
public class ScannerExample{
    public static void main(String[] args){
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter your Name");
        String name=s1.nextLine();

        System.out.println("Enter your Age");
        int age =s1.nextInt();

        System.out.println("Hello "+ name);
        System.out.println("You are "+ age +"years old");
        s1.close();
    }
}