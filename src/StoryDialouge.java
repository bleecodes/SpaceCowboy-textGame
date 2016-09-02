/**
 * Created by BLEED on 9/1/2016.
 */
public class StoryDialouge extends Game {

    //start of game
    public void wakeUp(){
        System.out.println("You wake up from a deep cold slumber. You look around and notice that you're in some type\n" +
                "of chamber. There is fogged glass in front of you and you see faint figures moving around.\nIt seems " +
                "like orders are be shouted. The door opens and you see two men in military attire.\n");
    }


    public void ending1stFight(){}//win

    public void ending1stEscape(){}//win

    public void ending2ndFight(){}//lose

    public void ending2ndEscape(){}//win

    public void ending3rdFight(){}//win

    public void ending3rdEscape(){}//lose

    public void endingFinalFight(){}//win

    public void endingFinalEscape(){}//win

    public void playAgain(){}//true or false?

    public void panic(){System.out.println("Cowboys don't panic...");}

}