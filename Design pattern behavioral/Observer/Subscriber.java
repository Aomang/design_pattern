public class Subscriber {
    private String name;
    private Channel chanel = new Channel();

    public Subscriber(String name){
        super();
        this.name=name;
    }

    public void update(){
        System.out.println("Hey "+name+" video Uploded : "+chanel.title);
    }

    public void SubscribeChannel(Channel ch){
        this.chanel= ch;
    }
}
