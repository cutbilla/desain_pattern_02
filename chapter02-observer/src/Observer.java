import java.util.Vector;

interface Observer{
    public void receiveNotification(String msg);
}

interface Observable{
    public void addSubcriber(User user);
    public void removeSubscriber(User user);
    public void notifyUser(String msg);
}

class User implements Observer{
    private final String name;

    public User(String name){
        this.name = name;
    }

    @Override
    public void receiveNotification(String msg) {
        System.out.println(msg);
    }

    public void subscribe(Channel channel){
        channel.addSubcriber(this);
    }

    public void unsubcribe(Channel channel){
        channel.removeSubscriber(this);
    }

    public String getName(){
        return name;
    }
}

class Channel implements Observable{
    private String name;
    private Vector<User> subscribers;

    public Channel(String name){
        this.name = name;
        this.subscribers = new Vector<User>();
    }

    @Override
    public void addSubcriber(User user) {
        subscribers.add(user);
    }

    @Override
    public void removeSubscriber(User user) {
        subscribers.remove(user);
    }

    @Override
    public void notifyUser(String msg) {
        System.out.println(name +  " post vidio baru!");
        String constructedMessage = String.format("%s: %s", name, msg);
        for(User user : subscribers){
            user.receiveNotification(constructedMessage);
        }
    }
}