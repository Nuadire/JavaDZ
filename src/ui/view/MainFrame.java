package ui.view;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;
    private static final String IMPORT = "Import";
    private static final String EXPORT = "Export";
    private static final String FILE = "File";

    private JPanel mainPanel;
    private JTextField loginField;
    private JPasswordField passwordField;
    private JButton databaseEntryButton;
    private JTable table;
    private JTabbedPane tabbedPane;
    private JTextField textField1;
    private JButton importButton;
    private JButton exportButton;

    public MainFrame() {
        super("DataBase + xml");
        setSize(WIDTH, HEIGHT);

        setContentPane(mainPanel);
//        JMenuItem myItem1 = new JMenuItem(IMPORT);
//        JMenuItem myItem2 = new JMenuItem(EXPORT);
//        JMenu topMenu = new JMenu(FILE);
//        JMenuBar bar = new JMenuBar();
//        topMenu.add(myItem1);
//        topMenu.addSeparator();
//        topMenu.add(myItem2);
//        bar.add(topMenu);


//        getContentPane().add(scroll, BorderLayout.CENTER);
//        getContentPane().add(bar, BorderLayout.NORTH);
        setLocationRelativeTo(null);
    }

    public JButton getDatabaseEntryButton() {
        return databaseEntryButton;
    }

}
