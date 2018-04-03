/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package differentroomsuni;

/**
 *
 * @author 17011947
 */
public class ComputerLab extends Room {

    private String os;

    public ComputerLab(String roomNum, int c, boolean p, String os) {
        super(roomNum, c, p);
        this.os = os;
    }
    
    public ComputerLab(String roomNum) {
        super(roomNum, 20, true);
        os = "Windows";
    }

    public String getOS() {
        return os;
    }

    public void setOS(String update) {
        os = update;
    }

    @Override
    public String toString() {
        return "Computer Lab: " + "Operating System: " + os + super.toString();
    }
}
