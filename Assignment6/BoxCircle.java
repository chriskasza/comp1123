import javax.swing.*;

public class BoxCircle
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("BoxCircle");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      frame.getContentPane().add(new BoxCirclePanel());

      frame.pack();
      frame.setVisible(true);
   }
}
