package com.ibm.dse.gui.extensions;

public class BSCHButtonTextField extends BSCHComponent {

    private String name;
    private String clickProcess;
    private String clickProcessData;
    private String clickProcessOutData;
    private String dataName;
    private String type;
    private String behaviour;
    private String dimensions;
    private String maxChars;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setClickProcess(String clickProcess) {
        this.clickProcess = clickProcess;
    }

    public String getClickProcess() {
        return clickProcess;
    }

    public void setClickProcessData(String clickProcessData) {
        this.clickProcessData = clickProcessData;
    }

    public String getClickProcessData() {
        return clickProcessData;
    }

    public void setClickProcessOutData(String clickProcessOutData) {
        this.clickProcessOutData = clickProcessOutData;
    }

    public String getClickProcessOutData() {
        return clickProcessOutData;
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
}
