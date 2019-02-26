package gov.dot.its.jpo.sdcsdw.Models;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import gov.dot.its.jpo.sdcsdw.Models.xmlhelpers.TxModeXmlAdapter;

@XmlJavaTypeAdapter(TxModeXmlAdapter.class)
public enum TxMode
{
    CONTINUOUS("continuous", 0),
    ALTERNATING("alternating", 1);
    
    private final String stringValue;
    private final int intValue;
    
    TxMode(String stringValue, int intValue) {
        this.stringValue = stringValue;
        this.intValue = intValue;
    }
    
    @JsonValue
    public String getString() {
        return this.stringValue;
    }
    
    public int getInt() {
        return this.intValue;
    }
    
    public static TxMode fromValue(String val) {
        for (TxMode txMode : TxMode.values()) {
            if (txMode.stringValue.equals(val)) {
                return txMode;
            }
        }
        throw new IllegalArgumentException(val);
    }
    
    public static TxMode fromValue(int val) {
        for (TxMode txMode : TxMode.values()) {
            if (txMode.intValue == val) {
                return txMode;
            }
        }
        throw new IllegalArgumentException(Integer.toString(val));
    }
}
