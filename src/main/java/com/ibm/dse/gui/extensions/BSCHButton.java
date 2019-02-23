package com.ibm.dse.gui.extensions;

import java.util.ArrayList;
import java.util.List;

public class BSCHButton extends BSCHComponent {
    private String name;
    private List<Process> clickProcess = new ArrayList<>();
    private String launchAssocOperation;
    private String dimensions;
    private String text;
    private String behaviour;
    private String iconFile;
    private String buttonType;
    private Boolean visible;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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

    public void setButtonType(String buttonType) {
        this.buttonType = buttonType;
    }

    public String getButtonType() {
        return buttonType;
    }

    public List<Process> getClickProcess() {
        return clickProcess;
    }

    public void setClickProcess(List<Process> clickProcess) {
        this.clickProcess = clickProcess;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public Boolean getVisible() {
        return visible;
    }
}
