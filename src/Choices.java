/**
 * Created by BLEED on 9/1/2016.
 */
public class Choices extends Game{


    public String fightFlight(){
        String input;
        System.out.println("Fight or Flight?");
        input = readString().toLowerCase();

        if(input.equals("fight") || input.equals("flight")) return input;
        else return input = "panic";

    }
}
