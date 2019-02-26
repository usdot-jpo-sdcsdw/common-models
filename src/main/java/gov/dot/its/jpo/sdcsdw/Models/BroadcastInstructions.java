package gov.dot.its.jpo.sdcsdw.Models;

import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlType(propOrder = { "biType", "biPriority", "biDeliveryStart", "biDeliveryStop",
		"biSignature", "biEncryption", "dsrcInst" })
public class BroadcastInstructions {
	private DsrcInst dsrcInst;

	private AdvisoryBroadcastType biType;

	private BiDeliveryStart biDeliveryStart;

	private BiDeliveryStop biDeliveryStop;

	private String biPriority;

	private Boolean biEncryption;

	private Boolean biSignature;

	public DsrcInst getDsrcInst() {
		return dsrcInst;
	}

	public void setDsrcInst(DsrcInst dsrcInst) {
		this.dsrcInst = dsrcInst;
	}

	public AdvisoryBroadcastType getBiType() {
		return biType;
	}

	public void setBiType(AdvisoryBroadcastType biType) {
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

    @XmlJavaTypeAdapter(Asn1BooleanXmlAdapter.class)
	public Boolean getBiEncryption() {
		return biEncryption;
	}

	public void setBiEncryption(Boolean biEncryption) {
		this.biEncryption = biEncryption;
	}

	@XmlJavaTypeAdapter(Asn1BooleanXmlAdapter.class)
	public Boolean getBiSignature() {
		return biSignature;
	}

	public void setBiSignature(Boolean biSignature) {
		this.biSignature = biSignature;
	}
}
