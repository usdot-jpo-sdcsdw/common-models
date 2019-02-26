package gov.dot.its.jpo.sdcsdw.Models;

import java.util.List;

import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

public class AdvisorySituationDataDistributionList extends DialogMessage{

	
	private String requestID;
	
	public AdvisorySituationDataDistributionList(List<AdvisorySituationDataDistribution> distributionList) {
		// TODO Auto-generated constructor stub
		this.distributionList=distributionList;
	}
	
	public List<AdvisorySituationDataDistribution> getDistributionList(){
		return this.distributionList;
	}
	
	public void setRequestID(String requestID) {
		this.requestID=requestID;
	}
	@Override
	public String getRequestID() {
		// TODO Auto-generated method stub
		return requestID;
	}

	@Override
	public SemiSequenceID getSeqID() {
		// TODO Auto-generated method stub
		return null;
	}

	public DialogID getDialogID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getGroupID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@XmlTransient
	public String getASN1MessageType() {
		// TODO Auto-generated method stub
		return "AdvisorySituationDataDistributionList";
	}
	
	private List<AdvisorySituationDataDistribution> distributionList;

}
