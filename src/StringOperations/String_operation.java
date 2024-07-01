package StringOperations;

public class String_operation {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
String str="lakshmikanth";
String str1="wipro";
System.out.println(str);
System.out.println(str1);
	

	//1.Concat Combining the both Strings
			System.out.println(str.concat(str1));
	//2.CharAt
			System.out.println(str.charAt(4));//t
	//3.Equals
			System.out.println(str.equals(str1));//flase


//4.Uppercase
			System.out.println(str.toUpperCase());
			
//5.lower cases
			System.out.println(str.toLowerCase());


//6.Length
			System.out.println(str.length());
			//9.trim
			System.out.println(str1.length());
			System.out.println(str1);
			String str3=str1.trim();
			System.out.println(str3.length());
			System.out.println(str3);


			//10.split
		          	String str5="LeviticaTechnologies";
			String str4="Levitica,Technologies";
			System.out.println(str4);
			String[] arr=str4.split(",");//"Levitica","Technologies"
			for(String arr1 : arr) {
				System.out.println(arr1);

			//11.Replace
			System.out.println(str5.replace('L', 'S'));
			System.out.println(str5.replaceAll("Levitica", "Infosys"));

}
}
}
