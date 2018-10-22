public class Shut{
public static void shutdown() throws RuntimeException, 10Exception{
String shutdownCommand;
String operatingSystem=System.getProperty("os.name");
Runtime.getRuntime().exec(shutdownCommand);
System.exit(0);
}
}