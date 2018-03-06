import java.util.Scanner;

public class fenjiezhiyinshu {
	static Scanner in = new Scanner(System.in);
	
	public static boolean isPrime(int n)//是否为素数，这里是一个函数，参数不必与值取相同的名字
	{
		
		boolean isPrime = true;
		for(int i =2;i<n;i++)
		{
			if(n%i==0)
			{
				isPrime=false;
				break;
			}
		}
		return isPrime;
	}

	public static void main(String[] args)
	{
		
		int x= in.nextInt();
		
		if(x<=100000&&x>=2){
		if(isPrime(x)){
		System.out.println(x+"="+x);	
		}
		else{
			System.out.print(x+"=");
			lable1:	for(int i=2; i<x; i++)
			{
				 
					if(isPrime(i))
					{
						if(x%i==0)
						{
							System.out.print(i+"x");
						    x/=i;
						    if(isPrime(x))
						    {
								System.out.print(x);
								break;
							}	
						    else
						    {
						    	i=1; //这里是画龙点睛之笔，保证新的循环从i=2开始。
						    	continue lable1;//使用continue会执行关系式3，即i++.
						    }
						}
					}
					
				}	
			
		}

	}
	
	}
}
