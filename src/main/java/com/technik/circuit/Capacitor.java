package com.technik.circuit;

public class Capacitor extends ElectronicComponents {

    private double capacity;
    private double current;
    private double voltage;

    public Capacitor(String type, double r_value){
        super(type);
        this.capacity = r_value;
    }

    //direct and alternating voltage
    //specific calculation of resistor current
    public void Current(double r_value, double voltage_source){
        this.current = voltage_source/r_value;
    }
    //specific calculation of resistor voltage
    public void Voltage(double r_value, double current){
        this.voltage = current*r_value;
    }


}
