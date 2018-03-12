
public class prime {
	public static void main(String args[])
	{
	int ctr = 0;
	{
	for (int i=2;i<=100;i++)
	{
		for(int j=2;j<(i);j++)
		{
			if ((i%j)!= 0)
					{
				ctr ++;
					}
		}
	}
	}
	System.out.println("prime number"+ctr);
	}

}
