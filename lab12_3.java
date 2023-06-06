import java.util.Scanner;
import java.io.*;
public class lab12_3{
	public static void main(String[] args) {
		Scanner sc=null;
		PrintWriter pw=null;
		PrintWriter pw1=null;
		PrintWriter pw2=null;
		try{
			sc=new Scanner(new File("abc.txt"));
			pw=new PrintWriter("cdf.txt");
			pw1=new PrintWriter("png.txt");
			pw2=new PrintWriter("smt.txt");
			String line;
			while(sc.hasNext()){				
				line=sc.nextLine();
				pw.println(line);
				pw1.println(line);
				pw2.println(line);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			pw.close();
			pw1.close();
			pw2.close();
			sc.close();
		}
	}
}