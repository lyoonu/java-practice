package labs2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PasswordInfo {

	public static void main(String[] args) {
		
		String filename = "C:\\JavaWorkspace\\Files\\PassInfo.txt";
		String[] passWords = new String[13];
		String passWord = null;
		File file = new File(filename);
	
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			for(int i=0; i<passWords.length; i++) {
				//passWord = passWords[i];
				passWords[i] = br.readLine();
			}			
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: File not found: " + filename);
			
		} catch (IOException e) {
			System.out.println("ERROR: Could not read the data: " + filename);
			
		} 
		
		
		
		// Verify the number
		// 1. Check the passWords one by one
		for (int i=0; i<passWords.length; i++) {
			passWord = passWords[i];
		//	System.out.println(passWord);
		
			try {
				// 2. Parsing one passWord
	
				// 3. Check if there is number or not
				int k=0;
				
				do {
				
					k++;
					System.out.println(k);
					
					String n = String.valueOf(k);
					System.out.println(n);
					
					if (!passWord.contains(n)) {
						throw new NumberIncludeException(passWord);
					}
				
				
				}while(k==9);
				
				
				
				
			} catch (NumberIncludeException e) {
			//	System.out.println("ERROR: Password must include number");
			//	System.out.println(e.toString());
	
			}
		
		}
		
		
		
		
		
		
		
		System.out.println(passWord);

	}

}


class NumberIncludeException extends Exception {
	String num;
	NumberIncludeException(String num){
		this.num = num;
	}
	public String toString() {
		return ("NumberIncludeException: " + num);
	}
}


