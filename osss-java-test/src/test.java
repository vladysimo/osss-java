import java.io.*;
import java.util.*;

//ArrayList si iteratori

public class test {
	
	static ArrayList<Integer> al = new ArrayList<Integer>();
	
	public static void main(String[] args) throws IOException {
		
		Random r = new Random();
		for (int i = 0; i < 10; i++)
			al.add(r.nextInt());
		
		//how to use an interator
		
		/*
		Iterator<Integer> it;
		it = al.iterator();
		
		while(it.hasNext()) {
			
			Integer a = it.next();
			System.out.println(a);
		}
		
		for(Integer x : al)
			//System.out.println(x);
		*/
		
		//reading and writing in files
		
		PrintWriter writer = new PrintWriter("file.out", "UTF-8");
		
		File f = new File("test_file");	
		FileReader fr = new FileReader(f);
		
		BufferedReader br = new BufferedReader(fr);
		
		try {
			String line = br.readLine();
			while(line != null && line.length() > 0) {
				//System.out.println(line);
				writer.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		br.close();
		writer.close();
	
		
	}
}
