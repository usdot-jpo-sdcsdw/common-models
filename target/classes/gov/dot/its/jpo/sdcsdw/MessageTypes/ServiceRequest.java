package gov.dot.its.jpo.sdcsdw.MessageTypes;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "ServiceRequest")
@XmlType(propOrder = { "dialogID", "seqID", "groupID", "requestID", "destination" })
public class ServiceRequest extends DialogMessage {
	DialogID dialogID;
	SeqID seqID;
	String groupID;
	String requestID;
	Destination destination;

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

	@XmlElement
	public void setDialogID(DialogID dialogID) {
		this.dialogID = dialogID;
	}

	@XmlElement
	public void setSeqID(SeqID seqID) {
		this.seqID = seqID;
	}

	@XmlElement
	public void setGroupID(String groupID) {
		this.groupID = groupID;
	}

	@XmlElement
	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}

	@XmlElement
	public void setDestination(Destination destination) {
		this.destination = destination;
	}

	public String getASN1MessageType() {
		// TODO Auto-generated method stub
		return "ServiceRequest";
	}

}
