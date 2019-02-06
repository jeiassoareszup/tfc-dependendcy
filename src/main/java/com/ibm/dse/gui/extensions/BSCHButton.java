package com.ibm.dse.gui.extensions;

public class BSCHButton extends BSCHComponent {
    private String name;
    private String clickProcess;
    private String clickProcessParameters;
    private String clickProcessData;
    private String clickProcessOutData;
    private String buttonType;
    private String launchAssocOperation;
    private String dimensions;
    private String text;
    private String behaviour;
    private String iconFile;

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

    public void setClickProcessParameters(String clickProcessParameters) {
        this.clickProcessParameters = clickProcessParameters;
    }

    public String getClickProcessParameters() {
        return clickProcessParameters;
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

    public void setButtonType(String buttonType) {
        this.buttonType = buttonType;
    }

    public String getButtonType() {
        return buttonType;
    }

    public void setLaunchAssocOperation(String launchAssocOperation) {
        this.launchAssocOperation = launchAssocOperation;
    }

    public String getLaunchAssocOperation() {
        return launchAssocOperation;
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

    public void setBehaviour(String behaviour) {
        this.behaviour = behaviour;
    }

    public String getBehaviour() {
        return behaviour;
    }

    public void setIconFile(String iconFile) {
        this.iconFile = iconFile;
    }

    public String getIconFile() {
        return iconFile;
    }
}
