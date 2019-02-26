package gov.dot.its.jpo.sdcsdw.Models;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.fasterxml.jackson.annotation.JsonValue;

import gov.dot.its.jpo.sdcsdw.Models.xmlhelpers.TxChannelXmlAdapter;

@XmlJavaTypeAdapter(TxChannelXmlAdapter.class)
public enum TxChannel
{
    CH_CONTROL("chControl", 0),
    CH_SERVICE("chService", 1),
    CH_172("ch172", 2),
    CH_174("ch174", 3),
    CH_176("ch176", 4),
    CH_178("ch178", 5),
    CH_180("ch180", 6),
    CH_182("ch182", 7),
    CH_184("ch184", 8);
    
    private final String stringValue;
    private final int intValue;
    
    TxChannel(String stringValue, int intValue) {
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
