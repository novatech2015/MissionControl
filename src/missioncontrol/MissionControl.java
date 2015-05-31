/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missioncontrol;

import finaleddrobot.controllers.PS3Controller;
import finaleddrobot.resources.Resources;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import missioncontrol.packets.ControlPacket;
import missioncontrol.sockets.ServerSocket;

/**
 *                ▒▒                   (_)                         *
 *               ▓▓▓▒▒                   _                         *
 *             ▓▓▓▓▓▓▒▒              _  (_)                        *
 *▓         ▓▓▓▓▓▓▓▓▓▓▒▒▒▒          (_)                            *
 *▓▓      ▓▓▒▒▒▒▒▒▒▒▒▒░▓▓▓░░            _         /\               *
 *▓▓▓   ▓▓▒▒▒▒▒░░░░░▓░░▓ ▓░░░░     _   (_)       /\ \/\            *
 *▓▓▓▓▓▓░░░░░░░░░░░▓▓░░▓▓▓░░░░░   (_)            \ \ \ \           *
 *▓▓▓▓▓▓▓░░░░░░░░░▓▓▓░░░░░░░░░░░░                / / / /           *
 *▓▓▓    ▓░░░░░░░░░░░░░▓░░░░░░░                  \ \ \ \           *
 *▓▓       ░░░░░░░░░░░▓▓░░░░░                    / / / /           *
 *▓          ░░▒▒▒▒░░░░░░░░░                    / / / /            *
 *          ▒▒▒▒▒                              / / / /             *
 *=================================================================
 *  _   _                                 _        __ _     _     
 * | \ | |                               | |      / _(_)   | |    
 * |  \| |_ __ ___  _ __   __ _ _ __   __| | __ _| |_ _ ___| |__  
 * | . ` | '_ ` _ \| '_ \ / _` | '_ \ / _` |/ _` |  _| / __| '_ \ 
 * | |\  | | | | | | |_) | (_| | | | | (_| | (_| | | | \__ \ | | |
 * |_| \_|_| |_| |_| .__/ \__,_|_| |_|\__,_|\__,_|_| |_|___/_| |_|
 *                 | |                                            
 *                 |_|                                            
 * @author mallory
 */
public class MissionControl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        try {
            Resources.init();
        } catch (IOException ex) {
            Logger.getLogger(MissionControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        while(true){
            Resources.m_controller.update();
            String serializedString = Resources.m_controller.serialize();
            Resources.m_server.sendPacket(new ControlPacket(serializedString));
            String data = Resources.m_server.getIncoming().getRawData();
            if(data == null){
            }else{
                Resources.m_frame.statisticsLabel.setText(data);
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(MissionControl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
