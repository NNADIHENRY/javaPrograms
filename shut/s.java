public class ShutDown{
public static void main(String args[]) throws I0Exception{
Runtime runtime=Runtime.getRuntime();
process proc = runtime.exec("shutdown-s-t 0");
System.exit(0);
}
}