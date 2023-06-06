import java.io.*;
public class lab_12_2{
	public static void main(String[] args) {
		FileReader f1 = null;
		BufferedReader br = null;
		PrintWriter p1 = null;
		PrintWriter p2 = null;
		try{
			f1=new FileReader("abc.txt");
			br=new BufferedReader(f1);
			p1=new PrintWriter("cdf.txt");
			p2=new PrintWriter("png.txt");
			String line;
			while((line=br.readLine()) != null){
				p1.println(line);
				p2.println(line);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			p1.close();
			p2.close();
		}
	}
}