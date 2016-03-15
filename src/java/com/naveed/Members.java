
package com.naveed;

/**
 * Simple class Members.
 * @author LamineBA
 */
public class Members {
    
    private int id;
    private String name;

    
    public Members (String name){
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }    
}