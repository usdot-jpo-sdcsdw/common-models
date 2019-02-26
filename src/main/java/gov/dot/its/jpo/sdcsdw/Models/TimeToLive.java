package gov.dot.its.jpo.sdcsdw.Models;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import gov.dot.its.jpo.sdcsdw.Models.xmlhelpers.TimeToLiveXmlAdapter;

@XmlJavaTypeAdapter(TimeToLiveXmlAdapter.class)
public enum TimeToLive
{
    MINUTE("minute", 0),
    HALF_HOUR("halfHour", 1),
    DAY("day", 2),
    WEEK("week", 3),
    MONTH("month", 4),
    YEAR("year", 5);
    
    private final String stringValue;
    private final int intValue;
    
    TimeToLive(String stringValue, int intValue) {
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
