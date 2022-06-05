package string;

import java.util.Arrays;

public class stringDemo {

	public static void main(java.lang.String[] args) {
       System.out.println();
       System.out.println("=====String Method=====");
       System.out.println();
       
       String s = " hello ";
       System.out.println("s.lenght() :"  + s.length());
       System.out.println("s.contains(\"he\"):" +s.contains("he"));
       System.out.println("s.isEmpty :" +s.isEmpty());
       System.out.println("s.toUpperCase() :" +s.toUpperCase());
       System.out.println("s.startsWith(\"h\") :" +s.startsWith("h"));
       System.out.println("s.endsWith(\" \") :" +s.endsWith(" "));
       System.out.println("s.replace(\"ll\",\"LL\") :" +s.replace("ll", "LL"));
       System.out.println("s.trim() :" +s.trim());
       System.out.println("s.strip() :" +s.strip());
       System.out.println("s.substring(0,3) :" +s.substring(0,3));
       System.out.println("Arrays.toString(s.getBytes()) :" +Arrays.toString(s.getBytes()));
       System.out.println("Arrays.toString(s.tocharArray()) :" +Arrays.toString(s.toCharArray()));
       System.out.println("s.charAt(1) :" +s.charAt(1));
       System.out.println("Arrays.toString(s.split(\"e\")) :" +Arrays.toString(s.split("e")));
       
       
       System.out.println();
       System.out.println("=====String comparison=====");
       System.out.println();
       
       String s2 = " hello ";
       System.out.println("s == s2 :" + (s == s2));
       
       String s3 = new String(" hello ");
       System.out.println("s == s3 :" + ( s == s3));
       System.out.println("s.equals(s3) :" +s.equals(s3));
       System.out.println("s == s3.intern :" + (s == s.intern()));
       
       String firstname = "Harun";
       String firstname2 = "harun";
       
       System.out.println("firstname.equals(firstname2) :" +firstname.equals(firstname2));
       System.out.println("firstname.equalsIgnoreCase(firstname2) :" +firstname.equalsIgnoreCase(firstname2));
       

	}

}
