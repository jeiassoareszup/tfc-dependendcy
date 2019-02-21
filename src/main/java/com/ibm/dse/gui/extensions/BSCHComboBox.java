package com.ibm.dse.gui.extensions;

public class BSCHComboBox extends BSCHComponent {
    private String name;
    private String dataName;
    private String behaviour;
    private String type;
    private String dimensions;
    private String notValueAllowed;
    private String tableName;
    private String selectedDefaultCode;
    private String maxChars;
    private boolean visible;

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

    public void setBehaviour(String behaviour) {
        this.behaviour = behaviour;
    }

    public String getBehaviour() {
        return behaviour;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setNotValueAllowed(String notValueAllowed) {
        this.notValueAllowed = notValueAllowed;
    }

    public String getNotValueAllowed() {
        return notValueAllowed;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setSelectedDefaultCode(String selectedDefaultCode) {
        this.selectedDefaultCode = selectedDefaultCode;
    }

    public String getSelectedDefaultCode() {
        return selectedDefaultCode;
    }

    public void setMaxChars(String maxChars) {
        this.maxChars = maxChars;
    }

    public String getMaxChars() {
        return maxChars;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public boolean getVisible() {
        return visible;
    }
}
