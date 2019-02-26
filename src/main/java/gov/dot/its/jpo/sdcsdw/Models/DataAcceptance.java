package gov.dot.its.jpo.sdcsdw.Models;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(name = "DataAcceptance")
@XmlType(propOrder = { "dialogID", "seqID", "groupID", "requestID" })
public class DataAcceptance extends DialogMessage{
	private DialogID dialogID;

	private String groupID;

	private String requestID;

	private SemiSequenceID seqID;

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

	public SemiSequenceID getSeqID() {
		return seqID;
	}

	public void setSeqID(SemiSequenceID seqID) {
		this.seqID = seqID;
	}

	@XmlTransient
	public String getASN1MessageType() {
		// TODO Auto-generated method stub
		return "DataAcceptance";
	}
}
