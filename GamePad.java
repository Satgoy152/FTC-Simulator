import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePad implements KeyListener {
    static int  speedx = 3;
    static int  speedy = 0;

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT ) {
            System.out.println("Right");
            speedx++;
            //Right arrow key code
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT ) {
            System.out.println("Left");
            speedx--;
            //Left arrow key code
        } else if (e.getKeyCode() == KeyEvent.VK_UP ) {
            System.out.println("Up");
            speedy--;
            //Up arrow key code
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN ) {
            System.out.println("Down");
            speedy++;
            //Down arrow key code
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
}
