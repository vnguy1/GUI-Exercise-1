import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IntegerVerifier extends JFrame implements ActionListener {

    private JLabel label;
    private JTextField textField;

    public IntegerVerifier() {
        super("Integer Verifier");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        textField = new JTextField(10);
        add(textField);

        JButton verifyButton = new JButton("Verify");
        verifyButton.addActionListener(this);
        add(verifyButton);

        JButton exitButton = new JButton("Cancel");
        exitButton.addActionListener(this);
        add(exitButton);

        label = new JLabel("Enter an integer value.");
        add(label);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getActionCommand().equals("Verify")) {
            String input = textField.getText();
            try {
                int value = Integer.parseInt(input);
                label.setText(value + " is an integer.");
            } 
            catch (NumberFormatException e) {
                label.setText(input + " is not an integer.");
            }
        } 
        else if (event.getActionCommand().equals("Cancel")) {
            dispose();
        }
    }

    public static void main(String[] args) {
        new IntegerVerifier();
    }
}
