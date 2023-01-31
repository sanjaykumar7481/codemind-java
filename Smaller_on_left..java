import java.util.*;
class Main{
    public static void main(String args[])
    {
        Scanner n=new Scanner(System.in);
        int s=n.nextInt();
        int arr[]=new int[s];
        for(int i=0;i<s;i++)
        {
            arr[i]=n.nextInt();
            // System.out.print(arr[i]+" ");
        }
        int min=arr[0];
        int res[]=new int [s];
        for(int i=0;i<s;i++)
        {
            int j=i-1;
            int f=0;
            while(j>=0)
            {
                if(arr[j]<arr[i])
                {
                    res[i]=arr[j];
                    f=1;
                    break;
                }
                j--;
            }
            if(f==0)
            res[i]=-1;
        }
        for(int i:res)
        System.out.print(i+" ");
    }
}