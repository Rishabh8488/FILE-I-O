import java.util.*;
import java.io.*;
class FileWriteDemo
{
	public static void main(String arg[])
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the name of the file");
			String name=sc.nextLine();
			FileOutputStream fos= new FileOutputStream(name+".txt",true); //true opens in append mode without true it will create a new file
			System.out.println("Enter the content of the file");
			String str="";
			while(!str.equals("stop"))
			{
				str=sc.nextLine();
				byte [] b=str.getBytes();//converts string to bytes
				fos.write(b);
			}
			fos.close();
			System.out.println("File Saved");
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}