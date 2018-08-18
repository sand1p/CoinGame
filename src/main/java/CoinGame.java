import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class CoinGame {

    private Player players[] = new Player[2];
    private Coin coin = new Coin();

    public static void main(String[] args){
        CoinGame game = new CoinGame("Ramesh", "Suresh");
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Game starts ");
            game.play(game);
            System.out.println("To play more type y : ");
        } while(sc.next().startsWith("y"));

    }

    public CoinGame(String player1Name, String player2Name) {
         players[0]= new Player(player1Name);
         players[1] = new Player(player2Name);
    }

    public void play(CoinGame game) {
        Player playerChosen = Math.random() > 0.5 ? players[0] : players[1];
        String prediction = coin.getCoinOption();
        playerChosen.setCoinOption(prediction);
        System.out.println("Coin Is tossed");
        String winningFlip = coin.getCoinOption();
        System.out.print(playerChosen.getName()+ " " ) ;
        playerChosen.didPlayerWin(winningFlip);
    }

}

