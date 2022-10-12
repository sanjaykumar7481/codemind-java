import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner n=new Scanner(System.in);
        int p=n.nextInt();
        int s=n.nextInt();
        if(p%2==0 &&(p>0 || s%2==0))
        {
        System.out.println("YES");}
        else{
        System.out.println("NO");}
    }
}