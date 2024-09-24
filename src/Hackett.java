import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Hackett implements ActionListener{
    // Shopping List
    // 25 buttons
    // 19 labels

    // ActionListener Interface???
    private JFrame mainFrame;
    private JLabel statusLabel;
    private JLabel statusLabel1;
    private JLabel statusLabel2;
    private JLabel statusLabel3;
    private JLabel statusLabel4;
    private JLabel statusLabel5;
    private JLabel statusLabel6;
    private JLabel statusLabel7;
    private JLabel statusLabel8;
    private JLabel statusLabel9;
    private JLabel statusLabel10;
    private JLabel sL11;
    private JLabel sL12;
    private JLabel sL13;
    private JLabel sL14;
    private JLabel sL15;
    private JLabel sL16;
    private JLabel sL17;
    private JLabel sL18;
    private JLabel sL19;

    private JPanel masterControl;
    private JPanel topBorder;
    private JPanel bottomBorder;
    private JPanel leftBorder;
    private JPanel rightBorder;
    private JMenuBar mb;
    private JMenu file, edit, help;
    private JMenuItem cut, copy, paste, selectAll;
    private JTextArea ta; //typing area
    private JTextArea ta1;
    private int WIDTH=800;
    private int HEIGHT=700;

    public static void main(String[] args) {
        Hackett Practice = new Hackett();
        Practice.showEventDemo();
    }

    // To make empty areas: JLabel
//     statusLabel = new JLabel("", JLabel.CENTER);
//     statusLabel.setSize(350, 100);

    public Hackett() {
        prepareGUI();
    }

    private void prepareGUI() {
        // Sets up our "canvas"
        mainFrame = new JFrame("Leah learning Swing");
        mainFrame.setSize(WIDTH, HEIGHT); // Use this to change size
        mainFrame.setLayout(new BorderLayout());

        //menu at top
        cut = new JMenuItem("cut");
        copy = new JMenuItem("copy");
        paste = new JMenuItem("paste");
        selectAll = new JMenuItem("selectAll");
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);

//            mb = new JMenuBar();
//            file = new JMenu("File");
//            edit = new JMenu("Edit");
//            help = new JMenu("Help");
//            edit.add(cut);
//            edit.add(copy);
//            edit.add(paste);
//            edit.add(selectAll);
//            mb.add(file);
//            mb.add(edit);
//            mb.add(help);
        //end menu at top

        ta = new JTextArea();
        ta.setBounds(50, 5, WIDTH-100, HEIGHT-50);
        ta1 = new JTextArea();
        ta1.setBounds(50, 5, WIDTH-100, HEIGHT-50);

        //            mainFrame.setJMenuBar(mb); //set menu bar

        statusLabel = new JLabel("1", JLabel.CENTER);
        statusLabel.setSize(350, 100);
        statusLabel1 = new JLabel("3", JLabel.CENTER);
        statusLabel1.setSize(350, 100);
        statusLabel2 = new JLabel("5", JLabel.CENTER);
        statusLabel2.setSize(350, 100);
        statusLabel3 = new JLabel("7", JLabel.CENTER);
        statusLabel3.setSize(350, 100);
        statusLabel4 = new JLabel("1", JLabel.CENTER);
        statusLabel4.setSize(350, 100);
        statusLabel5 = new JLabel("3", JLabel.CENTER);
        statusLabel5.setSize(350, 100);
        statusLabel6 = new JLabel("5", JLabel.CENTER);
        statusLabel6.setSize(350, 100);
        statusLabel7 = new JLabel("7", JLabel.CENTER);
        statusLabel7.setSize(350, 100);
        statusLabel8 = new JLabel("3", JLabel.CENTER);
        statusLabel8.setSize(350, 100);
        statusLabel9 = new JLabel("3", JLabel.CENTER);
        statusLabel9.setSize(350, 100);
        statusLabel10 = new JLabel("7", JLabel.CENTER);
        statusLabel10.setSize(350, 100);
        sL11 = new JLabel("5", JLabel.CENTER);
        sL11.setSize(350, 100);
        sL11 = new JLabel("7", JLabel.CENTER);
        sL11.setSize(350, 100);

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        masterControl = new JPanel();
        masterControl.setLayout(new GridLayout(2, 2)); //set the layout of the panel

        topBorder = new JPanel();
        topBorder.setLayout(new GridLayout());
        bottomBorder = new JPanel();
        bottomBorder.setLayout(new GridLayout());
        leftBorder = new JPanel();
        leftBorder.setLayout(new GridLayout(5, 1));
        rightBorder = new JPanel();
        rightBorder.setLayout(new GridLayout());

//            controlPanel.add(statusLabel); Doing this later for the righto rder
        mainFrame.setVisible(true);
    }

    private void showEventDemo() {

        JButton button1 = new JButton("2");
        JButton button2 = new JButton("4");
        JButton button3 = new JButton("6");
        JButton button4 = new JButton("8");
        JButton button5 = new JButton("2");
        JButton button6 = new JButton("4");
        JButton button7 = new JButton("6");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("2");
        JButton button10 = new JButton("4");
        JButton button11 = new JButton("2");
        JButton button12 = new JButton("6");
        JButton button13 = new JButton("6");
        JButton button14 = new JButton("Top 1");
        JButton button15 = new JButton("Top 2");
        JButton button16 = new JButton("Top 3");
        JButton button17 = new JButton("Top 4");
        JButton button18 = new JButton("1");
        JButton button19 = new JButton("1");
        JButton button20 = new JButton("2");
        JButton button21 = new JButton("3");
        JButton button22 = new JButton("4");
        JButton button23 = new JButton("Top 1");
        JButton button24 = new JButton("Top 2");
        JButton button25 = new JButton("Top 3");
        JButton button26 = new JButton("Top 4");

//        button1.setActionCommand("button1");
//        button2.setActionCommand("button2");
//        button3.setActionCommand("button3");
//        button4.setActionCommand("button4");
//        button5.setActionCommand("button5");

//        button1.addActionListener(new ButtonClickListener());
//        button2.addActionListener(new ButtonClickListener());
//        button3.addActionListener(new ButtonClickListener());
//        button4.addActionListener(new ButtonClickListener());
//        button5.addActionListener(new ButtonClickListener());

       // Borders
        // Top
        topBorder.add(statusLabel);
        topBorder.add(button1);
        topBorder.add(statusLabel1);
        topBorder.add(button2);
        topBorder.add(statusLabel2);
        topBorder.add(button3);
        topBorder.add(statusLabel3);
        topBorder.add(button4);
        mainFrame.add(topBorder, BorderLayout.NORTH);

        // Bottom
        bottomBorder.add(statusLabel4);
        bottomBorder.add(button5);
        bottomBorder.add(statusLabel5);
        bottomBorder.add(button6);
        bottomBorder.add(statusLabel6);
        bottomBorder.add(button7);
        bottomBorder.add(statusLabel7);
        bottomBorder.add(button8);
        mainFrame.add(bottomBorder, BorderLayout.SOUTH);

        // Left
        leftBorder.add(button9);
        leftBorder.add(statusLabel8);
        leftBorder.add(button10);
        leftBorder.add(statusLabel9);
        leftBorder.add(button11);
        mainFrame.add(leftBorder, BorderLayout.WEST);

        mainFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Allows us
        if (e.getSource() == cut)
            ta.cut();
        if (e.getSource() == paste)
            ta.paste();
        if (e.getSource() == copy)
            ta.copy();
        if (e.getSource() == selectAll)
            ta.selectAll();
    }

    private class ButtonClickListener implements ActionListener {
        // Because it inherits ActionLister, it must have actionPerformed defined
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

//                if (command.equals("OK")) { // Checking what is being broadcasted
//                    statusLabel.setText("Ok Button clicked.");
//                } else if (command.equals("Submit")) {
//                    statusLabel.setText("Submit Button clicked.");
//                } else {
//                    statusLabel.setText("Cancel Button clicked.");
//                }
        }
    }
}
