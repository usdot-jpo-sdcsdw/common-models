package gov.dot.its.jpo.sdcsdw.Models;

public class BiType {
	private String tim;

	public String getTim() {
		return tim;
	}

	public void setTim(String tim) {
		this.tim = tim;
	}

	public void setValuesFromStartTimeObject(AsdmType type) {
		this.setTim(type.getTim());
	}
}
