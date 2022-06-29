class do_seperate
{
  public static void main(String args[])
{
   int n=123456;
   int i=n;
   
   do
{
  int rem=i%10;
   System.out.println(rem);
   i=i/10;
 }
   while(i!=10);
}
}