package Week8.sept29Warmup;

public class Bus {
    private int numPassengers;

    public Bus(){
        numPassengers=200;
    }
    public Bus(int numPassengers){
        this.numPassengers = numPassengers;
    }
    public void numBuses(int numPassengers){
        System.out.println("The number of buses needed to transport " + numPassengers + " passengers is " + Math.ceil(1.0*numPassengers/this.numPassengers));
    }
    public void numBuses(int numPassengers, int buses){
        if(buses > Math.ceil(1.0*numPassengers/this.numPassengers)){
            System.out.println(numPassengers + " passengers will not fit on " + buses + " buses.");
        }else{
            System.out.println(numPassengers + " passengers will fit on " + buses + " buses.");
        }
    }

}
