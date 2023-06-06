import java.util.Scanner;
import java.io.*;
public class lab12_1{
	public static void main(String[] args) {
		Scanner sc=null;
		PrintWriter pw=null;
		try{
			sc=new Scanner(new File("abc.txt"));
			pw=new PrintWriter("cdf.txt");
			String line;
			while(sc.hasNext()){				
				line=sc.nextLine();
				pw.println(line);
				System.out.println(line);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			pw.close();
			sc.close();
		}
	}
}