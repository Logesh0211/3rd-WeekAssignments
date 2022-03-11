package week3day1;

public class Palindrome {

	public static void main(String[] args) {
		
		String str= "MADAM";
		String str1="";
		for(int i=str.length()-1;i>=0;i--) {
			str1=str1+str.charAt(i);
		}
		if(str1.equals(str)){
			System.out.println("String is Palindrome");
		}else {
			System.out.println("String is Not Palindrome");
		}
		

	}

}
