package com.codeforgeyt.jpainheritjoinedtable.model;

import javax.persistence.Entity;
import javax.persistence.Table;

//@Entity
//@Table(name="ARCHER")
public class Archer //extends Infantry 
{
    private String range;

    public Archer() {
    }

    public Archer(InfantryType type, Integer moveSpeed, Integer durability, Integer attack, String range) {
        //super(type, moveSpeed, durability, attack);
        this.range = range;
    }
}
