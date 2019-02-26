package gov.dot.its.jpo.sdcsdw.Models;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.fasterxml.jackson.annotation.JsonProperty;

import gov.dot.its.jpo.sdcsdw.Models.xmlhelpers.SemiSequenceIDXmlAdapter;

@XmlJavaTypeAdapter(SemiSequenceIDXmlAdapter.class)
public enum SemiSequenceID
{

    @JsonProperty("svcReq")
    SVC_REQ("svcReq"),

    @JsonProperty("svcResp")
    SVC_RESP("svcResp"),
    
    @JsonProperty("dataReq")
    DATA_REQ("dataReq"),
    
    @JsonProperty("dataConf")
    DATA_CONF("dataConf"),
    
    @JsonProperty("data")
    DATA("data"),
    
    @JsonProperty("accept")
    ACCEPT("accept"),
    
    @JsonProperty("receipt")
    RECEIPT("receipt"),
    
    @JsonProperty("subscriptionReq")
    SUBSCRIPTION_REQ("subscriptionReq"),
    
    @JsonProperty("subscriptinoResp")
    SUBSCRIPTINO_RESP("subscriptinoResp"), // NOT A TYPO, check the spec
    
    @JsonProperty("subscriptionCancel")
    SUBSCRIPTION_CANCEL("subscriptionCancel");
    
    
    private final String value;
    
    SemiSequenceID(String value) {
        this.value = value;
    }
    
    public String getValue() {
        return this.value;
    }
    
    public static SemiSequenceID fromValue(String val) {
        for (SemiSequenceID semiSequenceID : SemiSequenceID.values()) {
            if (semiSequenceID.value.equals(val)) {
                return semiSequenceID;
            }
        }
        throw new IllegalArgumentException(val);
    }
}
