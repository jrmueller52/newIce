import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame myFrame = new JFrame();
        myFrame.setSize(500,300);

        JLabel output = new JLabel();

        JPanel myPanel = new JPanel();
        myPanel.setBackground(new Color(253, 170,230));
        JLabel label = new JLabel("Ice Cream Shop");
        JButton button1 = new JButton("Chocolate");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                output.setText("Chocolate, any toppings?");
            }
        });

        JButton button2 = new JButton("Vanilla");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                output.setText("Vanilla, any toppoings?");
            }
        });

        JLabel label2 = new JLabel("Choose 2 toppings");
        JTextField textfield1 = new JTextField(10);
        JTextField textfield2 = new JTextField(10);
        ImageIcon icon = new ImageIcon("images/cones.png");
        icon.setImage(icon.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT));
        JLabel picLabel = new JLabel(icon);


        myPanel.add(label);
        myPanel.add(button1);
        myPanel.add(button2);
        myPanel.add(output);

        myPanel.add(label2);
        myPanel.add(textfield1);
        myPanel.add(textfield2);
        myPanel.add(picLabel);






//4 Add the panel to the frame
        myFrame.add(myPanel);


//5 Display the frame
        myFrame.setVisible(true);
    }


}

