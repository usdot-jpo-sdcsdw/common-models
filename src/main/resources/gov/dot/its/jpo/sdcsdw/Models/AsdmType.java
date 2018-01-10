package gov.dot.its.jpo.sdcsdw.Models;


public class AsdmType{
	private String tim;

	public String getTim() {
		return tim;
	}

	public void setTim(String tim) {
		this.tim = tim;
	}
	
	public void setValuesFromAbstract(BiType type) {
		this.setTim(type.getTim());
	}
}
