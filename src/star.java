
public class star 
{
public static void main(String args[])
{
int count = 0;
{
for(int i=1;i<=4;i++)
{
for(int j=1;j<=7;j++)
{
	if ((i+j)!=0 && (i+j)>=5)
	{
		System.out.println("*");
		count ++;
		if (i ==count)
			break;
	}
	System.out.println(" ");
	}
System.out.println(" ");
}
}
	
}
}
