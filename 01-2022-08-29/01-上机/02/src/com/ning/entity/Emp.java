package com.ning.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

/**
 * @author 寜
 * @date 2022-08-29
 * @time 下午 07:30
 */
public class Emp {
    private BigDecimal EMPNO;
    private String ENAME;
    private String JOB;
    private BigDecimal MGR;
    private Date HIREDATE;
    private BigDecimal SAL;
    private BigDecimal COMM;
    private BigDecimal DEPTNO;

    @Override
    public String toString() {
        return "Emp{" +
                "EMPNO=" + EMPNO +
                ", ENAME='" + ENAME + '\'' +
                ", JOB='" + JOB + '\'' +
                ", MGR=" + MGR +
                ", HIREDATE=" + HIREDATE +
                ", SAL=" + SAL +
                ", COMM=" + COMM +
                ", DEPTNO=" + DEPTNO +
                '}';
    }

    public BigDecimal getEMPNO() {
        return EMPNO;
    }

    public void setEMPNO(BigDecimal EMPNO) {
        this.EMPNO = EMPNO;
    }

    public String getENAME() {
        return ENAME;
    }

    public void setENAME(String ENAME) {
        this.ENAME = ENAME;
    }

    public String getJOB() {
        return JOB;
    }

    public void setJOB(String JOB) {
        this.JOB = JOB;
    }

    public BigDecimal getMGR() {
        return MGR;
    }

    public void setMGR(BigDecimal MGR) {
        this.MGR = MGR;
    }

    public Date getHIREDATE() {
        return HIREDATE;
    }

    public void setHIREDATE(Date HIREDATE) {
        this.HIREDATE = HIREDATE;
    }

    public BigDecimal getSAL() {
        return SAL;
    }

    public void setSAL(BigDecimal SAL) {
        this.SAL = SAL;
    }

    public BigDecimal getCOMM() {
        return COMM;
    }

    public void setCOMM(BigDecimal COMM) {
        this.COMM = COMM;
    }

    public BigDecimal getDEPTNO() {
        return DEPTNO;
    }

    public void setDEPTNO(BigDecimal DEPTNO) {
        this.DEPTNO = DEPTNO;
    }

    public Emp() {
    }

    public Emp(BigDecimal EMPNO, String ENAME, String JOB, BigDecimal MGR, Date HIREDATE, BigDecimal SAL, BigDecimal COMM, BigDecimal DEPTNO) {
        this.EMPNO = EMPNO;
        this.ENAME = ENAME;
        this.JOB = JOB;
        this.MGR = MGR;
        this.HIREDATE = HIREDATE;
        this.SAL = SAL;
        this.COMM = COMM;
        this.DEPTNO = DEPTNO;
    }
}
