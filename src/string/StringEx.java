package string;

public class StringEx {

	public static void main(String[] args) {
		String s1=new String("vishwajit");
		String s2=new String("vishwajit");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
	/*
	 * String Buffer example Program
	 */

		StringBuffer sb1=new StringBuffer("vishwajit");
		StringBuffer sb2=new StringBuffer("vishwajit");
		
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
	}

}
