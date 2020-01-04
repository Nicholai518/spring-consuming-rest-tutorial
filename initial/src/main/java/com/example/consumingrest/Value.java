package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {

    //Fields
    private Long id;
    private String quote;

    // Default constuctor
    public Value() {

    }

    // Id accessor
    public Long getId() {
        return this.id;
    }

    // Qoute Accessor
    public String getQuote() {
        return this.quote;
    }

    // ID mutator
    public void setId(Long id) {
        this.id = id;
    }

    // Quote mutator
    public void setQuote(String quote) {
        this.quote = quote;
    }

    @Override    // Overriding for custom behavior
    public String toString() {
        return "Value{" +
                "id=" + id +
                ", quote='" + quote + '\'' +
                '}';
    }

}  // End of Value class
