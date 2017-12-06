package com.neo
public class PersonExt {

    String name
    int age
    boolean boy

    @Override
    public String toString() {
        return "I am $name, $age years old, " + (boy?"I am a boy":"I am a gril");
    }
}
