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
	public ArrayList searchEmail(String a) {
		ArrayList<String> emailsfounded=new ArrayList<String>(); 
		String pattern = a;
		Pattern p = Pattern.compile(pattern);
		Iterator<String> itr=emails.iterator();
		while(itr.hasNext()){
			String b=itr.next();
			Matcher c = p.matcher(b);
			if(c.find()) {
				emailsfounded.add(b);
			}			
		} 
		return emailsfounded;
	}

}
