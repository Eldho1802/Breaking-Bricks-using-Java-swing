package brickBreaker;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame obj = new JFrame();
        Game gamePlay = new Game();
        obj.setBounds(10,10,700,600);
        obj.setTitle("BreakPoint");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlay);

    }
}
