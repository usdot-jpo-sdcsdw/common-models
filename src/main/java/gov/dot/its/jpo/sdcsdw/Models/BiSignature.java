package gov.dot.its.jpo.sdcsdw.Models;

public class BiSignature {
	private String trueFlag;
	private String falseFlag;
	private String signitureBool;

	public String getFalse() {
		return falseFlag;
	}

	public void setFalse(String falseFlag) {
		this.falseFlag = falseFlag;
		this.signitureBool = "false";
	}

	public String getTrue() {
		return trueFlag;
	}

	public void setTrue(String trueFlag) {
		this.trueFlag = trueFlag;
		this.signitureBool = "true";
	}

	public String getSignitureBool() {
		return this.signitureBool;
	}
}
