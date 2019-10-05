import java.io.*;
class DataRead
{
	public static void main(String abc[])
	{
		try
		{
			DataInputStream dis=new DataInputStream(new FileInputStream("abc1.txt"));
			System.out.println("Information of File");
			System.out.println("String: "+dis.readUTF());
			System.out.println("Integer: "+dis.readInt());
			System.out.println("Double: "+dis.readDouble());
			System.out.println("Boolean: "+dis.readBoolean());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}