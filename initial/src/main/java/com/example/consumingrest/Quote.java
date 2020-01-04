package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

    //Fields
    private String type;
    private Value value;

    // Default constructor
    public Quote() {

    }

    // String Accessor
    public String getType() {
        return type;
    }

    // String mutator
    public void setType(String type) {
        this.type = type;
    }

    // Value accessor
    public Value getValue() {
        return value;
    }

    // Value mutator
    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "type='" + type + '\'' +
                ", value=" + value +
                '}';
    }


} // End of Quote Class
