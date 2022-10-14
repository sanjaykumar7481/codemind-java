import java.util.*;
class Main{  
public static void main(String args[])  
{   
 Scanner sc=new Scanner(System.in);
 int count=sc.nextInt();
 int k=1;
 for(int i=1;i<=count;i++)
 {    
    for(int j=count;j>0;j--)
    {
        System.out.print(j+" ");
    }
    k++;
    System.out.print("
");
 }
}
} 