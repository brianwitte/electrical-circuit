package com.technik.circuit;

public class Resistor extends ElectronicComponents {

    private double resistance;
    private double current;
    private double voltage;

    public Resistor(String type, double r_value){
        super(type);
        this.resistance = r_value;
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
