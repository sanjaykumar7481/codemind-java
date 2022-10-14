import java.util.*;
class Main{  
public static void main(String args[])  
{   
 Scanner sc=new Scanner(System.in);
 int count=sc.nextInt();
 int k=1;
 for(int i=1;i<=count;i++)
 {    
    for(int j=1;j<=count;j++)
    {
        if(j==k)
        System.out.print("0"+"");
        else
        System.out.print("x"+"");
    }
    k++;
    System.out.print("
");
 }
}
} 