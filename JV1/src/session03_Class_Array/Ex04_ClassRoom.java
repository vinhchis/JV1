package session03_Class_Array;
import session03_Class_Array.office.*;


// inside Package
class TeacherRoom {
    public String t1 = "Public Teacher"; 
    private String t2 = "Private Teacher ";
    protected String t3 = "Protected Teacher";
    // Default
    String t4 = "Default Teacher";
}

public class Ex04_ClassRoom extends SocialRoom{
    public String furniture = "wood table and metal chairs"; 
    private String water = "Javier";
    protected String tv = "LG 80 inch";
    // Default
    String airCd = "Toshiba";

    public void insideClass(){
        System.out.println("Public: " + this.furniture);
        System.out.println("Private: " + this.water);
        System.out.println("Protected: " + this.tv);
        System.out.println("Default: " + this.airCd);

    }

    // same package
    public void outsideClass(){
        var outside = new TeacherRoom();
        System.out.println("Public: " + outside.t1);
        // System.out.println("Private: " + outside.t2);
        System.out.println("Protected: " + outside.t3);
        System.out.println("Default: " + outside.t4);
    }

    public void outsideClassDiffPack(){
        var outside = new MeetingRoom();
        System.out.println("Public: " + outside.t1);
        // System.out.println("Private: " + outside.t2);
        // System.out.println("Protected: " + outside.t3);
        // System.out.println("Default: " + outside.t4);

    }

    // outside the package (by subclass)
    public void outsideSubClass(){
        System.out.println("Protected: " + this.note);
    }

    public static void main(String[] args) {
        // new Ex04_ClassRoom().insideClass();
        // new Ex04_ClassRoom().outsideClass();
        // new Ex04_ClassRoom().outsideClassDiffPack();
        new Ex04_ClassRoom().outsideSubClass();


    }
}
