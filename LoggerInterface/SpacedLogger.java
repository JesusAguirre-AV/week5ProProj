package LoggerInterface;
/*3.b SpacedLogger class implements Logger*/
public class SpacedLogger implements Logger{
	public SpacedLogger() {}

	@Override
	public void log(String a) {
		// TODO 5.a) adds a space between each character of a String
		StringBuilder x = new StringBuilder();
		for(int i=0; i<a.length(); i++)
		{
			x.append(a.charAt(i));
			x.append(" ");
		}
		System.out.println(x.toString());
	}

	@Override
	public void error(String b) {
		// TODO 5.b) same as log method above but prepended by ERROR:
		StringBuilder x = new StringBuilder();
		x.append("ERROR: ");
		for(int i=0; i<b.length(); i++)
		{
			x.append(b.charAt(i));
			x.append(" ");
		}
		System.out.println(x.toString());
	}

}
