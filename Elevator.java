package ElevatorProject;

/**
 * Group 1 - Nicholas Persing, Christopher Millsap, Julio Villazon
 *Elevator Project CSE 2010 - Fall 2015 - Section 1
 * 
 * Created by: Nicholas Persing @ 8/31/2015 11:35
 *      -basic structure, setters and getters
 * Edited by: 
 */
public class Elevator {
    private int currentFloor;
    private final int capacity;
    private final int maxFloor; 
    private Person[] occupants; 
    private FloorQueue[] floorArray;
  
    
    /**
     * Creates new Elevator with specified capacity starting at floor 0
     * @param cap the capacity for the elevator
     * @param floorCount
     * @throws ElevatorProject.InvalidCapacityException in the case of non-positive
     * or zero entry
     */
    public Elevator(int cap,int floorCount) throws InvalidCapacityException{
        if(cap <= 0)
            throw new InvalidCapacityException();
        if(floorCount <=0)
            throw new InvalidCapacityException();
        capacity = cap;
        currentFloor = 0;
        maxFloor = floorCount;
        
        occupants = new Person[capacity];
        floorArray = new FloorQueue[maxFloor];
    }
    
    /**
     * Returns the capacity of the elevator.
     * @return int
     */
    public int getCapacity(){
        return capacity;
    }
    
    /**
     * Returns the current location of the elevator 
     * @return int
     */
    public int getCurrentFloor(){
        return currentFloor;
    }
    
    /**
     * sets the current location
     * @param floor
     * @throws ElevatorProject.InvalidLocationException in the case of non-positive
     * or zero entry
     */
    public void setCurrentFloor(int floor) throws InvalidLocationException{
        if(floor <=0)
            throw new InvalidLocationException();
        currentFloor = floor;
    }
    
    /**
     * Move up to the next floor
     * @throws InvalidLocationException in the case of trying to move above top floor
     */
    public void moveUp() throws InvalidLocationException{
        if(currentFloor == maxFloor)
            throw new InvalidLocationException("Trying to move above top floor.");
        currentFloor++;
    }
    
    /**
     * move3 down to the previous floor
     * @throws InvalidLocationException in the case of trying to move below bottom floor
     */
    public void moveDown() throws InvalidLocationException{
        if(currentFloor == 1)
            throw new InvalidLocationException("Trying to move down "
                    + "while on first floor.");
        currentFloor--;
    }
    
    public int getCurrentOccupancy(){
        int count = 0, i = 0;
        while(occupants[i]!=null){
            count++;
        }
        return count;
    }
    
    //TODO Implement
//    private void addPerson(Person p){
//        for(int i = 0; i< capacity; i++){
//            if(p.compareTo(occupants[i] => 0))
//                
//        }
//    }
    
    //TODO Implement
    public int letOut(int floor){
        int count = 0;
        return count;
    }
    
    //TODO Implement
    public int letIn(int floor){
        int count = 0;
        return count;
    }
    
    //To Be Implemented
    public boolean isFull(){
        return false;
    }
    
    //To Be Implemented
    public boolean isEmpty(){
        return false;
    }
    
}
