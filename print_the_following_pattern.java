import java.util.*;
class Main{  
public static void main(String args[])  
{   
 Scanner sc=new Scanner(System.in);
 int count=sc.nextInt();
 for(int i=count;i>0;--i)//loop starts from 2 because 0 and 1 are already printed    
 {    
    for(int j=1;j<=i;j++)
    {
        System.out.print(j);
    }
    System.out.print("
");
 }
}
} 