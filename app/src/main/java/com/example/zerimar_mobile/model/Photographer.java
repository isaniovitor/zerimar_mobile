package com.example.zerimar_mobile.model;

import java.io.Serializable;

public class Photographer implements Serializable {

    private String nome;
    private String location;
    private String specialization;

    public Photographer() {
    }

    public Photographer(String nome, String location, String specialization) {
        this.nome = nome;
        this.location = location;
        this.specialization = specialization;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
