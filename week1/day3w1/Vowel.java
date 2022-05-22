package com.masai;

public class Vowel {
	char inp;
	public static void main(String[] args) {
		Vowel d1 = new Vowel();
		
		char consonant = 'z';
		char vowel = 'A';
		char nonalphabet = '@';
		
		d1.fun1(consonant);
		d1.fun1(vowel);
		d1.fun1(nonalphabet);
	}
	
	void fun1(char inp){
		if((inp>='a' && inp <= 'z') || (inp>='A' && inp<='Z') ) {
			if(inp == 'a' || inp == 'e' || inp == 'i' || inp == 'o' || inp == 'u' ||inp == 'A' ||inp == 'E' ||inp == 'I' ||inp == 'O' ||inp == 'U' ) {
				System.out.println(inp+ " "+ "is a Vowel");
			}
			else {
				System.out.println(inp+ " "+ "is a Consonant");
			}
		}
		else {
			System.out.println(inp+ " "+ "Character is not an alphabet");
		}
	}

}
