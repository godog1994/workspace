import objectdraw.*;
import java.awt.*;

// program to draw a Flag upon mouse click.

public class MakeFlags extends WindowController {

    // draws a Flag with upper left at point of click
    public void onMouseClick( Location point )
    {
        new Flag(point, canvas);
    }
}
        