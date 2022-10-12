import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner n=new Scanner(System.in);
        char a=n.next().charAt(0);
        // System.out.println(a);
        if(a=='V' || a=='v')
        {
            System.out.println("Violet");
        }
        else if(a=='I' || a=='i')
        {
            System.out.println("Indigo");
        }
        else if(a=='B' || a=='b')
        {
            System.out.println("Blue");
        }
        else if(a=='g' || a=='G')
        {
            System.out.println("Green");
        }
        else if(a=='Y' || a=='y')
        {
            System.out.println("Yellow");
        }
        else if(a=='O' || a=='o')
        {
            System.out.println("Orange");
        }
        else if(a=='R' || a=='r')
        {
            System.out.println("Red");
        }
        else
        {
            System.out.println(-1);
        }
    }
}