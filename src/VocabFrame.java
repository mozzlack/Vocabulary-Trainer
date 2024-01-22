import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VocabFrame extends JFrame implements ActionListener {
    public VocabFrame() {
        setSize(400,150);
        setTitle("Vocab-Trainer ");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container pane = getContentPane();
        pane.setLayout(new BorderLayout());
        checkButton.addActionListener(this::actionPerformed);
        JPanel nPanel = new JPanel(new FlowLayout());
        JPanel pPanel = new JPanel(new FlowLayout());
        JPanel cPanel = new JPanel(new FlowLayout());

        add(nPanel,BorderLayout.NORTH);
        add(pPanel,BorderLayout.CENTER);
        add(cPanel,BorderLayout.SOUTH);


        nPanel.add(frontSide);
        nPanel.add(fieldFront);
        Dimension d = new Dimension(100,20);
        fieldFront.setPreferredSize(d);

        nPanel.add(backSide);
        nPanel.add(fieldBack);
        fieldBack.setPreferredSize(d);

        pPanel.add(rLabel);
        pPanel.add(rField);
        rField.setPreferredSize(d);

        cPanel.add(checkButton);

        //init with first word from VocabSet;


    }

    private JButton checkButton = new JButton("Check!");
    private JLabel frontSide = new JLabel("Front: ");
    private JLabel backSide = new JLabel("Back: ");
    private JTextField fieldFront = new JTextField("");
    private JTextField fieldBack = new JTextField("");
    private JLabel rLabel = new JLabel("Result: ");
    private JTextField rField = new JTextField("");



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == checkButton) {
            String eingabeVocab = fieldBack.getText();
            rField.setText(eingabeVocab);
        }
    }
}
