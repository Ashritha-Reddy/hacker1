package gmailpractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class testingtextfiles {

	public static void main(String[] args) throws IOException  {
		File f1=new File("C://testing1//ashritha.txt");
		FileReader fr=new FileReader(f1);
		BufferedReader br=new BufferedReader(fr);
		
		File f2=new File("C://testing1//ashritharesult.txt");
		FileWriter fw=new FileWriter(f2);
		BufferedWriter bw=new BufferedWriter(fw);
		String l="";
		while((l=br.readLine())!=null)
		{
		String[] p=l.split(",")	;
		for(int i=0;i<p.length;i++)
		{
		bw.write(p[i]);
		bw.newLine();
		}
		}
		
	
	br.close();
	fr.close();
	
	bw.close();
	fw.close();
	
	
	
		
		
}
}



