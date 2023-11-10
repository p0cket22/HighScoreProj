import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HighScoreGui extends JFrame {

    public static JTextField textField;
    private String[] arrayToDisplay = {"Item 1", "Item 2", "Item 3", "Item 4"};

    public HighScoreGui() {
        // Set up the frame
        setTitle("High Scores");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create components
        textField = new JTextField();
        textField.setEditable(false);
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(2,2));




        String[] buttonNames={"Snake","Mario","PacMan","Galega"};
        int[] arrayIndex= {1,2,3,4};


        for (int i = 0; i < arrayIndex.length; i++) {
            JButton buttons = new JButton(buttonNames[i]);
            buttons.addActionListener(new ButtonClickListener(arrayIndex[i]-1));

            System.out.println(arrayIndex[i]);
            buttonPanel.add(buttons);
        }
        // Set up the layout
        setLayout(new BorderLayout());

        // Add components to the frame
        add(textField, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.WEST);







    }

    private class ButtonClickListener implements ActionListener {
        private int arrayIndex;
        Class<?>[] classes ={HighScorecsv.Snake.class,HighScorecsv.Mario.class,HighScorecsv.PacMan.class,HighScorecsv.Galega.class};

        public ButtonClickListener(int arrayIndex) {
            this.arrayIndex = arrayIndex;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (arrayIndex >= 0 && arrayIndex < arrayToDisplay.length) {
                try{
                    classes[arrayIndex].getMethod("method").invoke(null);
                }catch (Exception x){
                    x.printStackTrace();
                }
                textField.setText("Invalid Array Index");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            HighScoreGui arrayDisplayGUI = new HighScoreGui();
            arrayDisplayGUI.setVisible(true);
        });
    }
}

