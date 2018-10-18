package ioOperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCopy {
	public static void main(String[] args) throws IOException {
		System.out.println("Enter the input file name:");
		Scanner sc = new Scanner(System.in);
		String finName = sc.next();
		System.out.println("Enter the output file name:");
		String foutName = sc.next();
		FileInputStream fin = null;
		FileOutputStream fout = null;
		try {
			fin = new FileInputStream(finName);
			fout = new FileOutputStream(foutName);
			int c;
			while((c=fin.read()) != -1) {
				fout.write(c);
			}
		}
		finally {
			if(fin != null)
				fin.close();
			if(fout!=null)
				fout.close();
			System.out.println("File copied successfully.");
			sc.close();
		}
	}

}
