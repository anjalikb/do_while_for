import java.util.*;
class do_minno
{
  public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  int k=0;
  int rem=0;

  System.out.println("enter the no");
  int n=sc.nextInt();
    int i=n;
 do
  {
     rem=i%10;
     if(k>rem)
       k=rem;
      i=i/10;
   } while(i!=0);
   System.out.println("the less no is = " +k);
}
}