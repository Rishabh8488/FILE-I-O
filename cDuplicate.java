import java.io.*;
class copyDemo
{
	public static void main(String arg[])
	{
		try
		{
			FileInputStream fis=new FileInputStream("abc.txt");
			FileOutputStream fos=new FileOutputStream("abcd.txt");
			int r=0;
			while((r=fis.read())!=-1) // This checks for the end of the file.
			{
				fos.write(r);
			}
			fis.close();
			fos.close();
			System.out.println("File has been copied");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}