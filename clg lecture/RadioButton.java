import javax.swing.*;

public class RadioButton {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Radio Button Example");

        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");

        male.setBounds(50, 50, 100, 30);
        female.setBounds(50, 90, 100, 30);

        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        JButton button = new JButton("Submit");
        button.setBounds(50, 140, 100, 30);

        button.addActionListener(e -> {
            if (male.isSelected())
                JOptionPane.showMessageDialog(frame, "Male selected");
            else if (female.isSelected())
                JOptionPane.showMessageDialog(frame, "Female selected");
            else
                JOptionPane.showMessageDialog(frame, "Please select an option");
        });

        frame.add(male);
        frame.add(female);
        frame.add(button);

        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}