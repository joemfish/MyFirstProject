package com.promineotech;

public class LoopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String userWord = "C#";
		String longString = "";
		
//		System.out.println(userWord += longString);
		
			for (int i = 0; i < userWord.length(); i++) {
		    longString += userWord;
		    
		    
		}
			System.out.println(longString);
		
	    }
	}