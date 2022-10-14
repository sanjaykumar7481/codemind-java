import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double c=0;
            for(int i=1;i<=n;i++)
            {
                c+=1/(float) i;
            }
            System.out.printf("%.2f",c);
        
    }
}