import java.util.Scanner;
public class Demo
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int a;
        a=read.nextInt();
        int h,m;
        h=a/60;
        m=a%60;
        System.out.println(h+" Hour(s) " + m+" Minute(s) ");
        
    }
}