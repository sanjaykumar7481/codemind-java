import java.util.*;
class Main{  
public static void main(String args[])  
{   
 Scanner sc=new Scanner(System.in);
 int count=sc.nextInt();
 for(int i=1;i<=count;i++)
 {    
    for(int j=1;j<=count;j++)
    {
        if(j==1||i==j||j==count)
        System.out.print("*"+" ");
        else
        System.out.print(" "+" ");
    }
    System.out.print("
");
 }
}
} 