package gov.dot.its.jpo.sdcsdw.MessageTypes;

public class DialogID {
	private String dialogID;
	private String advSitDataDist;

	public String getAdvSitDatDist() {
		return advSitDataDist;
	}

	public void setAdvSitDatDist(String advSitDatDist) {
		this.advSitDataDist = advSitDatDist;
		this.dialogID = "advSitDataDist";
	}

	public String getDialogId() {
		return this.dialogID;
	}
}
