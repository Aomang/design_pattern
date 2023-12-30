package AbFactory;

//ConcreteFactory1
public class EnglandFactory implements InternationalFactory{
    @Override
    public Language createLanguage() {
        return new English();
    }

    @Override
    public CapitalCity createCapitalCity() {
        return new London();
    }
    
}
