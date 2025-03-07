package com.example.APIClassRoom.models;

import com.example.APIClassRoom.ayudas.TipoUsuario;
import jakarta.persistence.Entity;

@Entity

public class Usuario {
    private Integer id;
    private String name;
    private String email;
    private String password;
    private String phone;
    private TipoUsuario tipoUsuario;

    public Usuario() {
    }

    public Usuario(Integer id, String name, String email, String password, String phone, TipoUsuario tipoUsuario) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.tipoUsuario = tipoUsuario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
}
