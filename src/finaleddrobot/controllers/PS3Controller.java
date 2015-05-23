/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaleddrobot.controllers;

import net.java.games.input.Component;
import net.java.games.input.Component.Identifier;
import net.java.games.input.Controller;
import net.java.games.input.ControllerEnvironment;

/**
 *
 * @author mallory
 */
public class PS3Controller {
    
    private Controller controller;
    private boolean lastButtonState_L1 = false;
    private boolean lastButtonState_R1 = false;
    private boolean lastButtonState_L2 = false;
    private boolean lastButtonState_R2 = false;
    private boolean lastButtonState_StartButton = false;
    private boolean lastButtonState_SelectButton = false;
    private boolean lastButtonState_CircleButton = false;
    private boolean lastButtonState_XButton = false;
    private boolean lastButtonState_TriangleButton = false;
    private boolean lastButtonState_SquareButton = false;
    private boolean lastButtonState_LeftJoyButton = false;
    private boolean lastButtonState_RightJoyButton = false;
    private boolean lastButtonState_DLeft = false;
    private boolean lastButtonState_DRight = false;
    private boolean lastButtonState_DUp = false;
    private boolean lastButtonState_DDown = false;
    
    public PS3Controller(){
        ControllerEnvironment ce = ControllerEnvironment.getDefaultEnvironment();
        controller = ce.getControllers()[0];        
    }
    
    public double getLeftXAxis(){
        return controller.getComponent(Identifier.Axis.X).getPollData();
    }
    
    public double getRightXAxis(){
        return controller.getComponent(Identifier.Axis.Z).getPollData();
    }    
    
    public double getLeftYAxis(){
        return -controller.getComponent(Identifier.Axis.Y).getPollData();
    }
    
    public double getRightYAxis(){
        return -controller.getComponent(Identifier.Axis.RZ).getPollData();
    }    
    
    public boolean getL1(){
        return controller.getComponent(Identifier.Button.BASE5).getPollData() == 1;
    }
    
    public boolean getR1(){
        return controller.getComponent(Identifier.Button.BASE6).getPollData() == 1;
    }
    
    public boolean getL2(){
        return controller.getComponent(Identifier.Button.BASE3).getPollData() == 1;
    }
    
    public boolean getR2(){
        return controller.getComponent(Identifier.Button.BASE4).getPollData() == 1;
    }
    
    public boolean getStartButton(){
        return controller.getComponent(Identifier.Button.TOP).getPollData() == 1;
    }
    
    public boolean getSelectButton(){
        return controller.getComponent(Identifier.Button.TRIGGER).getPollData() == 1;
    }
    
    public boolean getCircleButton(){
        return controller.getComponents()[13].getPollData()== 1;
    }
    
    public boolean getXButton(){
        return controller.getComponents()[14].getPollData()== 1;
    }
    
    public boolean getTriangleButton(){
        return controller.getComponent(Identifier.Button.UNKNOWN).getPollData() == 1;
    }
    
    public boolean getSquareButton(){
        return controller.getComponent(Identifier.Button.DEAD).getPollData() == 1;
    }
    
    public boolean getLeftJoyButton(){
        return controller.getComponent(Identifier.Button.THUMB).getPollData() == 1;
    }
    
    public boolean getRightJoyButton(){
        return controller.getComponent(Identifier.Button.THUMB2).getPollData() == 1;
    }
    
    public boolean getDLeft(){
        return controller.getComponent(Identifier.Button.BASE2).getPollData() == 1;
    }
    
    public boolean getDRight(){
        return controller.getComponent(Identifier.Button.PINKIE).getPollData() == 1;
    }
    
    public boolean getDUp(){
        return controller.getComponent(Identifier.Button.TOP2).getPollData() == 1;
    }
    
    public boolean getDDown(){
        return controller.getComponent(Identifier.Button.BASE).getPollData() == 1;
    }
    
    public boolean getL1Pressed(){
        boolean pressed = (this.getL1() && this.getL1() != this.lastButtonState_L1);
        this.lastButtonState_L1 = this.getL1();
        return pressed;
    }
    
    public boolean getR1Pressed(){
        boolean pressed = (this.getR1() && this.getR1() != this.lastButtonState_R1);
        this.lastButtonState_R1 = this.getR1();
        return pressed;
    }
    
    public boolean getL2Pressed(){
        boolean pressed = (this.getL2() && this.getL2() != this.lastButtonState_L2);
        this.lastButtonState_L2 = this.getL2();
        return pressed;
    }
    
    public boolean getR2Pressed(){
        boolean pressed = (this.getR2() && this.getR2() != this.lastButtonState_R2);
        this.lastButtonState_R2 = this.getR2();
        return pressed;
    }
    
    public boolean getStartButtonPressed(){
        boolean pressed = (this.getStartButton() && this.getStartButton() != this.lastButtonState_StartButton);
        this.lastButtonState_StartButton = this.getStartButton();
        return pressed;
    }
    
    public boolean getSelectButtonPressed(){
        boolean pressed = (this.getSelectButton() && this.getSelectButton() != this.lastButtonState_SelectButton);
        this.lastButtonState_SelectButton = this.getSelectButton();
        return pressed;
    }
    
    public boolean getCircleButtonPressed(){
        boolean pressed = (this.getCircleButton() && this.getCircleButton() != this.lastButtonState_CircleButton);
        this.lastButtonState_CircleButton = this.getCircleButton();
        return pressed;
    }
    
    public boolean getXButtonPressed(){
        boolean pressed = (this.getXButton() && this.getXButton() != this.lastButtonState_XButton);
        this.lastButtonState_XButton = this.getXButton();
        return pressed;
    }
    
    public boolean getTriangleButtonPressed(){
        boolean pressed = (this.getTriangleButton() && this.getTriangleButton() != this.lastButtonState_TriangleButton);
        this.lastButtonState_TriangleButton = this.getTriangleButton();
        return pressed;
    }
    
    public boolean getSquareButtonPressed(){
        boolean pressed = (this.getSquareButton() && this.getSquareButton() != this.lastButtonState_SquareButton);
        this.lastButtonState_SquareButton = this.getSquareButton();
        return pressed;
    }
    
    public boolean getLeftJoyButtonPressed(){
        boolean pressed = (this.getLeftJoyButton() && this.getLeftJoyButton() != this.lastButtonState_LeftJoyButton);
        this.lastButtonState_LeftJoyButton = this.getLeftJoyButton();
        return pressed;
    }
    
    public boolean getRightJoyButtonPressed(){
        boolean pressed = (this.getRightJoyButton() && this.getRightJoyButton() != this.lastButtonState_RightJoyButton);
        this.lastButtonState_RightJoyButton = this.getRightJoyButton();
        return pressed;
    }
    
    public boolean getDLeftPressed(){
        boolean pressed = (this.getDLeft() && this.getDLeft() != this.lastButtonState_DLeft);
        this.lastButtonState_DLeft = this.getDLeft();
        return pressed;
    }
    
    public boolean getDRightPressed(){
        boolean pressed = (this.getDRight() && this.getDRight() != this.lastButtonState_DRight);
        this.lastButtonState_DRight = this.getDRight();
        return pressed;
    }
    
    public boolean getDUpPressed(){
        boolean pressed = (this.getDUp() && this.getDUp() != this.lastButtonState_DUp);
        this.lastButtonState_DUp = this.getDUp();
        return pressed;
    }
    
    public boolean getDDownPressed(){
        boolean pressed = (this.getDDown() && this.getDDown() != this.lastButtonState_DDown);
        this.lastButtonState_DDown = this.getDDown();
        return pressed;
    }
    
    public boolean update(){
        return controller.poll();
    }
    
    public String serialize(){
        String serializedString = "";
        serializedString += this.getLeftXAxis()     + ",";
        serializedString += this.getRightXAxis()    + ",";
        serializedString += this.getLeftYAxis()     + ",";
        serializedString += this.getRightYAxis()    + ",";
        serializedString += (this.getL1()? 1 : 0)   + ",";
        serializedString += (this.getR1()? 1 : 0)   + ",";
        serializedString += (this.getL2()? 1 : 0)   + ",";
        serializedString += (this.getR2()? 1 : 0)   + ",";
        serializedString += (this.getStartButton()? 1 : 0)     + ",";
        serializedString += (this.getSelectButton()? 1 : 0)     + ",";
        serializedString += (this.getCircleButton()? 1 : 0)   + ",";
        serializedString += (this.getXButton()? 1 : 0)   + ",";
        serializedString += (this.getTriangleButton()? 1 : 0)   + ",";
        serializedString += (this.getSquareButton()? 1 : 0)   + ",";
        serializedString += (this.getLeftJoyButton()? 1 : 0)   + ",";
        serializedString += (this.getRightJoyButton()? 1 : 0)   + ",";
        serializedString += (this.getDLeft()? 1 : 0)   + ",";
        serializedString += (this.getDRight()? 1 : 0)   + ",";
        serializedString += (this.getDUp()? 1 : 0)   + ",";
        serializedString += (this.getDDown() ? 1 : 0);
        return serializedString;
    }
    
    
}
