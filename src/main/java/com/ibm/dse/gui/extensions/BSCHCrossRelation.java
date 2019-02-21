package com.ibm.dse.gui.extensions;

import java.util.ArrayList;
import java.util.List;

public class BSCHCrossRelation extends BSCHComponent {
    private String name;
    private String condition;
    private List<String> action = new ArrayList<>();
    private List<String> elseAction = new ArrayList<>();

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

    public List<String> getAction() {
        return action;
    }

    public void setAction(List<String> action) {
        this.action = action;
    }

    public void setAction(String action) {
        this.action.add(action);
    }

    public List<String> getElseAction() {
        return elseAction;
    }

    public void setElseAction(String elseAction) {
        this.elseAction.add(elseAction);
    }

    public void setElseAction(List<String> elseAction) {
        this.elseAction = elseAction;
    }
}
