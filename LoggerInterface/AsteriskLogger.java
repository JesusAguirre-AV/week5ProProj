package LoggerInterface;

/*3.a AsteriskLogger class implements Logger*/
public class AsteriskLogger implements Logger{
	public AsteriskLogger() {}
	
	@Override
	public void log(String a) {
		// TODO 4.a) Prints received String with three asterisks on both sides
		System.out.println("***"+a+"***");
	}

	@Override
	public void error(String b) {
		// TODO 4.b) Prints asterisks top and bottom and ***ERROR: (string)*** in between
		StringBuilder x = new StringBuilder("***ERROR: ");
		StringBuilder y = new StringBuilder();
		x.append(b);
		x.append("***");
		for(int i=0; i<x.toString().length(); i++)
		{
			y.append("*");
		}
		System.out.println(y.toString());
		System.out.println(x.toString());
		System.out.println(y.toString());
	}

}