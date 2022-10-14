import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[100];
        int c=0;
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
            
        }
        for(int i=0;i<a;i++)
        {
            if(arr[i]%2==1)
            c++;
        }
        if(c>2)
        System.out.println("NO");
        else
        System.out.println("YES");
    }
}