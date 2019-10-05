import java.util.*;
import java.io.*;
class Demo
{
	public static void main(String arg[])
	{
		try
		{
			FileInputStream fis=new FileInputStream("abc.txt");
			BufferedInputStream br=new BufferedInputStream(fis);
			int r=0;
			System.out.println("File content :");
			while((r=br.read())!=-1)					// -1 is end of file
			{
				System.out.print((char)r);						//typecasting to char
			}
			fis.close();
			System.out.println("End of File");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}