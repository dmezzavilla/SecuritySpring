package com.spring.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * @author Daniel Mezzavilla
 */
@Entity
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String surname;
    private String cpf;
    private String password;
    private String email;
    private String telefone;
    private UserRole userRole;
    private Date dataDeCadastro;
    private Boolean isActive;
    private Date dataDeDesativacao;
    private Date ultimoLogin;

    @OneToOne(cascade = CascadeType.PERSIST)
    private UserAddress userAddress;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public Date getDataDeCadastro() {
        return dataDeCadastro;
    }

    public void setDataDeCadastro(Date dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Date getDataDeDesativacao() {
        return dataDeDesativacao;
    }

    public void setDataDeDesativacao(Date dataDeDesativacao) {
        this.dataDeDesativacao = dataDeDesativacao;
    }

    public Date getUltimoLogin() {
        return ultimoLogin;
    }

    public void setUltimoLogin(Date ultimoLogin) {
        this.ultimoLogin = ultimoLogin;
    }

    public UserAddress getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(UserAddress userAddress) {
        this.userAddress = userAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(name, user.name) &&
                Objects.equals(surname, user.surname) &&
                Objects.equals(cpf, user.cpf) &&
                Objects.equals(password, user.password) &&
                Objects.equals(email, user.email) &&
                Objects.equals(telefone, user.telefone) &&
                userRole == user.userRole &&
                Objects.equals(dataDeCadastro, user.dataDeCadastro) &&
                Objects.equals(isActive, user.isActive) &&
                Objects.equals(dataDeDesativacao, user.dataDeDesativacao) &&
                Objects.equals(ultimoLogin, user.ultimoLogin) &&
                Objects.equals(userAddress, user.userAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, cpf, password, email, telefone, userRole, dataDeCadastro, isActive, dataDeDesativacao, ultimoLogin, userAddress);
    }
}
