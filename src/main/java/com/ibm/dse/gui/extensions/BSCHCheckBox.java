package com.ibm.dse.gui.extensions;

public class BSCHCheckBox extends BSCHComponent {

    private String name;
    private String dataName;
    private String dimensions;
    private String text;
    private boolean visible;
    private String selected;
    private String behaviour;

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

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public boolean getVisible() {
        return visible;
    }

    public void setSelected(String selected) {
        this.selected = selected;
    }

    public String getSelected() {
        return selected;
    }

    public void setBehaviour(String behaviour) {
        this.behaviour = behaviour;
    }

    public String getBehaviour() {
        return behaviour;
    }
}
