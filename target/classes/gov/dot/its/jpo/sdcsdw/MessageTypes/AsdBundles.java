package gov.dot.its.jpo.sdcsdw.MessageTypes;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "asdBundles")
public class AsdBundles {
	
	
	private AdvisorySituationBundle[] AdvisorySituationBundle;

	@XmlElement(name="AdvisorySituationBundle")
	public AdvisorySituationBundle[] getAdvisorySituationBundle() {
		return AdvisorySituationBundle;
	}

	public void setAdvisorySituationBundle(AdvisorySituationBundle[] AdvisorySituationBundle) {
		this.AdvisorySituationBundle = AdvisorySituationBundle;
	}

}
