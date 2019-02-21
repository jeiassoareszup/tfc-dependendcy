package com.ibm.dse.gui.extensions;

public class Process {

    public Process(String name) {
        this.name = name;
    }

    private String name;
    private String data;
    private String outData;
    private String parameters;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getOutData() {
        return outData;
    }

    public void setOutData(String outData) {
        this.outData = outData;
    }

    public String getParameters() {
        return parameters;
    }

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }
}
