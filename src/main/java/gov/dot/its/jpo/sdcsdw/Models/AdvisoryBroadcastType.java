package gov.dot.its.jpo.sdcsdw.Models;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.fasterxml.jackson.annotation.JsonValue;

import gov.dot.its.jpo.sdcsdw.Models.xmlhelpers.AdvisoryBroadcastTypeXmlAdapter;

@XmlJavaTypeAdapter(AdvisoryBroadcastTypeXmlAdapter.class)
public enum AdvisoryBroadcastType
{
    SPAT_AGGREGATE("spatAggregate", 0),
    MAP("map", 1),
    TIM("tim", 2),
    EV("ev", 3);
    
    
    private final String stringValue;
    private final int intValue;
    
    AdvisoryBroadcastType(String stringValue, int intValue) {
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
    
    public static AdvisoryBroadcastType fromValue(String val) {
        for (AdvisoryBroadcastType advisoryBroadcastType : AdvisoryBroadcastType.values()) {
            if (advisoryBroadcastType.stringValue.equals(val)) {
                return advisoryBroadcastType;
            }
        }
        throw new IllegalArgumentException(val);
    }
    
    public static AdvisoryBroadcastType fromValue(int val) {
        for (AdvisoryBroadcastType advisoryBroadcastType : AdvisoryBroadcastType.values()) {
            if (advisoryBroadcastType.intValue == val) {
                return advisoryBroadcastType;
            }
        }
        throw new IllegalArgumentException(Integer.toString(val));
    }
}
