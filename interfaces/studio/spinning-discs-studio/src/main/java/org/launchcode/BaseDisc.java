package org.launchcode;

public abstract class BaseDisc {

    protected String name;
    protected double capacity;
    protected String contents;
    protected String discType;

    // Constructor
    public BaseDisc(String aName, double aCapacity, String aContents, String aDiscType) {
        this.name = aName;
        this.capacity = aCapacity;
        this.contents = aContents;
        this.discType = aDiscType;
    }

}
