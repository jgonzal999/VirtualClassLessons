package email;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.*;

public class Operations {
	
	ArrayList<String> emails=new ArrayList<String>(); 
	
	public void addEmail(String a) {
		emails.add(a);
		System.out.println("New email added!\n");
	}
	public boolean delEmail(String a) {
		Iterator<String> itr=emails.iterator();
		boolean find=false;
		while(itr.hasNext()){
			String b=itr.next();
			//System.out.println("Email: "+b+" intro:"+a+"\n");
			if(b.compareTo(a)==0) {
				find=true;
				emails.remove(emails.indexOf(b));
				System.out.println("Email: "+b+" removed\n");
			}
			
		} 
		return find;
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
