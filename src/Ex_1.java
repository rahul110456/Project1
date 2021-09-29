

import java.io.File;
import java.io.IOException;

public class Ex_1 
{
public static void main(String[] args) throws IOException
{
	File x=new File("C:\\Files\\12.xls");
	if(!(x.exists()))
	{
		x.createNewFile();
	}
	if(x.exists())
	{
		
	}
}
}
