/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package example;

/**
 *
 * @author Nicholas Tan
 */
public class Main {
    public static void main(String[] args) {
        Pickup pickup = new Pickup("Toyota", 16, 30, true);
        Tanker tanker = new Tanker(pickup.getBrand(), pickup.getNumOfTyre(), pickup.getLoad());
        double maximumLoad = pickup.getLoad() * 2.5;

        System.out.println("Lorry Brand : " + pickup.getBrand());
        System.out.println("Load : " + pickup.getLoad() + " tons");
        System.out.println("Number of tyre : " + pickup.getNumOfTyre());
        System.out.println("Maximum load : " + maximumLoad + " tons");
        System.out.println("Towing capability : " + pickup.getTowingCapability());
    }
}

class Lorry {
    private String brand;
    private int numOfTyre;
    private int load;

    public Lorry(String brand, int numOfTyre, int load) {
        this.brand = brand;
        this.numOfTyre = numOfTyre;
        this.load = load;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setNumOfTyre(int numOfTyre) {
        this.numOfTyre = numOfTyre;
    }

    public int getNumOfTyre() {
        return numOfTyre;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    public int getLoad() {
        return load;
    }
}

class Tanker extends Lorry {
    private int maximumLoad;

    public Tanker(String brand, int numOfTyre, int load) {
        super(brand, numOfTyre, load);
        this.maximumLoad = load * 2;
    }

    public double maximumLoad() {
        return maximumLoad;
    }

    public void setLoad(int load) {
        super.setLoad(load);
        this.maximumLoad = load * 2;
    }

    public int getLoad() {
        return super.getLoad();
    }
}

class Pickup extends Lorry {
    private boolean towingCapability;

    public Pickup(String brand, int numOfTyre, int load, boolean towingCapability) {
        super(brand, numOfTyre, load);
        this.towingCapability = towingCapability;
    }

    public void setTowingCapability(boolean towingCapability) {
        this.towingCapability = towingCapability;
    }

    public boolean getTowingCapability() {
        return towingCapability;
    }
}

