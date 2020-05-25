package com.test.model;
import java.util.Date;
public class User {
    private  int id;
    private String password;
    private String userName;
    private String email;
    private String role;
    private int status;
    private String ip;
    private Date time;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                ", status=" + status +
                ", ip='" + ip + '\'' +
                ", time=" + time +
                '}';
    }

    public User(int id, String password, String userName, String email, String role, int status, String ip, Date time) {
        this.id = id;
        this.password = password;
        this.userName = userName;
        this.email = email;
        this.role = role;
        this.status = status;
        this.ip = ip;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
