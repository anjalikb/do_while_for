import java.util.*;
class do_fact
{
  public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
   int fact=1;
   System.out.println("enter the no = ");
   int n=sc.nextInt();
   int i=1;
       do
      {
         fact=fact*i;
         System.out.println(fact);
         i++;
      }
        while(i<=n);
}
}


      