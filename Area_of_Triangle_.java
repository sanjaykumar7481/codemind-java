import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner ni=new Scanner(System.in);
        int a=ni.nextInt();
        int b=ni.nextInt();
        int c=ni.nextInt();
        double s=(a+b+c)/2.0;
        double ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",ar);
    }
}