package com.company;
import java.util.ArrayList;

class Project
    {
        public Project(int identifier, ArrayList <Task> input) {
            this.identifier = identifier;
            this.tasks = input;
        }
        public String toString() {
            String returnvalue = "project " + identifier + " tasks: " ;
            for(Task listitem : tasks)
                returnvalue = returnvalue + " " + listitem.toString();
            return returnvalue;}
        int identifier;
        ArrayList <Task> tasks;
    }

    class Task
    {
        public Task (String name, ArrayList <Worker> input)
        {
            this.name = name;
            this.workers = input;
        }
        public String toString() {
            String returnvalue ="\n" + name + ":";
            for(Worker listitem : workers)
                returnvalue = returnvalue + " " + listitem.toString();
            return returnvalue;}
        String name;
        ArrayList <Worker> workers;
    }

    class Worker
    {
        public Worker (String name, boolean employee)
        {
            this.name = name;
            this.employee = employee;
        }
        public String toString() {
            String returnvalue = name + " (";
            if (employee == true)
                returnvalue = returnvalue + "employee), ";
            else
                returnvalue = returnvalue + "contractor), ";
            return returnvalue;
        }
        String name;
        boolean employee;
    }

