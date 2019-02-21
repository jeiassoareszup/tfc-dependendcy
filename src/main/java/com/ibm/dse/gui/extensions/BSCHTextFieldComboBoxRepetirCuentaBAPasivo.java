package com.ibm.dse.gui.extensions;

public class BSCHTextFieldComboBoxRepetirCuentaBAPasivo extends BSCHComponent {
    private String name;
    private String dataName;
    private String behaviour;
    private String dimensions;
    private boolean visible;
    private String trxPE;
    private String windowPE;

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

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public boolean getVisible() {
        return visible;
    }

    public void setTrxPE(String trxPE) {
        this.trxPE = trxPE;
    }

    public String getTrxPE() {
        return trxPE;
    }

    public void setWindowPE(String windowPE) {
        this.windowPE = windowPE;
    }

    public String getWindowPE() {
        return windowPE;
    }
}
