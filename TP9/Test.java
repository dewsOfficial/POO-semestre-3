import javax.swing.*;
import java.awt.*;
class Test{
    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                Palette palette = new Palette();
            }
        });

    }
}
