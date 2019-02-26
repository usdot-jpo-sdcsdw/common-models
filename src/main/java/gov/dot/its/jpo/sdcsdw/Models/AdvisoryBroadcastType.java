package gov.dot.its.jpo.sdcsdw.Models;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.fasterxml.jackson.annotation.JsonProperty;

@XmlJavaTypeAdapter(AdvisoryBroadcastTypeXmlAdapter.class)
public enum AdvisoryBroadcastType
{
    @JsonProperty("spatAggregate")
    SPAT_AGGREGATE("spatAggregate"),
    @JsonProperty("map")
    MAP("map"),
    @JsonProperty("tim")
    TIM("tim"),
    @JsonProperty("ev")
    EV("ev");
    
    
    private final String value;
    
    AdvisoryBroadcastType(String value) {
        this.value = value;
    }
    
    public String getValue() {
        return this.value;
    }
    
    public static AdvisoryBroadcastType fromValue(String val) {
        for (AdvisoryBroadcastType advisoryBroadcastType : AdvisoryBroadcastType.values()) {
            if (advisoryBroadcastType.value.equals(val)) {
                return advisoryBroadcastType;
            }
        }
        throw new IllegalArgumentException(val);
    }
}
