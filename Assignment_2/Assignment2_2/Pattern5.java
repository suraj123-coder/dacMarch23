class Pattern5{
public static void main(String [] args)
{
for(int i=1;i<=5;i++)
{ 
for(int j=0;j<=9;j++)
{
if(j>=6-i && j<=4+i)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println(" ");
}
}
}