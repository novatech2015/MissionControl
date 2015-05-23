/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missioncontrol;

import finaleddrobot.controllers.PS3Controller;
import java.util.logging.Level;
import java.util.logging.Logger;
import missioncontrol.packets.ControlPacket;
import missioncontrol.sockets.ServerSocket;

/**
 *
 * @author mallory
 */
public class MissionControl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServerSocket server = new ServerSocket(9001);
        PS3Controller controller = new PS3Controller();
        
        while(true){
            controller.update();
            String serializedString = controller.serialize();
            server.sendPacket(new ControlPacket(serializedString));
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(MissionControl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
