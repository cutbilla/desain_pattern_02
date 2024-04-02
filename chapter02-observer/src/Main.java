//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Channel ch = new Channel("Billa Channel");
        User user1 = new User("Wika Wika");
        User user2 = new User("Jobot TV");
        User user3 = new User("Jinjit Karunia");

        ch.addSubcriber(user1);
        ch.addSubcriber(user2);
        ch.notifyUser("Ada video baru buat anda! Jangan lupa di subscribe ya!");

        user3.subscribe(ch);
        ch.notifyUser("Video baru!");
       }
}