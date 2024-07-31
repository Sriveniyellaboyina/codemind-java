import java.util.Scanner;
public class Demo
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int n;
        n=read.nextInt();
        int c=(n*(n+1))/2;
        System.out.println(c);
    }
    
}
