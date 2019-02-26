package gov.dot.its.jpo.sdcsdw.Models;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.fasterxml.jackson.annotation.JsonProperty;

import gov.dot.its.jpo.sdcsdw.Models.xmlhelpers.SemiSequenceIDXmlAdapter;

@XmlJavaTypeAdapter(SemiSequenceIDXmlAdapter.class)
public enum SemiSequenceID
{

    @JsonProperty("svcReq")
    SVC_REQ("svcReq", 1),

    @JsonProperty("svcResp")
    SVC_RESP("svcResp", 2),
    
    @JsonProperty("dataReq")
    DATA_REQ("dataReq", 3),
    
    @JsonProperty("dataConf")
    DATA_CONF("dataConf", 4),
    
    @JsonProperty("data")
    DATA("data", 5),
    
    @JsonProperty("accept")
    ACCEPT("accept", 6),
    
    @JsonProperty("receipt")
    RECEIPT("receipt", 7),
    
    @JsonProperty("subscriptionReq")
    SUBSCRIPTION_REQ("subscriptionReq", 8),
    
    @JsonProperty("subscriptinoResp")
    SUBSCRIPTINO_RESP("subscriptinoResp", 9), // NOT A TYPO, check the spec
    
    @JsonProperty("subscriptionCancel")
    SUBSCRIPTION_CANCEL("subscriptionCancel", 10);
    
    
    private final String stringValue;
    private final int intValue;
    
    SemiSequenceID(String stringValue, int intValue) {
        this.stringValue = stringValue;
        this.intValue = intValue;
    }
    
    public String getString() {
        return this.stringValue;
    }
    
    public int getInt() {
        return this.intValue;
    }
    
    public static SemiSequenceID fromValue(String val) {
        for (SemiSequenceID semiSequenceID : SemiSequenceID.values()) {
            if (semiSequenceID.stringValue.equals(val)) {
                return semiSequenceID;
            }
        }
        throw new IllegalArgumentException(val);
    }
    
    public static SemiSequenceID fromValue(int val) {
        for (SemiSequenceID semiSequenceID : SemiSequenceID.values()) {
            if (semiSequenceID.intValue == val) {
                return semiSequenceID;
            }
        }
        throw new IllegalArgumentException(Integer.toString(val));
    }
}
