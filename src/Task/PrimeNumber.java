package Task;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int num=1;num<=100;num++)
	
		{
	int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
			
			count++;
		}
		}
		if(count==2)
	 {
			System.out.println(num +"is a prime number");
		}
			
		}
	}
	

}

