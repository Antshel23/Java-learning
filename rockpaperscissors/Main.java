package rockpaperscissors;

public class Main {
static int player1Win = 0;
static int draw = 0;
static int player2Win = 0;

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
        runGame();
        }
        System.out.println(player1Win+"-"+draw+"-"+player2Win);
        }


    static void runGame() {
        Player player1 = new Player("Ant");
        Player player2 = new Player("CPU");
        Game game = new Game();

        player1.setChoice();
        player2.setChoice();
        game.setWinner(player1, player2);
        if (game.getWinner().equals(player1.name)) {
            System.out.println(player1.name);
            player1Win++;
        }
        else if (game.getWinner().equals(player2.name)) {
            System.out.println(player2.name);
            player2Win++;
        }
        else {
            System.out.println("draw");
            draw++;
        }

  
    }
}
