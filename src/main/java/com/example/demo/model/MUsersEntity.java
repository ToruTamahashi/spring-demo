package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "m_users", catalog = "")
public class MUsersEntity {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer userId;

    @Basic
    @Column(name = "user_name")
    String userName;

    @Basic
    @Column(name = "mail_address")
    String mailAddress;

    @Basic
    @Column(name = "password")
    String password;


    public Integer getId() {
        return userId;
    }

    public void setId(Integer id) {
        this.userId = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setName(String name) {
        this.userName = name;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String address) {
        this.mailAddress = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }
}
