/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElevatorProject;

/**
 *
 * @author nicholas
 */
class InvalidLocationException extends Exception{

    public InvalidLocationException(){ 
        System.out.println("Location can only be positive, non-zero intgers "
                + "less than the floor count!");
    }
    
    public InvalidLocationException(String s){
        System.out.println("Location can only be positive, non-zero intgers "
                + "less than the floor count!");
        System.out.println(s);
    }
    
}
