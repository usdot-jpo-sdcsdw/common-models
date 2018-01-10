package gov.dot.its.jpo.sdcsdw.Models;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "ServiceResponse")
@XmlType(propOrder = { "dialogID", "seqID", "groupID", "requestID", "expiration", "serviceRegion", "hash" })
public class ServiceResponse extends DialogMessage {

	@XmlElement
	public DialogID getDialogID() {
		return dialogID;
	}

	public void setDialogID(DialogID dialogID) {
		this.dialogID = dialogID;
	}

	@XmlElement
	public String getGroupID() {
		return groupID;
	}

	public void setGroupID(String groupID) {
		this.groupID = groupID;
	}

	@XmlElement
	public String getRequestID() {
		return requestID;
	}

	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}

	@XmlElement
	public Expiration getExpiration() {
		return expiration;
	}

	public void setExpiration(Expiration expiration) {
		this.expiration = expiration;
	}

	@XmlElement
	public ServiceRegion getServiceRegion() {
		return serviceRegion;
	}

	public void setServiceRegion(ServiceRegion serviceRegion) {
		this.serviceRegion = serviceRegion;
	}

	@XmlElement
	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	@XmlElement
	public SeqID getSeqID() {
		return seqID;
	}

	public void setSeqID(SeqID seqID) {
		this.seqID = seqID;
	}

	private DialogID dialogID;
	private String groupID;
	private String requestID;
	private Expiration expiration;
	private ServiceRegion serviceRegion;
	private String hash;
	private SeqID seqID;

	public String getASN1MessageType() {
		// TODO Auto-generated method stub
		return "ServiceResponse";
	}

}