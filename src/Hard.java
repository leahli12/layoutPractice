import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Hard implements ActionListener{
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
    private JPanel masterControl;
    private JPanel controlPanel;
    private JPanel controlPanel1;
    private JPanel controlPanel2;
    private JMenuBar mb;
    private JMenu file, edit, help;
    private JMenuItem cut, copy, paste, selectAll;
    private JTextArea ta; //typing area
    private JTextArea ta1;
    private int WIDTH=800;
    private int HEIGHT=700;

    public static void main(String[] args) {
        Hard Practice = new Hard();
        Practice.showEventDemo();
    }

    // To make empty areas: JLabel
//     statusLabel = new JLabel("", JLabel.CENTER);
//     statusLabel.setSize(350, 100);

    public Hard() {
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

        statusLabel = new JLabel("0", JLabel.CENTER);
        statusLabel.setSize(350, 100);
        statusLabel1 = new JLabel("0", JLabel.CENTER);
        statusLabel1.setSize(350, 100);
        statusLabel2 = new JLabel("0", JLabel.CENTER);
        statusLabel2.setSize(350, 100);
        statusLabel3 = new JLabel("0", JLabel.CENTER);
        statusLabel3.setSize(350, 100);
        statusLabel4 = new JLabel("0", JLabel.CENTER);
        statusLabel4.setSize(350, 100);
        statusLabel5 = new JLabel("Top 0", JLabel.CENTER);
        statusLabel5.setSize(350, 100);
        statusLabel6 = new JLabel("Top 0", JLabel.CENTER);
        statusLabel6.setSize(350, 100);
        statusLabel7 = new JLabel("Top 0", JLabel.CENTER);
        statusLabel7.setSize(350, 100);
        statusLabel8 = new JLabel("Top 0", JLabel.CENTER);
        statusLabel8.setSize(350, 100);
        statusLabel9 = new JLabel("Top 0", JLabel.CENTER);
        statusLabel9.setSize(350, 100);
        statusLabel10 = new JLabel("TopRight", JLabel.CENTER);
        statusLabel10.setSize(350, 100);

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        masterControl = new JPanel();
        masterControl.setLayout(new GridLayout(2, 2)); //set the layout of the panel

        controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout()); //set the layout of the panel
        controlPanel1 = new JPanel();
        controlPanel1.setLayout(new GridLayout(3, 3)); //set the layout of the panel
        controlPanel2 = new JPanel();
        controlPanel2.setLayout(new GridLayout(2, 2)); //set the layout of the panel

        masterControl.add(controlPanel1);
        masterControl.add(controlPanel2);
//            controlPanel.add(statusLabel); Doing this later for the righto rder
        mainFrame.setVisible(true);
    }

    private void showEventDemo() {

        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("Top 1");
        JButton button6 = new JButton("Top 2");
        JButton button7 = new JButton("Top 3");
        JButton button8 = new JButton("Top 4");
        JButton button9 = new JButton("1");



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

       // BOTTOM
        controlPanel.add(statusLabel);
        controlPanel.add(button1);
        controlPanel.add(statusLabel1);
        controlPanel.add(button2);
        controlPanel.add(statusLabel2);
        controlPanel.add(button3);
        controlPanel.add(statusLabel3);
        controlPanel.add(button4);
        controlPanel.add(statusLabel4);

        // LEFT
        controlPanel1.add(statusLabel5);
        controlPanel1.add(button5);
        controlPanel1.add(statusLabel6);
        controlPanel1.add(button6);
        controlPanel1.add(statusLabel7);
        controlPanel1.add(button7);
        controlPanel1.add(statusLabel8);
        controlPanel1.add(button8);
        controlPanel1.add(statusLabel9);

        // RIGHT
        controlPanel2.add(statusLabel10);
        controlPanel2.add(button9);

        masterControl.add(ta);
        masterControl.add(ta1);

//        mainFrame.add(button3);
//        mainFrame.add(button4);
//        mainFrame.add(button5);
        mainFrame.add(controlPanel, BorderLayout.SOUTH);
        mainFrame.add(masterControl);

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
