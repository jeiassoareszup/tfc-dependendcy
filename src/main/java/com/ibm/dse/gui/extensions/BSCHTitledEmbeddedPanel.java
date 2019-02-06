package com.ibm.dse.gui.extensions;

public class BSCHTitledEmbeddedPanel extends BSCHComponent {
    private String name;
    private String text;
    private String dimensions;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public String getDimensions() {
        return dimensions;
    }
}
