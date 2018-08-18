public class Coin {
    private String coinOption = "";
    private String[] coinValues = {"Head","Tail"};

    public String getCoinOption() {
       return Math.random() > 0.5 ? coinValues[0] : coinValues[1] ;
    }

}
