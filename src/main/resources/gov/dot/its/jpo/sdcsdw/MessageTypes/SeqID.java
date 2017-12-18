package gov.dot.its.jpo.sdcsdw.MessageTypes;

public class SeqID {
	private String svcReq;
	private String seqId;
	private String svcResp;
	private String data;
	private String receipt;
	private String accept;
	private String dataReq;

    public String getDataReq ()
    {
        return dataReq;
    }

    public void setDataReq (String dataReq)
    {
        this.dataReq = dataReq;
        this.seqId="dataReq";
    }
	public String getAccept() {
		return accept;
	}

	public void setAccept(String accept) {
		this.accept = accept;
		this.seqId = "accept";
	}

	public String getReceipt() {
		return receipt;
	}

	public void setReceipt(String receipt) {
		this.receipt = receipt;
		this.seqId = "receipt";
	}

	public String getSvcReq() {
		return svcReq;
	}

	public void setSvcReq(String svcReq) {
		this.svcReq = svcReq;
		this.seqId = "svcReq";
	}

	public String getSvcResp() {
		return svcResp;
	}

	public void setSvcResp(String svcResp) {
		this.svcResp = svcResp;
		this.seqId = "svcResp";
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
		this.seqId = "data";
	}

	public String getSeqId() {
		return this.seqId;
	}
	

}
