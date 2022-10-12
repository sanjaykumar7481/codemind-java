import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner n=new Scanner(System.in);
        int p=n.nextInt();
        int i;
        for(i=0;i<p;i++)
        {
            int a=n.nextInt();
            int b=n.nextInt();
            int c=n.nextInt();
            int d=n.nextInt();
            if(a/(float)c > b/(float)d)
            {
                System.out.println(-1);
            }
            else if(a/(float)c == b/(float)d)
            {
                System.out.println(0);
            }
            else
            {
                System.out.println(1);
            }
        }
    }
}