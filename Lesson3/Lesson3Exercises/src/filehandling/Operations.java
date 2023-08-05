package filehandling;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.*;
import java.io.File;
import java.io.FileOutputStream;
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
	
	ArrayList<String> emails=new ArrayList<String>(); 
	
	public void addNewFile(String a) throws IOException {
		//I find .txt, if not I add it
		String pattern = ".txt";
		Pattern p = Pattern.compile(pattern);
		Matcher c = p.matcher(a);
		if (!c.find()) {
			a+=".txt";
		}
		File file = new File("//home//javiergonzalezv//Desktop//ExercisesTemp//"+a);
        if (file.createNewFile()){
          System.out.println("File is created!");
        }else{
          System.out.println("Sorry, file:\n "+file+"\nalready exists.");
        }
	}
	public void delFile(String a) throws IOException {
		File file = new File(a);
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
		
		String directory = "//home//javiergonzalezv//Desktop//ExercisesTemp//";
		File f = new File(directory);
		if(f.exists()) {
			File[] files = f.listFiles();
			for (File file: files) {
				if(file.isFile()) {
					System.out.println("File:\t"+file.getName());					
				}
				if(file.isDirectory()) {
					System.out.println("Directory:t"+file.getName());					
				}
			}
	
		}else {
			System.out.println("Sorry, Directory:\n  /home/javiergonzalezv/Desktop/ExercisesTemp/\n doesn't exist.");
		}
		
	}

}
