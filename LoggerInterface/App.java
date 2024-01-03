package LoggerInterface;
//6. create a class called App to run a main function 
public class App {
	
	public static void main(String[] args)
	{
		//a. instantiate the logger classes that implement the Logger interface
		Logger aster = new AsteriskLogger();
		Logger spacer = new SpacedLogger();
		//b. test the the methods of the instantiated classes
		aster.log("Jav");
		aster.error("You");
		spacer.log("tom");
		spacer.error("Space");
	}
}
