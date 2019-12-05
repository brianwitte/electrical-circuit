package com.technik.circuit;

public class Coil extends ElectronicComponents {

    private double inductance;
    private double current;
    private double voltage;

    public Coil(String type, double i_value){
        super(type);
        this.inductance = i_value;
    }

    //direct voltage
    //specific calculation of resistor current
    public void DCurrent(double r_value, double voltage_source){
        this.current = voltage_source/r_value;
    }
    //specific calculation of resistor voltage
    public void DVoltage(double r_value, double current){
        this.voltage = current*r_value;
    }



    //alternating voltage
    public void ACurrent(double l_value, double current_source){
        this.current = current_source/l_value;
    }
}
