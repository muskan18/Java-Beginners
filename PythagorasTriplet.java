package day_1;

import java.util.*;

public class PythagorasTriplet {

	public static void main(String args[])
	{

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int ar[] =new int[n];

		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}

		sc.close();

		checkpytha(ar,n);


	}

	static void checkpytha(int arr[],int n)
	{

		int flag=0;

		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				int c=(arr[i]*arr[i])+(arr[j]*arr[j]);

				if(perfectsq(c)==1)
				{

					double z=Math.sqrt(c);

					int x= (int) z;
					{
						for(int k=0;k<n;k++)
						{
							if(arr[k]==x)
							{
								flag=1;

								System.out.println("YES");

								break;
							}	
						}

					}
				}
				if(flag==1)
				{
					break;
				}
				else
				{
					System.out.println("NO");
				}
			}
			if(flag==1)
			{
				break;
			}
		}
	}

	static int perfectsq(int k) 
	{ 
		for (int i = 1; i * i <= k; i++)
		{ 

			if ((k % i == 0) && (k / i == i))
			{ 
				return 1; 
			} 
		}

		return -1; 
	}

}


