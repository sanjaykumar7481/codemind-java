import java.util.*;
class Main{  
public static void main(String args[])  
{   
 Scanner sc=new Scanner(System.in);
 int count=sc.nextInt();
 if(count>=3 &&count<=100)
 {
 for(int i=1;i<=count;++i)//loop starts from 2 because 0 and 1 are already printed    
 {    
    for(int j=1;j<=i;j++)
    {
        System.out.print("*"+"");
    }
    System.out.print("
");
 }
 for(int i=count-1;i>0;i--)//loop starts from 2 because 0 and 1 are already printed    
 {    
    for(int j=1;j<=i;j++)
    {
        System.out.print("*"+"");
    }
    System.out.print("
");
 }
 }
 else
 System.out.print("The pattern is not possible");
}
} 