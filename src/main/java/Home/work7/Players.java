package Home.work7;

public class Players {
    // endurance, sprinting, dribbling, passing and shooting
    private String namePlayer;
    private int endurance;
    private int sprinting;
    private int dribbling;
    private int passing;
    private int shooting;

    public Players() {
    }

    public Players(String namePlayer, int endurance, int sprinting, int dribbling, int passing, int shooting) {
        this.namePlayer = namePlayer;
        this.endurance = endurance;
        this.sprinting = sprinting;
        this.dribbling = dribbling;
        this.passing = passing;
        this.shooting = shooting;
    }

    public String getNamePlayer() {
        return namePlayer;
    }

    public void setNamePlayer(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    public int getRating() {

        return (endurance + sprinting + dribbling + passing + shooting)/5;
    }

}
