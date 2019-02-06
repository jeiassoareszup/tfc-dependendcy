package com.ibm.dse.gui.extensions;

public class BSCHCrossRelation extends BSCHComponent {
    private String name;
    private String condition;
    private String action;
    private String elseAction;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getCondition() {
        return condition;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }

    public void setElseAction(String elseAction) {
        this.elseAction = elseAction;
    }

    public String getElseAction() {
        return elseAction;
    }
}
