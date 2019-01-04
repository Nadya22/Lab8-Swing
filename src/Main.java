import  javax.swing.*;

public class Main{
    static JFrame jFrame = getFrame();

    static JPanel jPanel = new JPanel();

    public static void main(String[] args) throws Exception {
        jFrame.add(jPanel);
        jPanel.add(new JLabel("Ежедневник"));
        jPanel.add(new JTextField("Планы на сегодня", 40));
        JTextField jTextField = new JTextField();
        jTextField.getText();
        JTextArea jTextArea = new JTextArea(5, 40);
        jTextArea.setLineWrap(true);
        JScrollPane jScrollPane = new JScrollPane(jTextArea);
        jPanel.add(jScrollPane);
        jPanel.revalidate();
    }

    static JFrame getFrame(){
        JFrame jFrame = new JFrame(){};
        jFrame.setVisible(true);
        jFrame.setBounds(750, 250, 500, 200);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return jFrame;
    }
}