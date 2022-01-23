package com.company;

public enum State {

    BASE("на базе"),
    ROUTE("в пути"),
    REPAIR("на ремонте");

    private String whatCondition;

    State(String whatCondition) {
        this.whatCondition = whatCondition;
    }

    public String getWhatCondition() {
        return whatCondition;
    }

    public void setWhatCondition(String whatCondition) {
        this.whatCondition = whatCondition;
    }
}
