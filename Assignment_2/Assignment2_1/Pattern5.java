
class Pattern5{
public static void main(String [] args)
{
int alphabet=65;
for(int i=0;i<=4;i++)
{
for(int j=0;j<=i;j++)
{
System.out.print((char) (alphabet + i) + " ");
}
System.out.println(" ");
}
}
}