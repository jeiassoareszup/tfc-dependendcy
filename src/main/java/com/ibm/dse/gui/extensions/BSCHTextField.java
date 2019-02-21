package com.ibm.dse.gui.extensions;

import java.util.ArrayList;
import java.util.List;

public class BSCHTextField extends BSCHComponent {

    private String name;
    private String dataName;
    private String type;
    private int maxChars;
    private String dimensions;
    private String behaviour;
    private String mask;
    private String horizAlignment;
    private List<Process> focusLostProcess = new ArrayList<>();
    private String defaultValue;
    private String restricted;

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

    private int getCurrentProcess(){
        return focusLostProcess.size() - 1;
    }

    public void setFocusLostProcess(String name) {
        Process process = new Process(name);
        this.focusLostProcess.add(process);
    }

    public void setFocusLostProcessParameters(String parameters) {
        this.focusLostProcess.get(getCurrentProcess()).setParameters(parameters);
    }

    public void setFocusLostProcessData(String data) {
        this.focusLostProcess.get(getCurrentProcess()).setData(data);
    }

    public void setFocusLostProcessOutData(String outData) {
        this.focusLostProcess.get(getCurrentProcess()).setOutData(outData);
    }

    public List<Process> getFocusLostProcess() {
        return this.focusLostProcess;
    }

    public void setFocusLostProcess(List<Process> focusLostProcess) {
        this.focusLostProcess = focusLostProcess;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setRestricted(String restricted) {
        this.restricted = restricted;
    }

    public String getRestricted() {
        return restricted;
    }
}
