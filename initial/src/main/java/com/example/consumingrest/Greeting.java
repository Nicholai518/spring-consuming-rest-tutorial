package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Greeting {
    // Fields
    private String content;
    private Long id;


    // Default Constructor
    public Greeting() {

    }

    // Content accessor
    public String getContent() {
        return content;
    }

    // Content Mutator
    public void setMessage() {
        this.content = content;
    }

    // Id Accessor
    public Long getId() {
        return id;
    }

    // Id mutator
    public void setId(Long id) {
        this.id = id;
    }

    @Override    // Overriding for custom behavior
    public String toString() {
        return "Greeting{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}  // End of Greeting class
