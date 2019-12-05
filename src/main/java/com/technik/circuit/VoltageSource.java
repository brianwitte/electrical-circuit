package com.technik.circuit;

public class VoltageSource extends ElectronicComponents {

    private double voltage;
    private double frequency;


    public VoltageSource(String type, double v_value, double f_value) {
        super(type);
        this.voltage = v_value;
        this.voltage = f_value;
    }

}
