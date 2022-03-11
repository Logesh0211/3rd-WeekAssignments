package week3day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1="stops";
		String text2="potss";
		char c1[]=text1.toCharArray();
		char c2[]=text2.toCharArray();
		if(c1.length==c2.length) {
			System.out.println("The word is anagram");
			System.exit(0);
		}
		Arrays.sort(c1);
		Arrays.sort(c2);
		for(int i=0;i<c1.length;i++) {
			if(c1[i]==c2[i]) {
				System.out.println("The word is anagram");
			}
		}
						
		}
	
		
		
			
		

	}


