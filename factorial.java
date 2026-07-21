import java.util.Scanner;
public class factorial{
    public static void main(String[] args){
        Scanner s1=new Scanner(System.in);
        int n =s1.nextInt();
        int product=1;
        for(int i=n;i>=1;i--){
            product *=i;
        }
        System.out.println(product);
        s1.close();
    }
}