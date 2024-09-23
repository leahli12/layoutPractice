import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Medium2 implements ActionListener{
    // ActionListener Interface???
    private JFrame mainFrame;
    private JLabel statusLabel;
//    private JLabel statusLabel1;
//    private JLabel statusLabel2;
    private JPanel masterControl;
    private JPanel controlPanel;
//    private JPanel controlPanel1;
    private JMenuBar mb;
    private JMenu file, edit, help;
    private JMenuItem cut, copy, paste, selectAll;
    private JTextArea ta; //typing area
    private int WIDTH=800;
    private int HEIGHT=700;

    public static void main(String[] args) {
        Medium2 Practice = new Medium2();
        Practice.showEventDemo();
    }

    // To make empty areas: JLabel
    // statusLabel = new JLabel("", JLabel.CENTER);
    // statusLabel.setSize(350, 100);

    public Medium2() {
        prepareGUI();
    }

    private void prepareGUI() {
        // Sets up our "canvas"
        mainFrame = new JFrame("Leah learning Swing");
        mainFrame.setSize(WIDTH, HEIGHT); // Use this to change size
        mainFrame.setLayout(new GridLayout(3, 3));

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
//            mainFrame.add(mb);  //add menu bar
//            mainFrame.add(ta);//add typing area
//            mainFrame.setJMenuBar(mb); //set menu bar

        statusLabel = new JLabel("label", JLabel.CENTER);
        statusLabel.setSize(350, 100);
//        statusLabel1 = new JLabel("label 2", JLabel.CENTER);
//        statusLabel1.setSize(350, 100);
//        statusLabel2 = new JLabel("", JLabel.CENTER);
//        statusLabel2.setSize(350, 100);

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        masterControl = new JPanel();
        masterControl.setLayout(new BorderLayout()); //set the layout of the panel

        controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout()); //set the layout of the panel
//        controlPanel1 = new JPanel();
//        controlPanel1.setLayout(new GridLayout()); //set the layout of the panel

        mainFrame.add(controlPanel);
//        masterControl.add(controlPanel);
//        masterControl.add(controlPanel1);
//            controlPanel.add(statusLabel); Doing this later for the righto rder
        mainFrame.setVisible(true);
    }

    private void showEventDemo() {

        JButton button1 = new JButton("button 1");
        JButton button2 = new JButton("button 2");
        JButton button3 = new JButton("button 3");
        JButton button4 = new JButton("button 4");
        JButton button5 = new JButton("button 5");
        JButton button6 = new JButton("button 6");
        JButton button7 = new JButton("button 7");
        JButton button8 = new JButton("button 8");
        JButton button9 = new JButton("button 9");
        JButton button10 = new JButton("button 10");

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

        masterControl.add(controlPanel);
        masterControl.add(button10, BorderLayout.SOUTH);
        controlPanel.add(statusLabel);
        controlPanel.add(button9);

        mainFrame.add(button1);
        mainFrame.add(button2);
        mainFrame.add(button3);
        mainFrame.add(button4);
        mainFrame.add(masterControl);
        mainFrame.add(button5);
        mainFrame.add(button6);
        mainFrame.add(button7);
        mainFrame.add(button8);
//        mainFrame.add(button3);
//        mainFrame.add(button4);
//        mainFrame.add(button5);

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
