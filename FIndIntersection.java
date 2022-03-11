package week3day2;

import java.util.HashSet;
import java.util.Set;

public class FIndIntersection {

	public static void main(String[] args) {
      Set<Integer> set=new HashSet<Integer>();
      set.add(3);
      set.add(2);
      set.add(11);
      set.add(4);
      set.add(6);
      set.add(7);
      Set<Integer> set1=new HashSet<Integer>();
      set1.add(1);
      set1.add(2);
      set1.add(8);
      set1.add(4);
      set1.add(9);
      set1.add(7);
      set.retainAll(set1);
      System.out.println(set);
      

	}

}
