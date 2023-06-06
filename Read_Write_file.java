import java.util.Scanner;
import java.io.*;
public class Read_Write_file{
	public static void main(String[] args) {
		Scanner sc = null;
		PrintWriter pw = null;
		try{
			sc=new Scanner(new File("a.txt"));
			pw=new PrintWriter("b.txt");
			String line;
			while(sc.hasNext()){
				line=sc.nextLine();
				pw.println(line);
			}
		}
		catch(Exception e){
			System.out.println("File not found");
		}
		finally{
			sc.close();
			pw.close();
		}
	}
}