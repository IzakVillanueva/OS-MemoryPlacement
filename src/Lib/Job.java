/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lib;

/**
 *
 * @author Izak
 */
public class Job {
    protected String name;
    protected int size;
    protected int time;
    protected boolean inMemory;
    protected boolean done;
    protected boolean hole;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public boolean isInMemory() {
        return inMemory;
    }

    public void setInMemory(boolean inMemory) {
        this.inMemory = inMemory;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public boolean isHole() {
        return hole;
    }

    public void setHole(boolean hole) {
        this.hole = hole;
    }
    
    public Job(String name, int size, int time, boolean inMemory, boolean done, boolean hole){
        this.name = name;
        this.size = size;
        this.time = time;
        this.inMemory = inMemory;
        this.done = done;
        this.hole = hole;
    }
}
