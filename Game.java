/* e-LEMON-ators */

import javax.swing.JFrame;

public class Game 
{
   public static void main(String[] args) throws Exception 
   {
      JFrame frame = new JFrame("Wandering the Woods");
      frame.setSize(600,600);
      frame.setLocation(200, 100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setResizable(false);
      frame.setDefaultLookAndFeelDecorated(true);
      frame.setContentPane(new HomePanel(frame));
      frame.setVisible(true);
   }
}
