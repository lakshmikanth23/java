package Task;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="lakshmikanth";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			
			char ch=s.charAt(i);
			rev=rev+ch;
		}
		if(rev.equals(s)) 
			System.out.println("paildrome");
		else
			System.out.println("non paildrome");
		

		}

}
