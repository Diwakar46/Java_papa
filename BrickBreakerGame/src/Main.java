import javax.swing.*;


public class Main {
    public static void main(String[] args) {

        JFrame obj=new JFrame();
        Gameplay gamePlay = new Gameplay();

        obj.setBounds(10, 10, 700, 700);
        obj.setTitle("Breakout Ball");//this sets title
        obj.setResizable(false);//this makes the screen unresizable
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Closes on exit
        obj.add(gamePlay);
        obj.setVisible(true);//makes the screen visible

    }
}
