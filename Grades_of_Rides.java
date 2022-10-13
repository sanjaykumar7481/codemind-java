import java.util.*;
class Demo{
    public static void main(String[] args)
    {
        Scanner p=new Scanner(System.in);
        int h=p.nextInt();
        int s=p.nextInt();
        int f=p.nextInt();
        if(h>50 && s>60 && f>100)
        System.out.println(10);
        else if(h>50 && s>60 )
        System.out.println(9);
        else if(f>100 && s>60 )
        System.out.println(8);
        else if(f>100 && h>50 )
        System.out.println(7);
        else if(h>50 || s>60 || f>100 )
        System.out.println(6);
        else
        System.out.println(5);
    }
}