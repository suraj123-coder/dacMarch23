class Pattern15{
public static void main(String [] args)
{
for(int i=5;i>=1;i--)
{
for(int j=5;j>=1;j--)
{
if(j>=6-i)
System.out.print(j);
else
System.out.print(" ");
}
System.out.println(" ");
}
}
}