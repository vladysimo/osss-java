//This basic application will copy a file from a location to another

import java.io.*;

public class CopyClass {
	
	public static void main(String[] args) throws IOException {
	
		if (args.length!=2 && args.length!=3 )
		{
			System.out.println("Invalid number of argument.\n Usage: CopyClass [OPTION]...SOURCE...DEST");
		}
		
		else
			{
		
			File f = new File(args[args.length-2]);
			File g = new File(args[args.length-1]);

			if(g.exists() && args.length == 2)
				System.out.println("Error: File already exists!");
		
			else
			{
				InputStream is = new FileInputStream(f);
				OutputStream os = new FileOutputStream(g);
			     
				byte[] buffer = new byte[1024];
				int length, s = 0;

			 	while ((length = is.read(buffer)) > 0) {
			 		os.write(buffer, 0, length);
			            	s += length;
			        }
			     
				is.close();
				os.close();
					
				System.out.println(s);
			
			}

		}
	}
}