import java.util.Scanner;


public class StringOperation {
	
	Integer i,j;
	
	/*
	 * Compare to string
	 * @param s - An Object, representing the other string to be compared
	 * @return flag - An int value:
	 * 			* 1 - if the strings are matched
	 * 			* 0 - if the strings are not matched
	 */
	private int compare(String s1, String s2){
		int flag = 1;
		if(s1.length() == s2.length()){
			for(i=0; i < s1.length(); i++ ){
				if(s1.charAt(i)!=s2.charAt(i)){
					flag = 0;
					return flag;
				}
			}
		}
		else{
			flag = 0;
		}
				
		return flag;
	}
	
	/*
	 * Reverse of string
	 * @param s - An Object, representing the other string to be reversed
	 * @return Reverse String as an object
	 */
	private String reverse(String s){
		String reverseString = new String();
		
		for (i = s.length()-1; i>=0; i--){
			reverseString+=s.charAt(i);
		}
		
		return reverseString;
	}
	
	/*
	 * Change case of string
	 * @param s - An Object, representing the string
	 * @return changed string as an object
	 */
	private String changeCase(String s){
		StringBuilder new_str = new StringBuilder(s);
		Character ch;
		for(i=0; i<new_str.length();i++){
			ch = new_str.charAt(i);
			if(Character.isLowerCase(ch)){
				new_str.setCharAt(i,Character.toUpperCase(ch) );
			}
			else{
				if(Character.isUpperCase(ch)){
					new_str.setCharAt(i,Character.toLowerCase(ch) );
				}
			}
		}
		String result = new String(new_str);
		return result;
	}
	/*
	 * Find Largest word of string
	 * @param s - An Object, representing the string
	 * @return Largest word
	 */
	private String findLargestWord(String s){
		String[] tokens = s.split(" ");
		Integer max = 0;
		String word = null;
		for (String token : tokens)
		{
		    if(token.length()>=max){
		    	max = token.length();
		    	word = token;
		    }
		}
		return word;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringOperation obj = new StringOperation();
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		
		while(flag){
			System.out.println("\n\nMENU : \n"
					+ "1. Compare the 2 strings \n"
					+ "2. Reverse a String \n"
					+ "3. Change Case of the String \n"
					+ "4. Find largest word in string \n"
					+ "0. Exit \n");
			System.out.println("Enter your choice: ");
			int choice = input.nextInt();
			switch(choice){
			case 0 : flag = false;
			 		 break;
			case 1 : System.out.println("Enter first string: ");
					 input.nextLine();
					 String s1 = input.nextLine();
					 System.out.println("Enter second string: ");
					 String s2 = input.nextLine();
					 int res = obj.compare(s1, s2);
					 if(res ==1){
						 System.out.println("Result : Two strings do match");
					 }
					 else if(res ==0){
						 System.out.println("Result : Two strings do not match");
					 }
					 break;
					
			case 2 : System.out.println("Enter a string: ");
			 		 input.nextLine();
					 String s = input.nextLine();
					 System.out.println("Reverse of the string: "+obj.reverse(s));
					 break;
					
			case 3 : System.out.println("Enter a string: ");
					 input.nextLine(); 
					 s = input.nextLine();
					 System.out.println("Changed case of the string: "+obj.changeCase(s));
					 break;
					
			case 4 : System.out.println("Enter a string: ");
					 input.nextLine();
					 s = input.nextLine();
					 System.out.println("Largest word of the string: "+obj.findLargestWord(s));
					 break;
							
			
			default: System.out.println("Wrong choice! Try again.");
							 
			}
		}
	
		input.close();
	}

}
