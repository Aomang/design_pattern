package Singleton;

public class LazyInitialzedSingletonLogger extends SingletonBase {
    private static LazyInitialzedSingletonLogger instance;

    private LazyInitialzedSingletonLogger() {

    }

    public static LazyInitialzedSingletonLogger getInstance() {
        if (instance == null) {
            instance = new LazyInitialzedSingletonLogger();
        }
        return instance;
    }
}
