package gov.dot.its.jpo.sdcsdw.Models.xmlhelpers;

import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonIgnore;

class DialogIDXml {
    @XmlTransient
    private String dialogID;
    
    private String vehSitData;
    private String dataSubscription;
    private String advSitDataDep;
    private String advSitDatDist;
    private String reserved1;
    private String reserved2;
    private String objReg;
    private String objDisc;
    private String intersectionSitDataDep;
    private String intersectionSitDataQuery;

    @XmlTransient
    @JsonIgnore
    public String getDialogId() {
        return this.dialogID;
    }
    
    public String getVehSitData() {
        return vehSitData;
    }

    public void setVehSitData(String vehSitData) {
        this.dialogID = "vehSitData";
        
        this.vehSitData = vehSitData;
        this.dataSubscription = null;
        this.advSitDataDep = null;
        this.advSitDatDist = null;
        this.reserved1 = null;
        this.reserved2 = null;
        this.objReg = null;
        this.objDisc = null;
        this.intersectionSitDataDep = null;
        this.intersectionSitDataQuery = null;
    }

    public String getDataSubscription() {
        return dataSubscription;
    }

    public void setDataSubscription(String dataSubscription) {
        this.dialogID = "dataSubscription";
        
        this.vehSitData = null;
        this.dataSubscription = dataSubscription;
        this.advSitDataDep = null;
        this.advSitDatDist = null;
        this.reserved1 = null;
        this.reserved2 = null;
        this.objReg = null;
        this.objDisc = null;
        this.intersectionSitDataDep = null;
        this.intersectionSitDataQuery = null;
    }

    public String getAdvSitDataDep() {
        return advSitDataDep;
    }

    public void setAdvSitDataDep(String advSitDataDep) {
        this.dialogID = "advSitDataDep";
        
        this.vehSitData = null;
        this.dataSubscription = null;
        this.advSitDataDep = advSitDataDep;
        this.advSitDatDist = null;
        this.reserved1 = null;
        this.reserved2 = null;
        this.objReg = null;
        this.objDisc = null;
        this.intersectionSitDataDep = null;
        this.intersectionSitDataQuery = null;
    }

    public String getAdvSitDatDist() {
        return advSitDatDist;
    }

    public void setAdvSitDatDist(String advSitDatDist) {
        this.dialogID = "advSitDatDist";
        
        this.vehSitData = null;
        this.dataSubscription = null;
        this.advSitDataDep = null;
        this.advSitDatDist = advSitDatDist;
        this.reserved1 = null;
        this.reserved2 = null;
        this.objReg = null;
        this.objDisc = null;
        this.intersectionSitDataDep = null;
        this.intersectionSitDataQuery = null;
    }
    
    public String getReserved1() {
        return reserved1;
    }

    public void setReserved1(String reserved1) {
        this.dialogID = "reserved1";
        
        this.vehSitData = null;
        this.dataSubscription = null;
        this.advSitDataDep = null;
        this.advSitDatDist = null;
        this.reserved1 = reserved1;
        this.reserved2 = null;
        this.objReg = null;
        this.objDisc = null;
        this.intersectionSitDataDep = null;
        this.intersectionSitDataQuery = null;
    }

    public String getReserved2() {
        return reserved2;
    }

    public void setReserved2(String reserved2) {
        this.dialogID = "reserved2";
        
        this.vehSitData = null;
        this.dataSubscription = null;
        this.advSitDataDep = null;
        this.advSitDatDist = null;
        this.reserved1 = null;
        this.reserved2 = reserved2;
        this.objReg = null;
        this.objDisc = null;
        this.intersectionSitDataDep = null;
        this.intersectionSitDataQuery = null;
    }

    public String getObjReg() {
        return objReg;
    }

    public void setObjReg(String objReg) {
        this.dialogID = "objReg";
        
        this.vehSitData = null;
        this.dataSubscription = null;
        this.advSitDataDep = null;
        this.advSitDatDist = null;
        this.reserved1 = null;
        this.reserved2 = null;
        this.objReg = objReg;
        this.objDisc = null;
        this.intersectionSitDataDep = null;
        this.intersectionSitDataQuery = null;
    }

    public String getObjDisc() {
        return objDisc;
    }

    public void setObjDisc(String objDisc) {
        this.dialogID = "objDisc";
        
        this.vehSitData = null;
        this.dataSubscription = null;
        this.advSitDataDep = null;
        this.advSitDatDist = null;
        this.reserved1 = null;
        this.reserved2 = null;
        this.objReg = null;
        this.objDisc = objDisc;
        this.intersectionSitDataDep = null;
        this.intersectionSitDataQuery = null;
    }

    public String getIntersectionSitDataDep() {
        return intersectionSitDataDep;
    }

    public void setIntersectionSitDataDep(String intersectionSitDataDep) {
        this.dialogID = "intersectionSitDataDep";
        
        this.vehSitData = null;
        this.dataSubscription = null;
        this.advSitDataDep = null;
        this.advSitDatDist = null;
        this.reserved1 = null;
        this.reserved2 = null;
        this.objReg = null;
        this.objDisc = null;
        this.intersectionSitDataDep = intersectionSitDataDep;
        this.intersectionSitDataQuery = null;
    }

    public String getIntersectionSitDataQuery() {
        return intersectionSitDataQuery;
    }

    public void setIntersectionSitDataQuery(String intersectionSitDataQuery) {
        this.dialogID = "intersectionSitDataQuery";
        
        this.vehSitData = null;
        this.dataSubscription = null;
        this.advSitDataDep = null;
        this.advSitDatDist = null;
        this.reserved1 = null;
        this.reserved2 = null;
        this.objReg = null;
        this.objDisc = null;
        this.intersectionSitDataDep = null;
        this.intersectionSitDataQuery = intersectionSitDataQuery;
    }

    
}
