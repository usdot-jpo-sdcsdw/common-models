package gov.dot.its.jpo.sdcsdw.MessageTypes;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "AsdmDetails", propOrder = { "asdmID", "asdmType", "distType", "startTime", "stopTime", "advisoryMessage" })
public class AsdmDetails {
	private String asdmID;

	private StartTime startTime;

	private AsdmType asdmType;

	private String distType;

	private StopTime stopTime;

	private String advisoryMessage;

	public String getAsdmID() {
		return asdmID;
	}

	public void setAsdmID(String asdmID) {
		this.asdmID = asdmID;
	}

	public StartTime getStartTime() {
		return startTime;
	}

	public void setStartTime(StartTime startTime) {
		this.startTime = startTime;
	}

	public AsdmType getAsdmType() {
		return asdmType;
	}

	public void setAsdmType(AsdmType asdmType) {
		this.asdmType = asdmType;
	}

	public String getDistType() {
		return distType;
	}

	public void setDistType(String distType) {
		this.distType = distType;
	}

	public StopTime getStopTime() {
		return stopTime;
	}

	public void setStopTime(StopTime stopTime) {
		this.stopTime = stopTime;
	}

	public String getAdvisoryMessage() {
		return advisoryMessage;
	}

	public void setAdvisoryMessage(String advisoryMessage) {
		this.advisoryMessage = advisoryMessage;
	}
}
