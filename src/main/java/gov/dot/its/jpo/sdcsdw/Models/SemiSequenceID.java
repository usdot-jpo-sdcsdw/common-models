package gov.dot.its.jpo.sdcsdw.Models;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.fasterxml.jackson.annotation.JsonValue;

import gov.dot.its.jpo.sdcsdw.Models.xmlhelpers.SemiSequenceIDXmlAdapter;

@XmlJavaTypeAdapter(SemiSequenceIDXmlAdapter.class)
public enum SemiSequenceID
{

    SVC_REQ("svcReq", 1),
    SVC_RESP("svcResp", 2),
    DATA_REQ("dataReq", 3),
    DATA_CONF("dataConf", 4),
    DATA("data", 5),
    ACCEPT("accept", 6),
    RECEIPT("receipt", 7),
    SUBSCRIPTION_REQ("subscriptionReq", 8),
    SUBSCRIPTINO_RESP("subscriptinoResp", 9), // NOT A TYPO, check the spec
    SUBSCRIPTION_CANCEL("subscriptionCancel", 10);
    
    
    private final String stringValue;
    private final int intValue;
    
    SemiSequenceID(String stringValue, int intValue) {
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
