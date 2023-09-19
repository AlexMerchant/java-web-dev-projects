package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc{
    public CD(String aName, double aCapacity, String aContents, String aDiscType) {
        super(aName, aCapacity, aContents, aDiscType);
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
    }

    @Override
    public void writeData() {
        System.out.println("Data was written to the CD!");
    }

    @Override
    public void writeDiscWithLaser() {
        System.out.println("The laser writes data to the CD!");

    }

    @Override
    public void readDiscWithLaser() {
        System.out.println("The laser reads the data on the CD!");
    }
}
