import org.code.theater.*;
import org.code.media.*;

/**
 * Write a description of you show here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyShow
{
    public static void main(String[] args) {
        Scene myScene = new Scene();
        
        myScene.clear("black");
        
        Image curtains = new Image("CurtainFrame.png");
        myScene.drawImage(curtains, 0, 0, 400);
        
        myScene.setTextColor("White");
        myScene.setTextStyle(Font.SANS, FontStyle.BOLD);
        myScene.drawText("Welcome!", 156, 215);
        
        Theater.playScenes(myScene);
    }
}
