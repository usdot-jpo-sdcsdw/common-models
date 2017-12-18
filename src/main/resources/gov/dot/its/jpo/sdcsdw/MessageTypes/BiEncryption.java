package gov.dot.its.jpo.sdcsdw.MessageTypes;

public class BiEncryption {
	private String encryptionFlag;
	private String falseFlag;
	private String trueFlag;
	
	public String getFalse() {
		return falseFlag;
	}

	public void setFalse(String falseFlag) {
		this.falseFlag = falseFlag;
		this.encryptionFlag = "false";
	}

	public String getTrue() {
		return trueFlag;
	}

	public void setTrue(String trueFlag) {
		this.trueFlag = trueFlag;
		this.encryptionFlag = "true";
	}
}
