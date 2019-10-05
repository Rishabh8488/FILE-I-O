import java.io.*;
class Demo
{
	public static void main(String arg[])
	{
		try
		{
			FileInputStream fis=new FileInputStream("abc.txt");
			int r=0;												// stored in bytes, 0 is starting of file
			System.out.println("File content :");
			while((r=fis.read())!=-1)					// -1 is end of file
			{
				System.out.print((char)r);						//typecasting to char
			}
			fis.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}