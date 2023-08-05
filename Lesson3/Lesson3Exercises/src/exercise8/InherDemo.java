package exercise8;

class Bicycle  { 
    public int gear; 
    public int speed; 
    public Bicycle(int gear, int speed)   { 
        this.gear = gear; 
        this.speed = speed; 
    } 
    public void applyBrake(int decrement)   { 
        speed -= decrement; 
    } 
    public void speedUp(int increment)  { 
        speed += increment; 
    }  
    public String toString()   { 
        return(" No of gears are " + gear + "\n" + " Speed of bicycle is " + speed); 
    }  
} 
class MountainBike extends Bicycle  { 
    public int seatHeight; 
    public MountainBike(int gear,int speed,int startHeight) {  
        super(gear, speed); 
        seatHeight = startHeight; 
    }  
    public void setHeight(int newValue)    { 
        seatHeight = newValue; 
    } 
    @Override
    public String toString() 
    { 
        return (super.toString()+ "\n Seat height is "+seatHeight); 
    } 
}



public class InherDemo {

	public static void main(String[] args) {
		MountainBike mb = new MountainBike(3, 100, 25); 
        System.out.println(mb.toString());
        mb.applyBrake(1);
        System.out.println("\nApply breaks 1, new value\n"+mb);
        mb.speedUp(5);
        System.out.println("\nSpeed up 5, new value\n"+mb);
        mb.setHeight(27);
        System.out.println("\nNew seat height 27, new value\n"+mb);


	}

}
