package com.ems;

public class SecurityGuard extends BaseEmployee implements Guardable {
    public SecurityGuard(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println(name + " is patrolling the premises.");
    }

    @Override
    public void securePremises() {
        System.out.println(name + " is ensuring security.");
    }
}
