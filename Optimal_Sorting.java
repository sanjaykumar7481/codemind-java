import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner p=new Scanner(System.in);
        int n=p.nextInt();
        while(n>0)
        {
            int s=p.nextInt();
            int[] arr=new int[s];
            int[] br=new int[s];
            for(int i=0;i<s;i++)
            {
                arr[i]=p.nextInt();
                br[i]=arr[i];
            }
            int c=0;
            Arrays.sort(arr);
            for(int i=0;i<s;i++)
            {
                if(arr[i]==br[i])
                {
                    c++;
                }
            }
            if(c==s)
            {
                System.out.println(0);
            }
            else
            {
                System.out.println(arr[s-1]-arr[0]);
            }
            n--;
        }
    }
}