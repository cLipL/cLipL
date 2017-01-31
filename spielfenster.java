/**
 * Created by Joschua on 31.01.2017.
 */
import ch.aplu.jgamegrid.*;
import java.awt.Color;


public class spielfenster extends GameGrid
{
    public spielfenster(){

        super(20, 20 , 45, Color.green);
        show();
    }

    public static void main(String[] args)
    {

        new spielfenster();
    }



}