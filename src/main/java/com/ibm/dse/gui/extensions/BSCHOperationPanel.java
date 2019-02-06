package com.ibm.dse.gui.extensions;

import java.util.ArrayList;
import java.util.List;

public class BSCHOperationPanel extends BSCHComponent {

    private List<BSCHComponent> components = new ArrayList<>();
    private String operationName;
    private String name;
    private String title;
    private String dimensions;
    private String preViewAction;
    private String preViewData;
    private String preViewOutData;
    private String processParameters;

    public List<BSCHComponent> getComponents() {
        return components;
    }

    public void setComponents(List<BSCHComponent> components) {
        this.components = components;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void add(BSCHComponent component) {
        this.components.add(component);
    }

    public void setPreViewAction(String preViewAction) {
        this.preViewAction = preViewAction;
    }

    public String getPreViewAction() {
        return preViewAction;
    }

    public void setPreViewData(String preViewData) {
        this.preViewData = preViewData;
    }

    public String getPreViewData() {
        return preViewData;
    }

    public void setPreViewOutData(String preViewOutData) {
        this.preViewOutData = preViewOutData;
    }

    public String getPreViewOutData() {
        return preViewOutData;
    }

    public void setPreViewProcessParameters(String s) {

    }

    public void setProcessParameters(String processParameters) {
        this.processParameters = processParameters;
    }

    public String getProcessParameters() {
        return processParameters;
    }
}
