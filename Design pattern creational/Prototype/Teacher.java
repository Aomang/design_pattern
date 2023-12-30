package Prototype;

//ConstructorPeototype1
public class Teacher extends Person{
    protected final String course;

    public Teacher(String name, String course){
        super(name);
        this.course = course;
    }

    public String getCourse(){
        return course;
    }
}
