import java.io.*;
import java.util.*;							
class Demo
{
	public static void main(String abc[])
	{
		try
		{
			BufferedReader br=new BufferedReader(new FileReader("abcd.txt"));
			String line="";
			int count=0;
			while((line=br.readLine())!=null)
			{
				StringTokenizer st=new StringTokenizer(line," ");
				while(st.hasMoreTokens())
				{
					String x=(String)st.nextToken();
					System.out.println(x);
					count++;
				}
			}
			System.out.println("Number of Words "+count);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}