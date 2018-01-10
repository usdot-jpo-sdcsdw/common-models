package gov.dot.its.jpo.sdcsdw.Models;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "BroadcastInst", propOrder = { "biType", "biPriority", "biDeliveryStart", "biDeliveryStop",
		"biSignature", "biEncryption", "dsrcInst" })
public class BroadcastInst {
	private DsrcInst dsrcInst;

	private BiType biType;

	private BiDeliveryStart biDeliveryStart;

	private BiDeliveryStop biDeliveryStop;

	private String biPriority;

	private BiEncryption biEncryption;

	private BiSignature biSignature;

	public DsrcInst getDsrcInst() {
		return dsrcInst;
	}

	public void setDsrcInst(DsrcInst dsrcInst) {
		this.dsrcInst = dsrcInst;
	}

	public BiType getBiType() {
		return biType;
	}

	public void setBiType(BiType biType) {
		this.biType = biType;
	}

	public BiDeliveryStart getBiDeliveryStart() {
		return biDeliveryStart;
	}

	public void setBiDeliveryStart(BiDeliveryStart biDeliveryStart) {
		this.biDeliveryStart = biDeliveryStart;
	}

	public BiDeliveryStop getBiDeliveryStop() {
		return biDeliveryStop;
	}

	public void setBiDeliveryStop(BiDeliveryStop biDeliveryStop) {
		this.biDeliveryStop = biDeliveryStop;
	}

	public String getBiPriority() {
		return biPriority;
	}

	public void setBiPriority(String biPriority) {
		this.biPriority = biPriority;
	}

	public BiEncryption getBiEncryption() {
		return biEncryption;
	}

	public void setBiEncryption(BiEncryption biEncryption) {
		this.biEncryption = biEncryption;
	}

	public BiSignature getBiSignature() {
		return biSignature;
	}

	public void setBiSignature(BiSignature biSignature) {
		this.biSignature = biSignature;
	}
}
