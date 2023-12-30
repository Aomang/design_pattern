package AbFactory;

//ConcreteFactory2
public class SpainFactory implements InternationalFactory{
    @Override
    public Language createLanguage() {
        return new Spanish();
    }

    @Override
    public CapitalCity createCapitalCity() {
        return new Madrid();
    }
    
}
