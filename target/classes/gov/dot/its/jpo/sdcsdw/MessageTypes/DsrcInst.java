package gov.dot.its.jpo.sdcsdw.MessageTypes;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "DsrcInst", propOrder = { "biTxMode", "biTxChannel", "biTxInterval" })
public class DsrcInst {
	private String biTxInterval;

	private BiTxMode biTxMode;

	private BiTxChannel biTxChannel;

	public String getBiTxInterval() {
		return biTxInterval;
	}

	public void setBiTxInterval(String biTxInterval) {
		this.biTxInterval = biTxInterval;
	}

	public BiTxMode getBiTxMode() {
		return biTxMode;
	}

	public void setBiTxMode(BiTxMode biTxMode) {
		this.biTxMode = biTxMode;
	}

	public BiTxChannel getBiTxChannel() {
		return biTxChannel;
	}

	public void setBiTxChannel(BiTxChannel biTxChannel) {
		this.biTxChannel = biTxChannel;
	}

}
