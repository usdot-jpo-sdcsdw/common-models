package gov.dot.its.jpo.sdcsdw.MessageTypes;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "AdvisoryBroadcast", propOrder = { "messagePsid", "broadcastInst", "advisoryMessage" })
public class AdvisoryBroadcast {
	private String messagePsid;

	private BroadcastInst broadcastInst;

	private String advisoryMessage;

	public String getMessagePsid() {
		return messagePsid;
	}

	public void setMessagePsid(String messagePsid) {
		this.messagePsid = messagePsid;
	}

	public BroadcastInst getBroadcastInst() {
		return broadcastInst;
	}

	public void setBroadcastInst(BroadcastInst broadcastInst) {
		this.broadcastInst = broadcastInst;
	}

	public String getAdvisoryMessage() {
		return advisoryMessage;
	}

	public void setAdvisoryMessage(String advisoryMessage) {
		this.advisoryMessage = advisoryMessage;
	}

}
