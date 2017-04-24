package ui.controller;

import ui.view.MainFrame;

import javax.swing.*;

public class MainFrameController {



    private MainFrame mainFrame;
    private JButton databaseEntryButton;

    public MainFrameController() {

        initComponents();
    }

    private void initComponents() {
        mainFrame = new MainFrame();

        databaseEntryButton = mainFrame.getDatabaseEntryButton();

    }

    public void showMainFrameWindows(){
        mainFrame.setVisible(true);
    }


}
