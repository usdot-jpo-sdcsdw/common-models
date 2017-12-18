package gov.dot.its.jpo.sdcsdw.MessageTypes;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "asdRecords")
public class AsdRecords {
	private AdvisoryBroadcast[] AdvisoryBroadcast;

	@XmlElement(name="AdvisoryBroadcast")
	public AdvisoryBroadcast[] getAdvisoryBroadcast() {
		return AdvisoryBroadcast;
	}

	public void setAdvisoryBroadcast(AdvisoryBroadcast[] AdvisoryBroadcast) {
		this.AdvisoryBroadcast = AdvisoryBroadcast;
	}
}
