import java.util.*;
class Demo{
    public static void main(String[] args)
    {
        Scanner p=new Scanner(System.in);
        int h=p.nextInt();
        int n=p.nextInt();
        while(n-->0)
        {
            int s=p.nextInt();
            int k=p.nextInt();
            if(s<h || k<h)
            {
                System.out.println("UPLOAD ANOTHER");
            }
            else if(s==k)
            System.out.println("ACCEPTED");
            else
            System.out.println("CROP IT");
        }
        
    }
}