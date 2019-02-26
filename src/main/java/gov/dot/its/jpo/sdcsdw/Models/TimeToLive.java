package gov.dot.its.jpo.sdcsdw.Models;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.fasterxml.jackson.annotation.JsonProperty;

import gov.dot.its.jpo.sdcsdw.Models.xmlhelpers.TimeToLiveXmlAdapter;

@XmlJavaTypeAdapter(TimeToLiveXmlAdapter.class)
public enum TimeToLive
{
    @JsonProperty("minute")
    MINUTE("minute", 0),
    @JsonProperty("halfHour")
    HALF_HOUR("halfHour", 1),
    @JsonProperty("day")
    DAY("day", 2),
    @JsonProperty("week")
    WEEK("week", 3),
    @JsonProperty("month")
    MONTH("month", 4),
    @JsonProperty("year")
    YEAR("year", 5);
    
    private final String stringValue;
    private final int intValue;
    
    TimeToLive(String stringValue, int intValue) {
        this.stringValue = stringValue;
        this.intValue = intValue;
    }
    
    public String getString() {
        return this.stringValue;
    }
    
    public int getInt() {
        return this.intValue;
    }
    
    public static TimeToLive fromValue(String val) {
        for (TimeToLive timeToLive : TimeToLive.values()) {
            if (timeToLive.stringValue.equals(val)) {
                return timeToLive;
            }
        }
        throw new IllegalArgumentException(val);
    }
    
    public static TimeToLive fromValue(int val) {
        for (TimeToLive timeToLive : TimeToLive.values()) {
            if (timeToLive.intValue == val) {
                return timeToLive;
            }
        }
        throw new IllegalArgumentException(Integer.toString(val));
    }
}
