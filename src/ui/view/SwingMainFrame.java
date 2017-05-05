package ui.view;

import javax.swing.*;
import java.awt.BorderLayout;

public class SwingMainFrame extends JFrame {

    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;
    private static final String IMPORT = "Import";
    private static final String EXPORT = "Export";
    private static final String FILE = "File";

    private JPanel mainPanel;
    private JFileChooser fileChooser;
    private JTextField loginField;
    private JPasswordField passwordField;
    private JButton databaseEntryButton;
    private JTable table;
    private JScrollPane scroll;
    private JTabbedPane tabbedPane;
    private JTextField textField1;
    private JButton importButton;
    private JButton exportButton;

    public SwingMainFrame() {
        super("DataBase + xml");
        setSize(WIDTH, HEIGHT);

        mainPanel =  new JPanel();
        mainPanel.setLayout(new BorderLayout());

        initTable();


        fileChooser = new JFileChooser();
//        setContentPane(mainPanel);
        JMenuItem myItem1 = new JMenuItem(IMPORT);
        JMenuItem myItem2 = new JMenuItem(EXPORT);
        JMenu topMenu = new JMenu(FILE);
        JMenuBar bar = new JMenuBar();
        topMenu.add(myItem1);
        topMenu.addSeparator();
        topMenu.add(myItem2);
        bar.add(topMenu);


        getContentPane().add(scroll, BorderLayout.CENTER);
        getContentPane().add(bar, BorderLayout.NORTH);
        setLocationRelativeTo(null);
    }

    private void initTable(){

        String[] columnName = new String[]{"Id", "First Name", "Last Name", "Sex"};
        Object[][] data = {{new Integer(1),  "Oleg", "Myskin", "male"},
                           {new Integer(2),  "Alex", "Smith", "male"}};
        table = new JTable(data,columnName);
        scroll = new JScrollPane(table);
    }
}
