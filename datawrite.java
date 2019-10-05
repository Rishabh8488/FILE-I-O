import java.io.*;
class DataWrite
{
	public static void main(String abc[])
	{
		try
		{
			DataOutputStream dos=new DataOutputStream(new FileOutputStream("abc1.txt"));
			dos.writeUTF("All is good");		//UTF=universal text Format(String)
			dos.writeInt(100);					//Integer
			dos.writeDouble(3.14);									//Only one value can be stored here
			dos.writeBoolean(true);
			System.out.println("Data Saved");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}