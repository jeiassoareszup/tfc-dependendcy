package com.ibm.dse.gui.extensions;

import java.util.ArrayList;
import java.util.List;

public class BSCHButtonTextField extends BSCHComponent {

    private String name;
    private String dataName;
    private String type;
    private String behaviour;
    private String dimensions;
    private String maxChars;
    private List<Process> clickProcess = new ArrayList<>();
    private String tableName;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDataName(String dataName) {
        this.dataName = dataName;
    }

    public String getDataName() {
        return dataName;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setBehaviour(String behaviour) {
        this.behaviour = behaviour;
    }

    public String getBehaviour() {
        return behaviour;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setMaxChars(String maxChars) {
        this.maxChars = maxChars;
    }

    public String getMaxChars() {
        return maxChars;
    }


    private int getCurrentProcess(){
        return this.clickProcess.size() - 1;
    }

    public void setClickProcess(String name) {
        Process process = new Process(name);
        this.clickProcess.add(process);
    }

    public void setClickProcessParameters(String parameters) {
        this.clickProcess.get(getCurrentProcess()).setParameters(parameters);
    }

    public void setClickProcessData(String data) {
        this.clickProcess.get(getCurrentProcess()).setData(data);
    }

    public void setClickProcessOutData(String outData) {
        this.clickProcess.get(getCurrentProcess()).setOutData(outData);
    }

    public List<Process> getClickProcess() {
        return clickProcess;
    }

    public void setClickProcess(List<Process> clickProcess) {
        this.clickProcess = clickProcess;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableName() {
        return tableName;
    }
}
