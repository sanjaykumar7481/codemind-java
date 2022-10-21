import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<Math.pow(2,a);i++)
        {
            String s=Integer.toBinaryString(i);
            int k=a-s.length();
            while(k-->0)
            {
                System.out.print("0");
            }
            System.out.println(s);
        }
    }
}