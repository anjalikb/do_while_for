import java.util.*;
class do_max
{
 public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 int k=0;
 System.out.println("enter the no you have");
 int n=sc.nextInt();
 
  do
  {
   int rem=n%10;
   
    if(rem>k)
      k=rem;
     n=n/10;
   System.out.println(k);
  }
   while(n!=0);
}
}