package StringOperation;

public class DemoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello";
		String str2 = "Hello";
		if(str1 == str2) {
			System.out.println("str1 = str2");
		}else {
		System.out.println("str1 != str2");
		}
		String str3 = new String("Hello Sir");
		String str4 = new String("Hello Sir");
		
		if(str3 == str4) {
			System.out.println("Equal");
		}else {
			System.out.println("str3 != str4");
		}
		
		if(str3.equals(str4)) {
			System.out.println("Both are Equal");
		}else {
			System.out.println("Not Equal");
		}
		
		if(str3.contains(str1)) {
			if(str3.contains("Hello")) {
				System.out.println("Contain Hello");
			}else {
			System.out.println("Not contain Hello");
			}
		}
		if(str3.compareTo(str4) == 0) {
			System.out.println("Compaired!, And both are same");
		}else {
			System.out.println("Compaired!, But not same");
		}
		//String Method
		String str = "jhoni, jilla, jully, jally";
		int len = str.length();
		System.out.println("Length of the string is"+len);
		System.out.println(str.charAt(0)+" First and last One "+str.charAt(len-1));
		
		String s1 = str.toUpperCase();	
		System.out.println("Printing uppercase latter"+s1);
		
		String s2 = str.substring(3);
		System.out.println("Substring index is: "+s2);
		
		String s3 = str.substring(7, 10);
		System.out.println("Substring is in the index one "+s3);
		
		String s4 = str.replace('j', 'd');
		System.out.println("Replacing character :"+s4);
		
		char[] chArr = s4.toCharArray();
		for(char ch: chArr)
		System.out.print(ch+" ");
		}

}
