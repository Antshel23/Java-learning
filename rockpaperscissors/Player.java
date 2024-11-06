package rockpaperscissors;

import java.util.Random;

public class Player {
String name;
String choice;
int winCount;

    public Player(String name) {
        this.name = name;
    }

    public void setChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        Random rand = new Random();
        this.choice = choices[rand.nextInt(choices.length)];
    }

    public String getChoice() {
        return this.choice;
    }

    public String getName() {
        return this.name;
    }

    public int getWinCount() {
        return this.winCount;
    }

}
