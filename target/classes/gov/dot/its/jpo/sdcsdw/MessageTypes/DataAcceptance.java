package gov.dot.its.jpo.sdcsdw.MessageTypes;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "DataAcceptance")
@XmlType(propOrder = { "dialogID", "seqID", "groupID", "requestID" })
public class DataAcceptance extends DialogMessage{
	private DialogID dialogID;

	private String groupID;

	private String requestID;

	private SeqID seqID;

	public DialogID getDialogID() {
		return dialogID;
	}

	public void setDialogID(DialogID dialogID) {
		this.dialogID = dialogID;
	}

	public String getGroupID() {
		return groupID;
	}

	public void setGroupID(String groupID) {
		this.groupID = groupID;
	}

	public String getRequestID() {
		return requestID;
	}

	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}

	public SeqID getSeqID() {
		return seqID;
	}

	public void setSeqID(SeqID seqID) {
		this.seqID = seqID;
	}

	public String getASN1MessageType() {
		// TODO Auto-generated method stub
		return "DataAcceptance";
	}
}
