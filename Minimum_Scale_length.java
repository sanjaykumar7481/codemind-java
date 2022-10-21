import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c=0,hcf=1,min=200000;
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]<min)
            min=arr[i];
        }
        for(int i=1;i<=min;i++)
        {
            c=0;
            for(int j=0;j<n;j++)
            {
                if(arr[j]%i==0)
                c++;
            }
            if(c==n)
            hcf=i;
        }
        System.out.print(hcf);
    }
}