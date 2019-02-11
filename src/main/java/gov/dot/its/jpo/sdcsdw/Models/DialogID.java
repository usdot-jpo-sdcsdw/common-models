package gov.dot.its.jpo.sdcsdw.Models;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "DialogID")
@XmlType(propOrder = { "dialogId", "vehSitData", "dataSubscription", "advSitDatDep", "advSitDatDist", "reserved1",
						"reserved2", "objReg", "objDisc", "intersectionSitDataDep", "intersectionSitDataQuery"})
public class DialogID {
	@XmlElement
	private String dialogId;
	
	private String vehSitData;
	private String dataSubscription;
	private String advSitDatDep;
	private String advSitDatDist;
	private String reserved1;
	private String reserved2;
	private String objReg;
	private String objDisc;
	private String intersectionSitDataDep;
	private String intersectionSitDataQuery;

	public String getDialogId() {
		return this.dialogId;
	}
	
	public String getVehSitData() {
		return vehSitData;
	}

	public void setVehSitData(String vehSitData) {
		this.dialogId = "vehSitData";
		
		this.vehSitData = vehSitData;
		this.dataSubscription = null;
		this.advSitDatDep = null;
		this.advSitDatDist = null;
		this.reserved1 = null;
		this.reserved2 = null;
		this.objReg = null;
		this.objDisc = null;
		this.intersectionSitDataDep = null;
		this.intersectionSitDataQuery = null;
	}

	public String getDataSubscription() {
		return dataSubscription;
	}

	public void setDataSubscription(String dataSubscription) {
		this.dialogId = "dataSubscription";
		
		this.vehSitData = null;
		this.dataSubscription = dataSubscription;
		this.advSitDatDep = null;
		this.advSitDatDist = null;
		this.reserved1 = null;
		this.reserved2 = null;
		this.objReg = null;
		this.objDisc = null;
		this.intersectionSitDataDep = null;
		this.intersectionSitDataQuery = null;
	}

	public String getAdvSitDatDep() {
		return advSitDatDep;
	}

	public void setAdvSitDatDep(String advSitDataDep) {
		this.dialogId = "advSitDataDep";
		
		this.vehSitData = null;
		this.dataSubscription = null;
		this.advSitDatDep = advSitDataDep;
		this.advSitDatDist = null;
		this.reserved1 = null;
		this.reserved2 = null;
		this.objReg = null;
		this.objDisc = null;
		this.intersectionSitDataDep = null;
		this.intersectionSitDataQuery = null;
	}

	public String getAdvSitDatDist() {
		return advSitDatDist;
	}

	public void setAdvSitDatDist(String advSitDatDist) {
		this.dialogId = "advSitDataDist";
		
		this.vehSitData = null;
		this.dataSubscription = null;
		this.advSitDatDep = null;
		this.advSitDatDist = advSitDatDist;
		this.reserved1 = null;
		this.reserved2 = null;
		this.objReg = null;
		this.objDisc = null;
		this.intersectionSitDataDep = null;
		this.intersectionSitDataQuery = null;
	}
	
	public String getReserved1() {
		return reserved1;
	}

	public void setReserved1(String reserved1) {
		this.dialogId = "reserved1";
		
		this.vehSitData = null;
		this.dataSubscription = null;
		this.advSitDatDep = null;
		this.advSitDatDist = null;
		this.reserved1 = reserved1;
		this.reserved2 = null;
		this.objReg = null;
		this.objDisc = null;
		this.intersectionSitDataDep = null;
		this.intersectionSitDataQuery = null;
	}

	public String getReserved2() {
		return reserved2;
	}

	public void setReserved2(String reserved2) {
		this.dialogId = "reserved2";
		
		this.vehSitData = null;
		this.dataSubscription = null;
		this.advSitDatDep = null;
		this.advSitDatDist = null;
		this.reserved1 = null;
		this.reserved2 = reserved2;
		this.objReg = null;
		this.objDisc = null;
		this.intersectionSitDataDep = null;
		this.intersectionSitDataQuery = null;
	}

	public String getObjReg() {
		return objReg;
	}

	public void setObjReg(String objReg) {
		this.dialogId = "objReg";
		
		this.vehSitData = null;
		this.dataSubscription = null;
		this.advSitDatDep = null;
		this.advSitDatDist = null;
		this.reserved1 = null;
		this.reserved2 = null;
		this.objReg = objReg;
		this.objDisc = null;
		this.intersectionSitDataDep = null;
		this.intersectionSitDataQuery = null;
	}

	public String getObjDisc() {
		return objDisc;
	}

	public void setObjDisc(String objDisc) {
		this.dialogId = "objDisc";
		
		this.vehSitData = null;
		this.dataSubscription = null;
		this.advSitDatDep = null;
		this.advSitDatDist = null;
		this.reserved1 = null;
		this.reserved2 = null;
		this.objReg = null;
		this.objDisc = objDisc;
		this.intersectionSitDataDep = null;
		this.intersectionSitDataQuery = null;
	}

	public String getIntersectionSitDataDep() {
		return intersectionSitDataDep;
	}

	public void setIntersectionSitDataDep(String intersectionSitDataDep) {
		this.dialogId = "intersectionSitDataDep";
		
		this.vehSitData = null;
		this.dataSubscription = null;
		this.advSitDatDep = null;
		this.advSitDatDist = null;
		this.reserved1 = null;
		this.reserved2 = null;
		this.objReg = null;
		this.objDisc = null;
		this.intersectionSitDataDep = intersectionSitDataDep;
		this.intersectionSitDataQuery = null;
	}

	public String getIntersectionSitDataQuery() {
		return intersectionSitDataQuery;
	}

	public void setIntersectionSitDataQuery(String intersectionSitDataQuery) {
		this.dialogId = "intersectionSitDataQuery";
		
		this.vehSitData = null;
		this.dataSubscription = null;
		this.advSitDatDep = null;
		this.advSitDatDist = null;
		this.reserved1 = null;
		this.reserved2 = null;
		this.objReg = null;
		this.objDisc = null;
		this.intersectionSitDataDep = null;
		this.intersectionSitDataQuery = intersectionSitDataQuery;
	}

	
}
