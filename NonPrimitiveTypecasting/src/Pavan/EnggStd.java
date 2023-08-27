package Pavan;

public class EnggStd extends Student {
	
	String stream;

	EnggStd()
	{
		
	}
	
	EnggStd(String name,int sid,String stream)
	{
		super(name,sid);
		this.stream=stream;
	}
}
