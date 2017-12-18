package gov.dot.its.jpo.sdcsdw.MessageTypes;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "AdvisorySituationDataDistribution")
@XmlType(name = "", propOrder = { "dialogID", "seqID", "groupID", "requestID", "recordCount", "bundleCount",
		"asdBundles" })
public class AdvisorySituationDataDistribution extends DialogMessage {
	private String recordCount;

	private DialogID dialogID;

	private String groupID;

	private String requestID;

	private SeqID seqID;

	private String bundleCount;

	private AsdBundles asdBundles;

	@XmlElement
	public String getRecordCount() {
		return recordCount;
	}

	public void setRecordCount(String recordCount) {
		this.recordCount = recordCount;
	}

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
	public SeqID getSeqID() {
		return seqID;
	}

	public void setSeqID(SeqID seqID) {
		this.seqID = seqID;
	}

	@XmlElement
	public String getBundleCount() {
		return bundleCount;
	}

	public void setBundleCount(String bundleCount) {
		this.bundleCount = bundleCount;
	}

	@XmlElement
	public AsdBundles getAsdBundles() {
		return asdBundles;
	}

	public void setAsdBundles(AsdBundles asdBundles) {
		this.asdBundles = asdBundles;
	}

	public String getASN1MessageType() {
		// TODO Auto-generated method stub
		return "AdvisorySituationDataDistribution";
	}
}