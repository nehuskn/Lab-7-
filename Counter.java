import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Counter implements ActionListener {
  JLabel leftLabel;
  JLabel rightLabel;
  int leftCount;
  int rightCount;

Counter(){
  JFrame frame = new JFrame("Let's Count");
  frame.setLayout(new FlowLayout());
  frame.setSize(200,110);

  JButton left = new JButton("Left");
  JButton right = new JButton("Right");

  leftCount = 0;
  rightCount = 0;

  left.addActionListener(this);
  right.addActionListener(this);

  frame.add(left);
  frame.add(right);

  JLabel leftLabel = new JLabel("Count: " + leftCount);
  JLabel rightLabel = new JLabel("Count: " + rightCount);

  frame.add(leftLabel);
  frame.add(rightLabel);

  JButton reset = new JButton("Reset");
  reset.addActionListener(this);
  frame.add(reset);
  frame.setVisible(true);
  }
  public void actionPerformed(ActionEvent ae){

    if(ae.getActionCommand().equals("Left")) {
      leftCount++;
      leftLabel.setText("You Pressed Left!");
  }
    else if (ae.getActionCommand().equals("Right")) {
      rightCount++;
      rightLabel.setText("You Pressed Right!");
    }
    else if(ae.getActionCommand().equals("Reset")){
      rightCount = 0;
      leftCount = 0;
    }
    }
}
