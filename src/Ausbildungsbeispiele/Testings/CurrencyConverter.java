package Ausbildungsbeispiele.Testings;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CurrencyConverter {
    private JFrame frame;
    private JPanel panel;
    private JTextField text1, text2;

public CurrencyConverter(){
    frame = new JFrame("Currency Converter");
    frame.setSize(300,120);
    frame.setLocation(400,300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    panel = new JPanel();
    panel.setLayout(new GridLayout(3,2));
    frame.add(panel);

    panel.add(new JLabel("Euro"));
    text1 = new JTextField();
    text1.setHorizontalAlignment(SwingConstants.RIGHT);
    panel.add(text1);

    panel.add(new JLabel("Dollar"));
    text2 = new JTextField();
    text2.setHorizontalAlignment(SwingConstants.RIGHT);
    panel.add(text2);

    panel.add(new JLabel());
    JButton button = new JButton("convert");
    panel.add(button);

    button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ev) {
            try{
                double x = Double.parseDouble(text1.getText());
                text2.setText(String.format("%.2f",convert(x)));
            }
            catch (NumberFormatException e){
                text2.setText("???");
            }
        }
    });
    frame.setVisible(true);
}
double convert(double x){
    return  x * 1.08;
}

    public static void main(String[] args) {
        new CurrencyConverter();
    }
}
