package ioOperations;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class CountCharacter {
	public static void main(String[] args) throws IOException {
		System.out.println("Enter the filename: ");
		Scanner sc = new Scanner(System.in);
		String fname = sc.next(); //FileName
		System.out.println("Enter the character to be counted: ");
		char toFind = sc.next().charAt(0); //Character to find
		int count=0; // Count of character
		FileInputStream fin = null;
		try {
			fin = new FileInputStream(fname);
            int i;
            while((i=fin.read())!= -1) {
               if(toFind == (char)i) {
            	   count++;
               }
            }
		}
		finally {
			System.out.println("File "+fname+" has "+count+" instances of letter "+toFind);
			if(fin != null)
            fin.close();
			sc.close();
        }
		
		
	}
}
