import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner n=new Scanner(System.in);
        int a=n.nextInt();
        if(a>=4 && a<=6)
        {
            System.out.println("Summer");
        }
        else if(a>=7 && a<=10)
        {
            System.out.println("Rainy");
        }
        else if(a>=2 && a<=3)
        {
            System.out.println("Spring");
        }
        else if(a==11 || a==1 || a==12)
        {
            System.out.println("Winter");
        }
        else
        {
            System.out.println(-1);
        }
    }
}