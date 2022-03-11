package week3day1;

import java.util.HashMap;

public class CharOccurnace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	         String str="welcome to chennai";
	       String str1= str.replaceAll("", ""); 
	        int count=0;
	       HashMap<Character,Integer> map=new HashMap<Character,Integer>();
	       for (int i=str1.length()-1;i>=0; i--) {
	    	   if(map.containsKey(str1.charAt(i))) {
	    	   count=map.get(str1.charAt(i));
	    	   map.put(str1.charAt(i), ++count);
	        		 }else {
	        			 map.put(str.charAt(i), 1);
	        		 }
	    	   }
	       System.out.println(map);
	        	 }
	        	 
	         }

	


