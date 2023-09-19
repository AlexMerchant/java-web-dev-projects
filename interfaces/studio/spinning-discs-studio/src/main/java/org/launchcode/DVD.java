package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc{
    public DVD(String aName, double aCapacity, String aContents, String aDiscType) {
        super(aName, aCapacity, aContents, aDiscType);
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");

    }

    @Override
    public void writeData() {
        System.out.println("Data was written to the DVD!");
    }

    @Override
    public void writeDiscWithLaser() {
        System.out.println("The laser writes data to the DVD!");

    }

    @Override
    public void readDiscWithLaser() {
        System.out.println("The laser reads the data on the DVD!");
    }


}
