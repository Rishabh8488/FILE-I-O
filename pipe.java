import java.io.*;
class Demo
{
	public static void main(String abc[])
	{
		try
		{
			PipedInputStream pis=new PipedInputStream();
			PipedOutputStream pos=new PipedOutputStream();
			pos.connect(pis);
			WriteThread wt=new WriteThread(pos);
			ReadThread rt=new ReadThread(pis);
			wt.start();
			rt.start();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
class WriteThread extends Thread
{
	private PipedOutputStream pos;
	public WriteThread(PipedOutputStream pos)
	{
		this.pos=pos;
	}
	public void run()
	{
		try
		{
			for(int i=65;i<=90;i++)
			{
				Thread.sleep(1000);
				pos.write(i);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
class ReadThread extends Thread
{
	private PipedInputStream pis;
	public ReadThread(PipedInputStream pis)
	{
		this.pis=pis;
	}
	public void run()
	{
		try
		{
			for(int i=65;i<=90;i++)
			{
				Thread.sleep(1000);
				System.out.print((char)pis.read);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}