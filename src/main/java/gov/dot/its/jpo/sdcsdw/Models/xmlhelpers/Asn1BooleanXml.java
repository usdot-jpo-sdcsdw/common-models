package gov.dot.its.jpo.sdcsdw.Models.xmlhelpers;

import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Asn1BooleanXml
{
    @XmlTransient
    @JsonIgnore
    private boolean value;
    
    private String falseFlag;
    private String trueFlag;
    
    public String getFalse() {
        return falseFlag;
    }

    public void setFalse(String falseFlag) {
        this.falseFlag = falseFlag;
        value = false;
    }

    public String getTrue() {
        return trueFlag;
    }

    public void setTrue(String trueFlag) {
        this.trueFlag = trueFlag;
        value = true;
    }
    
    @XmlTransient
    @JsonIgnore
    boolean getValue() {
        return value;
    }
}
