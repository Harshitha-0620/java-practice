import java.util.Scanner;
public class tables{
 public static void main(String[] args){
    Scanner s1=new Scanner(System.in);
    int n=s1.nextInt();
    for(int i=1;i<=10;i++){
        System.out.println(n +" * "+ i +" = "+ (n*i));
    }
    s1.close();
 }
}