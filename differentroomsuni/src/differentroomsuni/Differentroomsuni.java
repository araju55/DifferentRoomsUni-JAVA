/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package differentroomsuni;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 17011947
 */
public class Differentroomsuni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Room> roomList = new ArrayList<Room>();
        menu();
        System.out.print("Pick an option: ");
        int option = -1;

        while (option != 0) {
            menu();
           System.out.print("Pick an option: ");
           option = scan.nextInt();
           switch (option) {
               case 1:
                   System.out.print("Room number: ");
                   String roomNum = scan.next();
                   System.out.print("Name of the person: ");
                   String name = scan.next();
                   roomList.add(new Office(roomNum, name));
                   break;
               case 2:
                   roomList.add(addComputerLab());
                   break;
               case 3:
                   System.out.print("Room number: ");
                   String number = scan.next();
                   System.out.print("Capacity: ");
                   int capacity = scan.nextInt();
                   roomList.add(new LectureTheatre(number, capacity));
                   break;
               case 4:
                   for (Room r : roomList) {
                       System.out.println(r);
                   }
                   break;
               case 5:
                   for (Room r : roomList) {
                       if (r.hasProjector()) {
                           System.out.println(r);
                       }
                   }
                   break;
               case 6:
                   System.out.println("Minimum capacity: ");
                   int miniCap = scan.nextInt();
                   for (Room r : roomList) {
                       if (r.getCapacity() >= miniCap) {
                           System.out.println(r);
                       }
                   }
                   break;
               default:
                   System.out.println("Please enter a valid option: ");
               }
                

           
        }
    }

    private static void menu() {
        System.out.println("1. add a general purpose room");
        System.out.println("2. add a computer room");
        System.out.println("3. add a lecture theatre");
        System.out.println("4. display all  rooms");
        System.out.println("5. display all rooms with projectors");
        System.out.println("6. Display all rooms with a specified capacity");
        System.out.println("0. Stop");
    }

    private static ComputerLab addComputerLab() {
	Scanner scan = new Scanner(System.in);
        System.out.print("Room number: ");
        String roomNum = scan.next();
        System.out.print("Capacity: ");
        int capacity = scan.nextInt();
        boolean projector = askProjector();
        System.out.println("Operating System: ");
        String os = scan.next();
        return (new ComputerLab(roomNum, capacity, projector, os));
    }

    

   

    private static boolean askProjector() {
        Scanner scan = new Scanner(System.in);
        String ans;
        do {
            System.out.println("Does the room have a projector [y/n] ");
            ans = scan.next();
        } while (!ans.equalsIgnoreCase("y") && !ans.equalsIgnoreCase("n"));

        return ans.equalsIgnoreCase("y");
    }
}
