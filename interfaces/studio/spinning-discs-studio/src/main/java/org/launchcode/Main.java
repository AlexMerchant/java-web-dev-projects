package org.launchcode;

public class Main {
    public static void main(String[] args) {

        CD myCD = new CD("All Killer No Filler",27.50,"A bunch of music tracks", "Music CD");
        DVD myDVD = new DVD("Tropic Thunder", 2.5, "A feature film included", "HD DVD");

        myCD.spinDisc();
        myDVD.spinDisc();

        myCD.writeData();
        myDVD.writeData();

        myCD.writeDiscWithLaser();
        myDVD.writeDiscWithLaser();

        myCD.readDiscWithLaser();
        myDVD.readDiscWithLaser();

        System.out.println(myCD.name);
    }
}