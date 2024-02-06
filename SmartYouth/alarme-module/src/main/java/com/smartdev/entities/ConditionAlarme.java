package com.smartdev.entities;

public enum ConditionAlarme {
    GREATER_THAN(">"),
    GREATER_THAN_OR_EQUAL_TO(">="),
    LESS_THAN("<"),
    LESS_THAN_OR_EQUAL_TO("<=");

    private final String symbol;

    ConditionAlarme(String symbol) {
        this.symbol = symbol;
    }

}
