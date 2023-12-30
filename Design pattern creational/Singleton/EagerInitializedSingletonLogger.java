package Singleton;

public class EagerInitializedSingletonLogger extends SingletonBase{
    private static final EagerInitializedSingletonLogger instance = new EagerInitializedSingletonLogger();

    //make sure client can't use the constructor to create a new instance
    private EagerInitializedSingletonLogger() {
    
    }

    public static EagerInitializedSingletonLogger getInstance() {
        return instance;
    }
}