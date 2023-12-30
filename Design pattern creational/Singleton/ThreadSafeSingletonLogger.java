package Singleton;

public class ThreadSafeSingletonLogger extends SingletonBase {
    private static ThreadSafeSingletonLogger instance;

    private ThreadSafeSingletonLogger() {

    }

    public static synchronized ThreadSafeSingletonLogger getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingletonLogger();
        }
        return instance;
    }
}
