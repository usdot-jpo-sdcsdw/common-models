package gov.dot.its.jpo.sdcsdw.Models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.fasterxml.jackson.annotation.JsonIgnore;

@XmlRootElement(name = "AdvisorySituationDataDistribution")
@XmlAccessorType(XmlAccessType.PROPERTY)
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

	
	public String getRecordCount() {
		return recordCount;
	}

	public void setRecordCount(String recordCount) {
		this.recordCount = recordCount;
	}

	@XmlJavaTypeAdapter(DialogIDXmlAdapter.class)
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

	
	public String getBundleCount() {
		return bundleCount;
	}

	public void setBundleCount(String bundleCount) {
		this.bundleCount = bundleCount;
	}


	public AsdBundles getAsdBundles() {
		return asdBundles;
	}

	public void setAsdBundles(AsdBundles asdBundles) {
		this.asdBundles = asdBundles;
	}

	@JsonIgnore
	@XmlTransient
	public String getASN1MessageType() {
		// TODO Auto-generated method stub
		return "AdvisorySituationDataDistribution";
	}
}