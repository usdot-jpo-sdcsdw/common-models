package gov.dot.its.jpo.sdcsdw.Models;

import javax.xml.bind.annotation.XmlType;

import gov.dot.its.jpo.sdcsdw.Models.xmlhelpers.TxChannelXml;
import gov.dot.its.jpo.sdcsdw.Models.xmlhelpers.TxModeXml;

@XmlType(name = "DsrcInst", propOrder = { "biTxMode", "biTxChannel", "biTxInterval" })
public class DsrcInstructions {
	private String biTxInterval;

	private TxMode biTxMode;

	private TxChannel biTxChannel;

	public String getBiTxInterval() {
		return biTxInterval;
	}

	public void setBiTxInterval(String biTxInterval) {
		this.biTxInterval = biTxInterval;
	}

	public TxMode getBiTxMode() {
		return biTxMode;
	}

	public void setBiTxMode(TxMode biTxMode) {
		this.biTxMode = biTxMode;
	}

	public TxChannel getBiTxChannel() {
		return biTxChannel;
	}

	public void setBiTxChannel(TxChannel biTxChannel) {
		this.biTxChannel = biTxChannel;
	}

}
