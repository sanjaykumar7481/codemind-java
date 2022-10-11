import java.util.Scanner;
class Main {
    public static void main(String arg[])
    {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        double s=(a+b+c)/2.0;
        double ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",ar);
    }
}