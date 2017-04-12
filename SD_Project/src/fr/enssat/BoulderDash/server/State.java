package fr.enssat.BoulderDash.server;

import java.io.Serializable;

public class State implements Serializable{
    private String id;
    private String info;

    public State(String id, String msg) {
        this.id = id;
        this.info = msg;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the info
     */
    public String getInfo() {
        return info;
    }

    /**
     * @param info the info to set
     */
    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "State{" + "id=" + id + ", info=" + info + '}';
    }
    
}


