package finaleddrobot.resources;

import finaleddrobot.controllers.PS3Controller;
import finaleddrobot.utility.TerminalExecutor;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mallory
 */
public class Resources {
    
    public static boolean isTeleopEnabled = true;
    public static boolean isEnabled = true;
    public static TerminalExecutor m_exec;
    public static PS3Controller m_controller;
    
    public static void init() throws IOException{
        m_exec = new TerminalExecutor();
        m_controller = new PS3Controller();
    }
}
