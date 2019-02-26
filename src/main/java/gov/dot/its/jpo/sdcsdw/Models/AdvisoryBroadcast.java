package gov.dot.its.jpo.sdcsdw.Models;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "AdvisoryBroadcast", propOrder = { "messagePsid", "broadcastInst", "advisoryMessage" })
public class AdvisoryBroadcast {
	private String messagePsid;

	private BroadcastInstructions broadcastInst;

	private String advisoryMessage;

	public String getMessagePsid() {
		return messagePsid;
	}

	public void setMessagePsid(String messagePsid) {
		this.messagePsid = messagePsid;
	}

	public BroadcastInstructions getBroadcastInst() {
		return broadcastInst;
	}

	public void setBroadcastInst(BroadcastInstructions broadcastInst) {
		this.broadcastInst = broadcastInst;
	}

	public String getAdvisoryMessage() {
		return advisoryMessage;
	}

	public void setAdvisoryMessage(String advisoryMessage) {
		this.advisoryMessage = advisoryMessage;
	}

}
