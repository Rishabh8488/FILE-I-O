import java.io.*;
import java.util.*;							
class Demo
{
	public static void main(String abc[])
	{
		try
		{
			BufferedReader br=new BufferedReader(new FileReader("abcd.txt"));
			BufferedReader bir=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter what to find");
			String word=bir.readLine();
			boolean flag=false;
			String line="";
			int count=0;
			while((line=br.readLine())!=null)
			{
				StringTokenizer st=new StringTokenizer(line," ");
				while(st.hasMoreTokens())
				{
					String x=(String)st.nextToken();
					if(x.equals(word))
					{
						flag=true;
						count++;
					}
				}
			}
			if(flag)
			{
				System.out.println("Word was found in file");
				System.out.println("It was found "+count+" times");
				
			}
			else
			{
				System.out.println("Word was not found");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}