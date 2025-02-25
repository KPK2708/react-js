package com.ems;

public class Developer extends BaseEmployee implements Developable {
    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println(name + " is coding features.");
    }

    @Override
    public void writeCode() {
        System.out.println(name + " is developing software.");
    }
}
