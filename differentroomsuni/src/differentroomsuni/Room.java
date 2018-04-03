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
public abstract class Room {
    
    private String roomNumber;
    private int capacity;
    private boolean projection;
    
    public Room (String roomNum, int c, boolean p) {
        roomNumber = roomNum;
        capacity = c;
        projection = p;
    }
    
    public String getroomNumber() {
        return roomNumber;
    }
    
    public int getCapacity() {
        return capacity;
    }
    
    public boolean hasProjector() {
        return projection;
    }
    
    @Override
    public String toString() {
        return "[Room number: " + roomNumber + ", Capacity: " + capacity + ", Projection: " + projection;
    }
}
