package gov.dot.its.jpo.sdcsdw.Models;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.fasterxml.jackson.annotation.JsonProperty;

import gov.dot.its.jpo.sdcsdw.Models.xmlhelpers.TxModeXmlAdapter;

@XmlJavaTypeAdapter(TxModeXmlAdapter.class)
public enum TxMode
{
    @JsonProperty("continuous")
    CONTINUOUS("continuous"),
    @JsonProperty("alternating")
    ALTERNATING("alternating");
    
    private final String value;
    
    TxMode(String value) {
        this.value = value;
    }
    
    public String getValue() {
        return this.value;
    }
    
    public static TxMode fromValue(String val) {
        for (TxMode txMode : TxMode.values()) {
            if (txMode.value.equals(val)) {
                return txMode;
            }
        }
        throw new IllegalArgumentException(val);
    }
}
