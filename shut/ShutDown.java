public class ShutDown{
public static void main(String args[]) throws 10Exception{
Runtime runtime=Runtime.getRuntime();
Process proc = runtime.exec("shutdown-s-t 0");
System.exit(0);
}
}