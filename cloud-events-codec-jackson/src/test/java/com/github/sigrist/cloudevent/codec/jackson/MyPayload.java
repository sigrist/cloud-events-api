package com.github.sigrist.cloudevent.codec.jackson;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MyPayload implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 3917940216215866099L;
    private final Integer age;
    private final String name;

    public MyPayload(@JsonProperty("age") final Integer age, @JsonProperty("name") final String name) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name:" + this.getName() + " / Age: " + this.getAge();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MyPayload) {
            final MyPayload other = (MyPayload) obj;

            return this.name.equals(other.name) && this.age.equals(other.age);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
}
