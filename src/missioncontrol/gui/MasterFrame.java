/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missioncontrol.gui;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author mallory
 */
public class MasterFrame extends JFrame{
    
    public JLabel statisticsLabel;
    public MasterFrame(){
        this.setTitle("Mission Control Station");
        this.setSize(300, 200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        statisticsLabel = new JLabel();
        this.add(statisticsLabel);
        statisticsLabel.setText("Mission Statistics");
    }
}
