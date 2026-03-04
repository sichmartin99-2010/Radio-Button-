import javax.swing.*;
import java.awt.event.*;

public class PetSelector {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Pet Selector");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        // Create radio buttons
        JRadioButton bird = new JRadioButton("Bird");
        JRadioButton cat = new JRadioButton("Cat");
        JRadioButton dog = new JRadioButton("Dog");
        JRadioButton rabbit = new JRadioButton("Rabbit");
        JRadioButton pig = new JRadioButton("Pig");

        // Group them (only one can be selected)
        ButtonGroup group = new ButtonGroup();
        group.add(bird);
        group.add(cat);
        group.add(dog);
        group.add(rabbit);
        group.add(pig);

        // Add action listener
        ActionListener action = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JRadioButton selected = (JRadioButton) e.getSource();
                JOptionPane.showMessageDialog(frame,
                        "You selected: " + selected.getText());
            }
        };

        bird.addActionListener(action);
        cat.addActionListener(action);
        dog.addActionListener(action);
        rabbit.addActionListener(action);
        pig.addActionListener(action);

        // Add to panel
        panel.add(bird);
        panel.add(cat);
        panel.add(dog);
        panel.add(rabbit);
        panel.add(pig);

        frame.add(panel);
        frame.setVisible(true);
    }
}
