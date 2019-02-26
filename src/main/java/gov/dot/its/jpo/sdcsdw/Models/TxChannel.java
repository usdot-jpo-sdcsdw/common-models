package gov.dot.its.jpo.sdcsdw.Models;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.fasterxml.jackson.annotation.JsonProperty;

import gov.dot.its.jpo.sdcsdw.Models.xmlhelpers.TxChannelXmlAdapter;

@XmlJavaTypeAdapter(TxChannelXmlAdapter.class)
public enum TxChannel
{
    @JsonProperty("chControl")
    CH_CONTROL("chControl"),
    @JsonProperty("chService")
    CH_SERVICE("chService"),
    @JsonProperty("ch172")
    CH_172("ch172"),
    @JsonProperty("ch174")
    CH_174("ch174"),
    @JsonProperty("ch176")
    CH_176("ch176"),
    @JsonProperty("ch178")
    CH_178("ch178"),
    @JsonProperty("ch180")
    CH_180("ch180"),
    @JsonProperty("ch182")
    CH_182("ch182"),
    @JsonProperty("ch184")
    CH_184("ch184");
    
    private final String value;
    
    TxChannel(String value) {
        this.value = value;
    }
    
    public String getValue() {
        return this.value;
    }
    
    public static TxChannel fromValue(String val) {
        for (TxChannel txChannel : TxChannel.values()) {
            if (txChannel.value.equals(val)) {
                return txChannel;
            }
        }
        throw new IllegalArgumentException(val);
    }
    
}
