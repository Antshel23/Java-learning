package rockpaperscissors;

public class Game {
String winner;
int drawCount;

public void setWinner(Player player1, Player player2) {
    if ((player1.choice.equals("rock")) && (player2.choice.equals("scissors")) ||
        (player1.choice.equals("paper")) && (player2.choice.equals("rock")) ||
        (player1.choice.equals("scissors")) && (player2.choice.equals("paper"))
    ) {
        player1.winCount++;
        this.winner = player1.getName();
    }
    else if (player1.choice.equals(player2.choice)) {
    drawCount++;
    this.winner = "draw";
    }
    else {
        player2.winCount++;
        this.winner = player2.getName();
    }
}

public String getWinner() {
    return this.winner;
}


}
