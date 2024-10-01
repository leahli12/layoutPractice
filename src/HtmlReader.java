import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class HtmlReader implements ActionListener {
    // ActionListener Interface???
    public HtmlRead html = new HtmlRead();
    private JFrame mainFrame;
    private JTextArea statusLabel;
    private JPanel controlPanel;
    private JMenuBar mb;
    private JMenu file, edit, help;
    private JMenuItem cut, copy, paste, selectAll;
    private JTextArea ta; //typing area
    private JTextArea ta1;
    private String taInput;
    private int WIDTH=800;
    private int HEIGHT=700;
    private ArrayList<String> links = html.getLinks();
    private ArrayList<String> validLinks = new ArrayList<>();
    private JScrollPane scroll;


    public HtmlReader() {
        prepareGUI();
    }

    public static void main(String[] args) {
        HtmlReader htmlReader = new HtmlReader();
        htmlReader.showEventDemo();
    }

    private void prepareGUI() {
        // Sets up our "canvas"
        mainFrame = new JFrame("Leah learning Swing");
        mainFrame.setSize(WIDTH, HEIGHT); // Use this to change size
        mainFrame.setLayout(new GridLayout(5, 1));

        //menu at top
        cut = new JMenuItem("cut");
        copy = new JMenuItem("copy");
        paste = new JMenuItem("paste");
        selectAll = new JMenuItem("selectAll");
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);

//        mb = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);
//        mb.add(file);
//        mb.add(edit);
//        mb.add(help);
        //end menu at top

        ta = new JTextArea("Keyword goes here");
        taInput = ta.getText();
        ta1 = new JTextArea("URL goes here");
        ta.setBounds(50, 5, -20, -20);
//        mainFrame.add(mb);  //add menu bar
        mainFrame.add(ta);//add typing area
        ta1.setBounds(50, 5, -20, -20);
//        mainFrame.setJMenuBar(mb); //set menu bar
        mainFrame.add(ta);
        mainFrame.add(ta1);

        statusLabel = new JTextArea("Links go here");
        scroll = new JScrollPane(statusLabel);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
//        statusLabel.setSize(350, 100);

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        controlPanel = new JPanel();
        controlPanel.setLayout(new BorderLayout()); //set the layout of the panel

        mainFrame.add(controlPanel);
//        mainFrame.add(statusLabel);
        mainFrame.add(scroll);
        mainFrame.setVisible(true);
    }

    private void showEventDemo() {

        JButton okButton = new JButton("OK");
        JButton submitButton = new JButton("Submit");
        JButton cancelButton = new JButton("Cancel");

        okButton.setActionCommand("OK"); // Sets the message that will be broadcasted to Java when it is clicked
        submitButton.setActionCommand("Submit");
        cancelButton.setActionCommand("Cancel");

        okButton.addActionListener(new ButtonClickListener());
        submitButton.addActionListener(new ButtonClickListener());
        cancelButton.addActionListener(new ButtonClickListener());

        controlPanel.add(okButton, BorderLayout.EAST);
        controlPanel.add(submitButton, BorderLayout.WEST);
        controlPanel.add(cancelButton, BorderLayout.CENTER); // if using BorderLayout, these three buttons would stack on each other

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
            String ta1Input = ta1.getText();
            html.newURL(ta1Input);

            if (command.equals("OK")) { // Checking what is being broadcasted
                taInput = ta.getText();

                for(int i = 0; i < links.size(); i++){
                    String temp = html.keywordChecker(taInput, i);
                    if (!(temp.equals("none"))){
                        validLinks.add(links.get(i));
                    }
                }
                String validLinksString = stringConverter(validLinks);
                statusLabel.setText(validLinksString);
                if (validLinksString.equals("")){
                    statusLabel.setText("None found!");
                }

            } else if (command.equals("Submit")) {
                statusLabel.setText("Submit Button clicked.");
            } else {
                statusLabel.setText("Cancel Button clicked.");
            }
        }
    }

    public String stringConverter(ArrayList<String> allLinks){
        String workingString = "";
        for(int i = 0; i < allLinks.size(); i++){
            if(i != (allLinks.size() - 1)){
                workingString += allLinks.get(i);
                workingString += "\n";
            } else {
                workingString += allLinks.get(i);
            }
        }
        return workingString;
    }
}