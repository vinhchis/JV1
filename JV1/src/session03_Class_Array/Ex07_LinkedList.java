package session03_Class_Array;

import java.util.LinkedList;

public class Ex07_LinkedList {
    // 1. Init
    LinkedList list = new LinkedList();

    void addNew(){
        for(int i = 0; i < 5; i++){
            list.add("Person - " + i + 1);
        }
    }

    void display(){
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }

    void addMore(int key){
        list.add(key, "new Person - " + "AAAAAAAA");
    }

    public static void main(String[] args) {
        var ex = new Ex07_LinkedList();
        ex.addNew();
        ex.addMore(1);
        ex.display();
    }
}
