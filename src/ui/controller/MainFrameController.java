package ui.controller;

import ui.view.SwingMainFrame;

import javax.swing.*;

public class MainFrameController {



    private SwingMainFrame sMF;
    private JButton databaseEntryButton;

    public MainFrameController() {

        initComponents();
    }

    private void initComponents() {
        sMF = new SwingMainFrame();
    }

    public void showMainFrameWindows(){
        sMF.setVisible(true);
    }


}
