package ioOperations;
import java.io.*;
import java.util.*;

public class FileWordCount {
	    public static void main(String[] args) throws Exception {
	    	File inFile = new File("F:\\Snippets\\inputFile.txt");
	    	File outFile = new File("F:\\Snippets\\outputFile.txt");
	        BufferedReader reader = new BufferedReader(new FileReader(inFile));
	        Map<String,Integer> map=new TreeMap<String,Integer>();
	        String line="";
	        while((line=reader.readLine())!=null){
	        	String str[] = line.split(" ");
	        	for(int j=0;j<str.length;j++) {
	        		if(!map.containsKey(str[j]))
	        			map.put(str[j],1);
	        		else
	        			map.put(str[j],map.get(str[j])+1);
	        	}
	        }
	        	reader.close();
	        FileWriter writer = new FileWriter(outFile);
	        for(String key : map.keySet()){
	            writer.write(key+"\t:"+map.get(key));  
	            writer.write('\n');
	        }
	        writer.close();
	        System.out.println(outFile.getName()+" is created and sorted.");
	    }
	  }