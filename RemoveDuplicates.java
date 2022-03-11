package week3day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String str="We learn java basics as part of java sessions in java week1";
		int count;
		str=str.toLowerCase();
		String str1[]=str.split("");
		for(int i=0;i<str1.length;i++) {
			count=1;
			for(int j=i+1;j<str1.length;j++) {
				if(str1[i].equals(str1[j])) {
					count++;
					str1[j]="0";
					
				}
			}if(count>1 && str1[i]!="0") {
				System.out.print(str1[i]);  
		}

	}

}
}


