package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

    Worker oneW = new Worker("Jaska",true);
    Worker twoW = new Worker("Jokunen",false);
    ArrayList<Worker> aList = new ArrayList<Worker>();
    aList.add(oneW);
    aList.add(twoW);

    Worker threeW = new Worker("Aku",true);
    Worker fourW = new Worker("Ankka",false);
    ArrayList<Worker> bList = new ArrayList<Worker>();
    bList.add(threeW);
    bList.add(fourW);

    Task oneT = new Task("cooking",aList);
    Task twoT = new Task("packing",bList);
    ArrayList<Task> cList = new ArrayList<Task>();
    cList.add(oneT);
    cList.add(twoT);

    Project oneP = new Project(1, cList);

        System.out.println(oneP);
    }
}
