package org.holmesmi.divelog.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Date;

@Entity
public class Dive {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long diveNumber;
    private Date date;
    private Time start;
    private Time end;
    private String site;
    private int maxDepth;
    private int startPressure;
    private int endPressure;
    private int minTemp;
    private int weightAdded;
    public Dive(Date date) {
        this.date = date;
    }

    public long getDiveNumber() {
        return diveNumber;
    }

    public Date getDate() {
        return date;
    }

    public Time getStart() {
        return start;
    }

    public void setStart(Time start) {
        this.start = start;
    }

    public Time getEnd() {
        return end;
    }

    public void setEnd(Time end) {
        this.end = end;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public int getMaxDepth() {
        return maxDepth;
    }

    public void setMaxDepth(int maxDepth) {
        this.maxDepth = maxDepth;
    }

    public int getStartPressure() {
        return startPressure;
    }

    public void setStartPressure(int startPressure) {
        this.startPressure = startPressure;
    }

    public int getEndPressure() {
        return endPressure;
    }

    public void setEndPressure(int endPressure) {
        this.endPressure = endPressure;
    }

    public int getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(int minTemp) {
        this.minTemp = minTemp;
    }

    public int getWeightAdded() {
        return weightAdded;
    }

    public void setWeightAdded(int weightAdded) {
        this.weightAdded = weightAdded;
    }
}
