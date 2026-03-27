package com.alex.demo.Entities;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "EMP")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String ename;
    private String job;
    private Integer mgr;
    private Date hiredate;
    private int sal;
    private Integer comm;
    private int deptno;

    public Employee() {}
    public Employee(int id, String ename, String job, Integer mgr, Date hiredate, int salary, Integer comm, int deptno) {
        this.id = id;
        this.ename = ename;
        this.job = job;
        this.mgr = mgr;
        this.hiredate = hiredate;
        this.sal = salary;
        this.comm = comm;
        this.deptno = deptno;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getEname() {
        return ename;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }
    public Integer getMgr() {
        return this.mgr;
    }
    public void setMgr(Integer mgr) {
        this.mgr = mgr;
    }
    public Date getHireDate() {
        return this.hiredate;
    }
    public void set(Date hiredate) {
        this.hiredate = hiredate;
    }
    public int getSal() {
        return this.sal;
    }
    public void setSal(int sal) {
        this.sal= sal;
    }
    public Integer getComm() {
        return this.comm;
    }
    public void setComm(Integer comm) {
        this.comm = comm;
    }
    public int getDeptno() {
        return this.deptno;
    }
    public void setDeptno(int deptno) {
        this.deptno= deptno;
    }
    public String getJob() {
        return this.job;
    }
    public void setJob(String job) {
        this.job = job;
    }
}

