package week3day1;

public class FindTypes {

	public static void main(String[] args) {
	         String str="$$ Welcome to 2nd Class of Automation $$";
	         int letter=0,space=0,num=0,spclChar=0;
	         char[] ch=str.toCharArray();
	         for(int i=0;i<=ch.length;i++) {
	         if(Character.isLetter(ch[i])) {
	        	 letter++;
	        	      }
	         else if(Character.isDigit(ch[i])) {
	        	 num++;
	        	 }
	        	      else if(Character.isSpaceChar(ch[i])) {
	        	 space++;
	        	 }
	        	      else {
	        	 spclChar++;
	        	 }

}System.out.println("Letter:"+letter);
System.out.println("Number:"+num);
System.out.println("Space:"+space);
System.out.println("SpclChar:"+spclChar);
	}
}