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
public class LectureTheatre extends Room {
    
    public LectureTheatre(String roomNum, int c) {
        super(roomNum, c, true);
    }
    
    @Override
    public String toString() {
        String LecRoom = "This is a lecture theatre" + super.toString();
        return LecRoom;
    }
    
}
