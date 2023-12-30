public class Youtube{

    public static void main(String[] args) {
        Channel Meaw = new Channel();
        Subscriber s1 = new Subscriber("manow");
        Subscriber s2 = new Subscriber("png");
        Subscriber s3 = new Subscriber("Non");
        Subscriber s4 = new Subscriber("pun");
        Subscriber s5 = new Subscriber("aom");

        Meaw.Subscribe(s1);
        Meaw.Subscribe(s2);
        Meaw.Subscribe(s3);
        Meaw.Subscribe(s4);
        Meaw.Subscribe(s5);

        Meaw.unsubscribe(s5);

        s1.SubscribeChannel(Meaw);
        s2.SubscribeChannel(Meaw);
        s3.SubscribeChannel(Meaw);
        s4.SubscribeChannel(Meaw);
        s5.SubscribeChannel(Meaw);

        Meaw.Uploded("Red cat");
    }
}