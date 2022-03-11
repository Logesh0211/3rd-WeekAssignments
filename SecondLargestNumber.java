package week3day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecondLargestNumber {

	public static void main(String[] args) {
          ArrayList<Integer> list=new ArrayList<Integer>();
          list.add(1);
          list.add(3);
          list.add(7);
          list.add(4);
          list.add(9);
          Collections.sort(list);
          int largest=list.get(0);
          int secLargest=list.get(0);
          for(int i=0;i<list.size();i++) {
        	  if(list.get(i)>largest) {
        		  secLargest=largest;
        		  largest=list.get(i);
        		  if(list.get(i)>secLargest && list.get(i)!=largest) {
        			  secLargest=list.get(i);
        		  }
        	  }
          }
         System.out.println("SecondLargest Number is:"+secLargest);
         
	

	}

}
