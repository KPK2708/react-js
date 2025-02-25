package com.ems;

public class Manager extends BaseEmployee implements Manageable {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println(name + " is overseeing projects.");
    }

    @Override
    public void manageTeam() {
        System.out.println(name + " is managing the development team.");
    }
}
