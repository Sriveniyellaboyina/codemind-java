import java.util.Scanner;
public class Demo
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int a,b,c;
        a=read.nextInt();
        b=read.nextInt();
        c=read.nextInt();
        int d=(5*a + 10*b)/c;
        System.out.println(d);
    }
}