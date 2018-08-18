public class Player {
    private String name = "";
    private String coinOption = "";

    public String[] coinValue = {"Head", "Tails"};

    Player(String newName) {
        name = newName;
    }

    public String getCoinOption(){
        return coinOption;
    }

    public void setCoinOption(String opponentFlip){
        coinOption = opponentFlip;
    }

    public void didPlayerWin(String winningFlip){
        System.out.println(coinOption == winningFlip ? "wins" : " loses ");
        return ;
    }

    public String getName() {
        return name;
    }
}