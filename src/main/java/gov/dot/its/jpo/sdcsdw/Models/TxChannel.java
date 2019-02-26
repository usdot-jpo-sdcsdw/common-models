package gov.dot.its.jpo.sdcsdw.Models;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.fasterxml.jackson.annotation.JsonProperty;

import gov.dot.its.jpo.sdcsdw.Models.xmlhelpers.TxChannelXmlAdapter;

@XmlJavaTypeAdapter(TxChannelXmlAdapter.class)
public enum TxChannel
{
    @JsonProperty("chControl")
    CH_CONTROL("chControl", 0),
    @JsonProperty("chService")
    CH_SERVICE("chService", 1),
    @JsonProperty("ch172")
    CH_172("ch172", 2),
    @JsonProperty("ch174")
    CH_174("ch174", 3),
    @JsonProperty("ch176")
    CH_176("ch176", 4),
    @JsonProperty("ch178")
    CH_178("ch178", 5),
    @JsonProperty("ch180")
    CH_180("ch180", 6),
    @JsonProperty("ch182")
    CH_182("ch182", 7),
    @JsonProperty("ch184")
    CH_184("ch184", 8);
    
    private final String stringValue;
    private final int intValue;
    
    TxChannel(String stringValue, int intValue) {
        this.stringValue = stringValue;
        this.intValue = intValue;
    }
    
    public String getString() {
        return this.stringValue;
    }
    
    public int getInt() {
        return this.intValue;
    }
    
    public static TxChannel fromValue(String val) {
        for (TxChannel txChannel : TxChannel.values()) {
            if (txChannel.stringValue.equals(val)) {
                return txChannel;
            }
        }
        throw new IllegalArgumentException(val);
    }
    
    public static TxChannel fromValue(int val) {
        for (TxChannel txChannel : TxChannel.values()) {
            if (txChannel.intValue == val) {
                return txChannel;
            }
        }
        throw new IllegalArgumentException(Integer.toString(val));
    }
    
}
