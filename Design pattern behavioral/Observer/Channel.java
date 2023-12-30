import java.util.ArrayList;
import java.util.List;

public class Channel {
    private List<Subscriber> subs= new ArrayList<>();
     String title;

    public void Subscribe(Subscriber sub){
        subs.add(sub);
    }

    public void unsubscribe(Subscriber sub){
        subs.remove(sub);
    }

    public void Notify(){
        for(Subscriber sub : subs){
            sub.update();
        }
    }

    public void Uploded(String title){
        this.title=title;
        Notify();
    }
}
