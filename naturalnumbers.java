import java.util.Scanner;
public class naturalnumbers{
    public static void main(String[] args){
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum += i;
        }
        System.out.println(sum);
        s1.close();
    }
}