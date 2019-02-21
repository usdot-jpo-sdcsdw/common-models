package gov.dot.its.jpo.sdcsdw.Models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(name = "ServiceRequest")
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(propOrder = { "dialogID", "seqID", "groupID", "requestID", "destination" })
public class ServiceRequest extends DialogMessage {
	DialogID dialogID;
	SeqID seqID;
	String groupID;
	String requestID;
	Destination destination;

	@XmlJavaTypeAdapter(DialogIDXmlAdapter.class)
	public DialogID getDialogID() {
		return this.dialogID;
	}

	public SeqID getSeqID() {
		return this.seqID;
	}

	public String getGroupID() {
		return this.groupID;
	}

	public String getRequestID() {
		return this.requestID;
	}

	public Destination getDestination() {
		return this.destination;
	}

	public void setDialogID(DialogID dialogID) {
		this.dialogID = dialogID;
	}

	
	public void setSeqID(SeqID seqID) {
		this.seqID = seqID;
	}

	public void setGroupID(String groupID) {
		this.groupID = groupID;
	}

	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}

	@XmlTransient
	public String getASN1MessageType() {
		// TODO Auto-generated method stub
		return "ServiceRequest";
	}

}
