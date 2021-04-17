package StringOperation;

import java.util.*;
public class Charact {
	
	@SuppressWarnings("unused")
	private static void charr() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Character: ");
		char[] ca = scan.nextLine().toCharArray();
		for(int i = ca.length-1; i >= 0; i--) {
			System.out.print(ca[i]);
		}
		scan.close();
	}
	@SuppressWarnings("unused")
	private static void check1(String x) {
		char[] ch = x.toCharArray();
		int Letter = 0;
		int Digit = 0;
		int Space = 0;
		int Other = 0;
		for(int i = 0; i < ch.length; i++) {
			if(Character.isLetter(ch[i])) {
				
				Letter ++;
			}else if(Character.isDigit(ch[i])) {
				
				Digit ++;
			}else if(Character.isSpaceChar(ch[i])) {
				
				Space ++;
			}else {
				
				Other ++;
			}
		}
		System.out.println("Latter is :  "+Letter);
		System.out.println("Digit is : "+Digit);
		System.out.println("Space is : "+Space);
		System.out.println("And Other Are : "+Other);
		
	}
	@SuppressWarnings("unused")
	private static void check2(int n) {
		int amount = 0;
		for(int i = 1; i <= n; i++) {
			for(int j = i; j <= n; j++) {
				for(int k =j; i <= n; k++) {
					if(k != i && k != j && i != j) {
						System.out.println(i+""+j+""+k); 
						amount ++;
					}else {
						break;
					}
				}
			}
		}System.out.println("Total number is: "+amount);
	}
	@SuppressWarnings("unused")
	private static void reverse() {
		int [] arr = new int [] {1 ,2 , 3, 4};
		System.out.print("Reserse Number is : ");
		for(int i = arr.length-1; i >= 0; i--) {
			
			System.out.print(arr[i]);
		}
	}
	@SuppressWarnings("unused")
	private static void minmax() {
		int []arr = new int[] {5, 4, 8, 1, 9, 3};
		for(int i = arr.length-1; i >= 0; i--) {
			
		}
	}
	private static void duplicateArray() {
		int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 2, 8, 3};   
        
        System.out.println("Duplicate elements in given array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[i]);  
            }  
        }  
	}
	public static void main(String[] args) {
		//check1("This id 565 2 @ . ?? dd");
		//charr();
		//check2(4);
		//reverse();
		duplicateArray();
	}
}
