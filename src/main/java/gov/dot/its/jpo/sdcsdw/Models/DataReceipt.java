package gov.dot.its.jpo.sdcsdw.Models;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import gov.dot.its.jpo.sdcsdw.Models.xmlhelpers.SemiSequenceIDXml;

@XmlRootElement(name = "DataReceipt")
@XmlType(propOrder = { "dialogID", "seqID", "groupID", "requestID" })
public class DataReceipt extends DialogMessage {

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
	public SemiSequenceID getSeqID() {
		return seqID;
	}

	public void setSeqID(SemiSequenceID seqID) {
		this.seqID = seqID;
	}

	private DialogID dialogID;
	private String groupID;
	private String requestID;
	private SemiSequenceID seqID;
	
	@XmlTransient
	public String getASN1MessageType() {
		// TODO Auto-generated method stub
		return "DataReceipt";
	}
}
