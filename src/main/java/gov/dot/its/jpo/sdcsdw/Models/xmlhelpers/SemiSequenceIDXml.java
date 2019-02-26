package gov.dot.its.jpo.sdcsdw.Models.xmlhelpers;

import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

class SemiSequenceIDXml {
    private String semiSequenceID;
    
    private String svcReq;
	private String svcResp;
    private String dataReq;
    private String dataConf;
    private String data;
    private String accept;
    private String receipt;
    private String subscriptionReq;
    private String subscriptinoResp; // NOT A TYPO, check the spec
    private String subscriptionCancel;
    
	public String getDataConf()
    {
        return dataConf;
    }

    public void setDataConf(String dataConf)
    {
        this.dataConf = dataConf;
        semiSequenceID = "dataConf";
    }

    public String getSubscriptionReq()
    {
        return subscriptionReq;
    }

    public void setSubscriptionReq(String subscriptionReq)
    {
        this.subscriptionReq = subscriptionReq;
        semiSequenceID = "subscriptionReq";
    }

    public String getSubscriptinoResp()
    {
        return subscriptinoResp;
    }

    public void setSubscriptinoResp(String subscriptinoResp)
    {
        this.subscriptinoResp = subscriptinoResp;
        semiSequenceID = "subscriptinoResp";
    }

    public String getSubscriptionCancel()
    {
        return subscriptionCancel;
    }

    public void setSubscriptionCancel(String subscriptionCancel)
    {
        this.subscriptionCancel = subscriptionCancel;
        semiSequenceID = "subscriptionCancel";
    }

    public String getDataReq ()
    {
        return dataReq;
    }

    public void setDataReq (String dataReq)
    {
        this.dataReq = dataReq;
        this.semiSequenceID="dataReq";
    }
	public String getAccept() {
		return accept;
	}

	public void setAccept(String accept) {
		this.accept = accept;
		this.semiSequenceID = "accept";
	}

	public String getReceipt() {
		return receipt;
	}

	public void setReceipt(String receipt) {
		this.receipt = receipt;
		this.semiSequenceID = "receipt";
	}

	public String getSvcReq() {
		return svcReq;
	}

	public void setSvcReq(String svcReq) {
		this.svcReq = svcReq;
		this.semiSequenceID = "svcReq";
	}

	public String getSvcResp() {
		return svcResp;
	}

	public void setSvcResp(String svcResp) {
		this.svcResp = svcResp;
		this.semiSequenceID = "svcResp";
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
		this.semiSequenceID = "data";
	}

	@XmlTransient
	@JsonIgnore
	public String getSemiSequenceID() {
		return this.semiSequenceID;
	}
	

}
