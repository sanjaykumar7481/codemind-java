import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner p=new Scanner(System.in);
        char n=p.next().charAt(0);
        char[] s={'A','E','I','O','U','a','e','i','o','u'};
        int f=0;
        for(char i:s)
        {
          if(n==i)
          {
              System.out.println("Vowel");
              f=1;
              break;
          }
        }
        if(f==0)
        {
            System.out.println("Consonant");
        }
        
        }
    }