package gov.dot.its.jpo.sdcsdw.Models;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "AdvisorySituationBundle", propOrder = { "bundleNumber", "bundleId", "asdRecords" })
public class AdvisorySituationBundle {
	private AsdRecords asdRecords;

	private String bundleNumber;

	private String bundleId;

	public AsdRecords getAsdRecords() {
		return asdRecords;
	}

	public void setAsdRecords(AsdRecords asdRecords) {
		this.asdRecords = asdRecords;
	}

	public String getBundleNumber() {
		return bundleNumber;
	}

	public void setBundleNumber(String bundleNumber) {
		this.bundleNumber = bundleNumber;
	}

	public String getBundleId() {
		return bundleId;
	}

	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

}
