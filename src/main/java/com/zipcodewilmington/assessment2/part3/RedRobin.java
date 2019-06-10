package com.zipcodewilmington.assessment2.part3;

public class RedRobin extends Bird{
    private String migrationMonth;
    public String color() {
        return "red";

    }
    public int getSpeed() {
        return 10;

    }
    public RedRobin() {
        this.migrationMonth = "January";
    }
    public void setMigrationMonth(String migrationMonth) {
        this.migrationMonth = migrationMonth;
    }
    public String getMigrationMonth() {
        return migrationMonth;

    }
}
