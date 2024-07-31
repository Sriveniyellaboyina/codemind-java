import java.util.Scanner;
public class Perimeter
{
    public static void main(String[] args)
    {
        int a;
        double c,d;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        c=3.14*a*a;
        d=2*3.14*a;
        System.out.printf("%.2f
",c);
        System.out.printf("%.2f
",d);
        
    }
}