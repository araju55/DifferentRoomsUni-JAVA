/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package differentroomsuni;

/**
 *
 * @author Joseph
 */
public class Office extends Room {
    
    private String name;
    
    public Office(String name, String roomNum) {
        super(roomNum, 1, false);
        this.name = name;
    }    
    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return "Room: " + getroomNumber() + "     " + name;
    }
}
