package com.ibm.dse.gui.extensions;

public class BSCHTextField extends BSCHComponent {
    private String name;
    private String dataName;
    private String type;
    private int maxChars;
    private String dimensions;
    private String behaviour;
    private String mask;
    private String horizAlignment;

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

    public void setMaxChars(int maxChars) {
        this.maxChars = maxChars;
    }

    public int getMaxChars() {
        return maxChars;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setBehaviour(String behaviour) {
        this.behaviour = behaviour;
    }

    public String getBehaviour() {
        return behaviour;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    public String getMask() {
        return mask;
    }

    public void setHorizAlignment(String horizAlignment) {
        this.horizAlignment = horizAlignment;
    }

    public String getHorizAlignment() {
        return horizAlignment;
    }
}
