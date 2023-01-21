package Home.work7;

import java.util.Arrays;

public class DemoSoccerTeam {
    public static void main(String[] args) {

        Players players1 = new Players("Ivan", 50, 80, 90, 40, 20);
        Players players2 = new Players("Dragan", 30, 45, 56, 33, 54);
        Players players3 = new Players("Petko", 51, 78, 53, 61, 42);
        Players players4 = new Players("Dimo", 84, 74, 78, 30, 33);

        SoccerTeam soccerTeam = new SoccerTeam("CSKA", Arrays.asList(players1, players2, players3, players4));

        System.out.println(soccerTeam.getNameTeam() + "-" + soccerTeam.getAvrRating());

        System.out.println(players1.getNamePlayer() + "-" + players1.getRating());

        System.out.println(players2.getNamePlayer() + "-" + players2.getRating());

        System.out.println(players3.getNamePlayer() + "-" + players3.getRating());

        System.out.println(players4.getNamePlayer() + "-" + players4.getRating());

    }
}
