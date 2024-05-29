package com.example.cwiczenie2;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tabela
{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    public Tabela() {

    }

    public Tabela(long id, String val1, String val2) {
        this.id = id;
        this.val1 = val1;
        this.val2 = val2;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getVal1() {
        return val1;
    }

    public void setVal1(String val1) {
        this.val1 = val1;
    }

    public String getVal2() {
        return val2;
    }

    public void setVal2(String val2) {
        this.val2 = val2;
    }

    private String val1;
    private String val2;

}
