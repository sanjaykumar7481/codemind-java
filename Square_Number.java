import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner n=new Scanner(System.in);
        int s=n.nextInt();
        double p=Math.sqrt(s);
        int k=(int)p;
        if(k*k==s)
        System.out.println("True");
        else
        System.out.println("False");
        // for(int i=0;i<=int(Math.sqrt(s));i++)
        // {
        //     for(int j=0;)
        // }
    }
}