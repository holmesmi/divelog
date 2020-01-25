package org.holmesmi.divelog.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Date;

@Entity
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Location location;
    private ArrayList<Diver> divers;
    private Date start;
    private Date end;
    private ArrayList<Dive> dives;
    private int diverWeight;
    public Trip(Location location, Date start, Date end) {
        this.location = location;
        this.start = start;
        this.end = end;
    }

    public long getId() {
        return id;
    }

    public int getDiverWeight() {
        return diverWeight;
    }

    public void setDiverWeight(int diverWeight) {
        this.diverWeight = diverWeight;
    }

    public void addDiver(Diver diver) {
        divers.add(diver);
    }

    public void addDive(Dive dive){
        dives.add(dive);
    }
}
