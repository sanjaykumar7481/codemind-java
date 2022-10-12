import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        double f=32+(a*(9/5.0));
        System.out.printf("%.2f",f);
    }
}