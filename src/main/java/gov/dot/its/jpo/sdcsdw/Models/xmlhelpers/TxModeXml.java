package gov.dot.its.jpo.sdcsdw.Models.xmlhelpers;

import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class TxModeXml {
    private String txMode;
    
	private String alternating;
	private String continuous;

    public String getAlternating ()
    {
        return alternating;
    }

    public void setAlternating (String alternating)
    {
        this.alternating = alternating;
        txMode = "alternating";
    }
    
    public String getContinuous ()
    {
        return continuous;
    }

    public void setContinuous (String continuous)
    {
        this.continuous = continuous;
        txMode = "continuous";
    }

    @XmlTransient
    @JsonIgnore
    public String getTxMode() {
        return txMode;
    }
}
