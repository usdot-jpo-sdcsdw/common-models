package gov.dot.its.jpo.sdcsdw.Models;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.fasterxml.jackson.annotation.JsonIgnore;

@XmlRootElement(name = "AdvisorySituationData")
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(propOrder = { "dialogID", "seqID", "groupID", "requestID", "timeToLive", "serviceRegion", "asdmDetails"})
public class AdvisorySituationData extends DialogMessage {
	private DialogID dialogID;

	private String groupID;

	private String requestID;

	private ServiceRegion serviceRegion;

	private SeqID seqID;

	private AsdmDetails asdmDetails;

	private TimeToLive timeToLive;
	
	public DialogID getDialogID() {
		return this.dialogID;
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

	public ServiceRegion getServiceRegion() {
		return serviceRegion;
	}

	public void setServiceRegion(ServiceRegion serviceRegion) {
		this.serviceRegion = serviceRegion;
	}

	public SeqID getSeqID() {
		return seqID;
	}

	public void setSeqID(SeqID seqID) {
		this.seqID = seqID;
	}

	public AsdmDetails getAsdmDetails() {
		return asdmDetails;
	}

	public void setAsdmDetails(AsdmDetails asdmDetails) {
		this.asdmDetails = asdmDetails;
	}

	public TimeToLive getTimeToLive() {
		return timeToLive;
	}

	public void setTimeToLive(TimeToLive timeToLive) {
		this.timeToLive = timeToLive;
	}

	@Override
	@JsonIgnore
	@XmlTransient
	public String getASN1MessageType() {
		// TODO Auto-generated method stub
		return "AdvisorySituationData";
	}
}
