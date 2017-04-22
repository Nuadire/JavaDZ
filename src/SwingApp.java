

import java.awt.BorderLayout;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class SwingApp extends JFrame {
	JFileChooser fileChooser = new JFileChooser();
	
	public SwingApp() {
		super("Lesson28");
		JMenuItem myItem1 = new JMenuItem("Import");
        JMenuItem myItem2 = new JMenuItem("Export");
        JMenu topMenu = new JMenu("File");
        JMenuBar bar = new JMenuBar();        
		 
		JTable table = new JTable(new String[][]{
                new String[]{"11", "12", "13", "14"},
                new String[]{"21", "22", "23", "24"}},
                new String[]{"ID", "Name", "PAN", "State"});

        JScrollPane scroll = new JScrollPane(table);
        
        myItem1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                fileChooser.setDialogTitle("Choose directory");
                int result = fileChooser.showOpenDialog(SwingApp.this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();

                    try (final InputStream is = new FileInputStream(file);
                         final Reader rdr = new InputStreamReader(is, "CP1251");
                         final BufferedReader brdr = new BufferedReader(rdr)) {



                    }
                    catch (IOException exc) {
                        exc.printStackTrace();
                    }
                }
            }

        });

        myItem2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                fileChooser.setDialogTitle("Choose directory");
                int result = fileChooser.showOpenDialog(SwingApp.this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();


                }

            }

        });
        
        topMenu.add(myItem1);
        topMenu.addSeparator();
        topMenu.add(myItem2);
        bar.add(topMenu);
        
        getContentPane().add(scroll, BorderLayout.CENTER);
        getContentPane().add(bar, BorderLayout.NORTH);
        
        pack();
        setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingApp();

	}

}
