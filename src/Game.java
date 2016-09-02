/**
 * Created by BLEED on 9/1/2016.
 */
import java.util.Scanner;
public class Game {
    //Declartions

    public void startGame(StoryDialouge dialouge, Choices choice) {

        dialouge.wakeUp();
        //scene 1

        switch(choice.fightFlight()) {
            case "fight": dialouge.ending1stFight(); break;
            case "flight": dialouge.ending1stEscape();; break;
            default: dialouge.panic();
        }
        //scene 2
        switch(choice.fightFlight()) {
            case "fight": dialouge.ending2ndFight(); break;
            case "flight": dialouge.ending2ndEscape();; break;
            default: dialouge.panic();
        }
        //scene 3
        switch(choice.fightFlight()) {
            case "fight": dialouge.ending3rdFight(); break;
            case "flight": dialouge.ending3rdEscape();; break;
            default: dialouge.panic();
        }
       //final scene
        switch(choice.fightFlight()) {
            case "fight": dialouge.endingFinalFight(); break;
            case "flight": dialouge.endingFinalEscape();; break;
            default: dialouge.panic();
        }


    }



    //method
    public static String readString(){
        String inputString;
        Scanner scanner = new Scanner(System.in);
        return inputString = scanner.next();
    }


}
