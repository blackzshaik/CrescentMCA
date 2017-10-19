package com.blackz.crescentmca2017_2019;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by blackzshaik on 10/10/17.
 */
@IgnoreExtraProperties
public class Nope {

    public String OOAD;
    private String IJP;
    private String TCPIP;
    private String NS,CC,RMT,JL,OL,CL,GeneralInfo;

    public void Nope(){

    }

    public void Nope(String OOAD)
    {
        this.OOAD =OOAD;
    }

    public void setIJP(String IJP) {
        this.IJP = IJP;
    }

    public void setTCPIP(String TCPIP) {
        this.TCPIP = TCPIP;
    }

    public void setCC(String CC) {
        this.CC = CC;
    }

    public void setCL(String CL) {
        this.CL = CL;
    }

    public void setJL(String JL) {
        this.JL = JL;
    }

    public void setNS(String NS) {
        this.NS = NS;
    }

    public void setOL(String OL) {
        this.OL = OL;
    }

    public void setRMT(String RMT) {
        this.RMT = RMT;
    }

    public void setGeneralInfo(String GeneralInfo){
        this.GeneralInfo = GeneralInfo;
    }

    @Exclude
    public String getOOAD() {
        return OOAD;
    }

    public String getIJP() {
        return IJP;
    }

    public String getTCPIP() {
        return TCPIP;
    }

    public String getCC() {
        return CC;
    }

    public String getCL() {
        return CL;
    }

    public String getJL() {
        return JL;
    }

    public String getNS() {
        return NS;
    }

    public String getOL() {
        return OL;
    }

    public String getRMT() {
        return RMT;
    }


    public String getGeneralInfo()
    {
        return GeneralInfo;
    }

}
