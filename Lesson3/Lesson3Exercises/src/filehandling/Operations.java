package filehandling;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.*;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Operations {
	
	String defdirectory = new String("//home//javiergonzalezv//Desktop//ExercisesTemp//"); 
	public void workDirectory(String a) throws IOException {
		
		//String directory = "//home//javiergonzalezv//Desktop//ExercisesTemp//";
		
		String directory = new String();
		for (int i=0;i<a.length();i++) {
			directory+=a.charAt(i);
			if (a.charAt(i)=='/') {
				directory+="/";
			}
		}
		File f = new File(directory);
		if(f.exists()) {
			System.out.println("OK, Work Directory exists.");	
			defdirectory= f.toString();	
		}else {
			System.out.println("Sorry, Directory:\n  "+a+"\n doesn't exist.");
		}
		
	}
	public void addNewFile(String a) throws IOException {
		//I find .txt, if not I add it
		String pattern = ".txt";
		Pattern p = Pattern.compile(pattern);
		Matcher c = p.matcher(a);
		if (!c.find()) {
			a+=".txt";
		}
		File file = new File(defdirectory+a);
        if (file.createNewFile()){
          System.out.println("File is created!");
        }else{
          System.out.println("Sorry, file:\n "+file+"\nalready exists.");
        }
	}
	public void delFile(String a) throws IOException {
		File file = new File(defdirectory+a);
		try {
			if (file.exists()) {
				file.delete();
				System.out.println("File is deleted!");
			}else {
				System.out.println("Sorry, file:\n "+file+"\n doesn't exist.");
			}
		}catch (Exception e) {
    		System.out.println("Sorry, file:\n "+file+"\n cannot be deleted.");
    		System.out.println(e);
    	}
	}
	public void listFiles(String a) throws IOException {
		
		//String directory = "//home//javiergonzalezv//Desktop//ExercisesTemp//";
		
		String directory = new String();

		if (a.equals("d")) {
			directory= defdirectory;
		}else {
			for (int i=0;i<a.length();i++) {
				directory+=a.charAt(i);
				if (a.charAt(i)=='/') {
					directory+="/";
				}
			}
		}
		File f = new File(directory);
		if(f.exists()) {
			File[] files = f.listFiles();
			for (File file: files) {
				if(file.isFile()) {
					System.out.println("File:\t"+file.getName());					
				}
				if(file.isDirectory()) {
					System.out.println("Directory:\t"+file.getName());					
				}
			}
	
		}else {
			System.out.println("Sorry, Directory:\n "+a.replace("//", "/")+"\n doesn't exist.");
		}
		
	}
	
	public void writeFile(String a, String b) throws IOException {
		String directory = new String();
		if (a.equals("d")) {
			directory= defdirectory;
		}else {
			for (int i=0;i<a.length();i++) {
				directory+=a.charAt(i);
				if (a.charAt(i)=='/') {
					directory+="/";
				}
			}
		}
		try {
			File f = new File(directory);
			if (f.exists()) {
				File file = new File(directory+b);
				if (file.exists()) {
					DataInputStream dis = new DataInputStream(System.in);
					FileOutputStream fos = new FileOutputStream(file.toString(),true);
					System.out.println("Please enter the data you want to write on the file (type ENTER to finish)");
					int ch;
					fos.write((int)'\n');
					while( (ch = dis.read()) != '\n') {		// when we hit enter key it will stop reading data. 
						fos.write(ch);	// in file automatically convert it
					
					}
				}else {
					System.out.println("Sorry, file: "+file+"doesn't exists.");
				}
			}else {
				System.out.println("Sorry, directory: "+f.getName().replace("//", "/")+"doesn't exists.");
			}
		}catch (Exception e) {
    		System.out.println("Sorry, try again");
    		System.out.println(e);
    	}

	}
	public void readFile(String a, String b) throws IOException {
		String directory = new String();
		if (a.equals("d")) {
			directory= defdirectory;
		}else {
			for (int i=0;i<a.length();i++) {
				directory+=a.charAt(i);
				if (a.charAt(i)=='/') {
					directory+="/";
				}
			}
		}
		try {
			File f = new File(directory);
			if (f.exists()) {
				File file = new File(directory+b);
				if (file.exists()) {
					System.out.println("Reading file: ");
					FileReader readfile = new FileReader(file);
					int leter;
					String text = new String(" ");
					while ((leter=readfile.read()) != -1) {
						text+=(char)leter;
					}
					System.out.println(text.replace("\n", "\n "));
					readfile.close();
				}else {
					System.out.println("Sorry, file: "+file+"doesn't exists.");
				}
			}else {
				System.out.println("Sorry, directory: "+f.getName().replace("//", "/")+"doesn't exists.");
			}
		}catch (Exception e) {
    		System.out.println("Sorry, try again");
    		System.out.println(e);
    	}

	}

}
