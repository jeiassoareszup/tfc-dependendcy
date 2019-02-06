package com.ibm.dse.gui.extensions;

import java.util.ArrayList;
import java.util.List;

public class BSCHTable extends BSCHComponent {
    private String name;
    private String buttonVisible;
    private String stateBar;
    private String dimensions;
    private String dataName;
    private String dataNameForTable;
    private String numColumn;
    private List<String> columns = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setButtonVisible(String buttonVisible) {
        this.buttonVisible = buttonVisible;
    }

    public String getButtonVisible() {
        return buttonVisible;
    }

    public void setStateBar(String stateBar) {
        this.stateBar = stateBar;
    }

    public String getStateBar() {
        return stateBar;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDataName(String dataName) {
        this.dataName = dataName;
    }

    public String getDataName() {
        return dataName;
    }

    public void setDataNameForTable(String dataNameForTable) {
        this.dataNameForTable = dataNameForTable;
    }

    public String getDataNameForTable() {
        return dataNameForTable;
    }

    public void setNumColumn(String numColumn) {
        this.numColumn = numColumn;
    }

    public String getNumColumn() {
        return numColumn;
    }

    public void setColumn(String column) {
        this.columns.add(column);
    }

    public List<String> getColumns() {
        return columns;
    }

    public void setColumns(List<String> columns) {
        this.columns = columns;
    }
}
