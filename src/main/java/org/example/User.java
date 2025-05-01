package org.example;

/**
 * Abstract class representing a user.
 */
public abstract class User {
    protected String name;
    protected String id;

    public User(String name, String id) {
        this.name = name;
        this.id = id;
    }

    /**
     * Abstract method for showing user options.
     */
    public abstract void viewOptions();

    public String getName() { return name; }
    public String getId() { return id; }
}
