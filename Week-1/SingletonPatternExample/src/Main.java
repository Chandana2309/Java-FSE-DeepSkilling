public class Main {
    public static void main(String[] args) {
        Logger logger1=Logger.getInstance();
        logger1.log("This is first log message.");

        Logger logger2=Logger.getInstance();
        logger2.log("This is second log message.");

        if(logger1==logger2) {
            System.out.println("logger1 and logger2 are the same instance.");
        }else {
           System.out.println("Singleton failed. Different instances exist.");
        }
    }
    
}
