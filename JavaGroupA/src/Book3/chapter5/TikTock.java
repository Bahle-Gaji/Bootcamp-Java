package Book3.chapter5;

import java.awt.event.*;
import javax.swing.*;

public class TikTock {
    public static void main(String[] args) {
        //create timer that calls the Ticker class, at 1 sec intervals
        Timer t = new Timer(1000, new Ticker());
        t.start();
        JOptionPane.showMessageDialog(null, "Click OK to exit program");
    }
}

class Ticker implements ActionListener {

    private boolean tick = true;

    public void actionPerformed(ActionEvent e) {
        if (tick) {
            System.out.println("Tick...");
        } else {
            System.out.println("Tock...");
        }
        tick = !tick;
    }
}


