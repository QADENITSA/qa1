package Home.work7;

import java.util.IntSummaryStatistics;
import java.util.List;

public class SoccerTeam {

    private String nameTeam;

    private List<Players> playersList;

    public SoccerTeam() {
    }

    public SoccerTeam(String nameTeam, List<Players> playersList) {
        this.nameTeam = nameTeam;
        this.playersList = playersList;
    }

    public String getNameTeam() {
        return nameTeam;
    }

    public void setNameTeam(String nameTeam) {
        this.nameTeam = nameTeam;
    }


    public List<Players> getPlayersList() {
        return playersList;
    }

    public void setPlayersList(List<Players> playersList) {
        this.playersList = playersList;
    }

    public int getAvrRating() {

        List<Players> players = playersList;
        IntSummaryStatistics avr = players.stream().mapToInt(Players::getRating).summaryStatistics();
        return (int) avr.getAverage();
    }
}
