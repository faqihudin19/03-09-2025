package BuPashaTugas;

public class prisonTest {
    public static void main(String[] args) {
        prisoner bubba = new prisoner();
        prisoner twitch = new prisoner();
        bubba.name = "bubba";
        bubba.height = 2.08;
        bubba.sentence = 4;
        twitch.name = "twitch";
        twitch.height = 1.73;
        twitch.sentence = 3;
        System.out.println(bubba);
        System.out.println(twitch);
        System.out.println(bubba == twitch);
        twitch.name = "bubba";
        twitch.height = 2.08;
        twitch.sentence = 4;
        System.out.println(bubba == twitch);
        bubba.think();
        twitch.think();
    }
}
