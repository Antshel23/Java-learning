package rockpaperscissors;

public class Main {
    
    public static void main(String[] args) {
        Player player1 = new Player("Ant");
        Player player2 = new Player("CPU");
        Game game = new Game();

        player1.setChoice();
        player2.setChoice();

        game.setWinner(player1, player2);
        System.out.println(game.getWinner());
    }
}
