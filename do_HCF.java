import java.util.*;
class do_HCF
{
  public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  int i=1;
  int hf=0;
  System.out.println("enter the value of a");
  int a=sc.nextInt();
  System.out.println("enetr the value of b");
  int b=sc.nextInt();
  
  
 do
  
  {
     if(a%i==0 && b%i==0)
        hf=i;
        i++;
  }  while(i<=a || i<=b);
  

    System.out.println("Hcf of two no = " +hf);
 
}
}