package gov.dot.its.jpo.sdcsdw.Models;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.fasterxml.jackson.annotation.JsonProperty;

import gov.dot.its.jpo.sdcsdw.Models.xmlhelpers.TimeToLiveXmlAdapter;

@XmlJavaTypeAdapter(TimeToLiveXmlAdapter.class)
public enum TimeToLive
{
    @JsonProperty("minute")
    MINUTE("minute"),
    @JsonProperty("halfHour")
    HALF_HOUR("halfHour"),
    @JsonProperty("day")
    DAY("day"),
    @JsonProperty("week")
    WEEK("week"),
    @JsonProperty("month")
    MONTH("month"),
    @JsonProperty("year")
    YEAR("year");
    
    private final String value;
    
    TimeToLive(String value) {
        this.value = value;
    }
    
    public String getValue() {
        return this.value;
    }
    
    public static TimeToLive fromValue(String val) {
        for (TimeToLive timeToLive : TimeToLive.values()) {
            if (timeToLive.value.equals(val)) {
                return timeToLive;
            }
        }
        throw new IllegalArgumentException(val);
    }
}
