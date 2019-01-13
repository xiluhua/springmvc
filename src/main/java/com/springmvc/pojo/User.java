package com.springmvc.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class User {
    private Integer id;
    private String username;
    private Integer gender;
    private Integer age;
    private Addr addr;
    @DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
    private Date birth;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Addr getAddr() {
        return addr;
    }

    public void setAddr(Addr addr) {
        this.addr = addr;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User(Integer id, String username, Integer gender, Integer age) {
        this.id = id;
        this.username = username;
        this.gender = gender;
        this.age = age;
    }

    public User() {
        super();
    }

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", gender=" + gender + ", age=" + age + ", addr=" + addr
				+ ", birth=" + birth + "]";
	}
    
}
