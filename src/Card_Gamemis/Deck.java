package Card_Gamemis;

public class Deck {

    public void toDisplay(){
        for(Ranks r :Ranks.values()){
            for(Suits s: Suits.values()) {
                System.out.println(r + "of" + s);
            }

        }
    }
}
