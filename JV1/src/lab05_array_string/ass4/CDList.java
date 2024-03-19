package lab05_array_string.ass4;

import java.util.Scanner;

public class CDList {
    private CD[] cds;
    private int counter;
    public final int MAX = 10;

    public CDList() {
        this.cds = new CD[MAX];
        this.counter = 0;
    }

    public CD[] getCdList() {
        return this.cds;
    }

    public int getCounter() {
        return this.counter;
    }

    
    public void add(CD cd) {
        if (counter < MAX) {
            cds[counter] = cd;
            counter++;
        } else {
            System.out.println("The CD list is full!");
        }
    }


    public CD findById(int id) {
        for (CD cd : cds) {
            if (cd.getId() == id) {
                return cd;
            }
        }
        return null;
    }



}
