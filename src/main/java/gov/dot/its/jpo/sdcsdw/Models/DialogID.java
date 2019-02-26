package gov.dot.its.jpo.sdcsdw.Models;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "dialogID")
@XmlEnum(String.class)
public enum DialogID {
	@XmlEnumValue("vehSitData")
	VEH_SIT_DATA("vehSitData"),
	
	@XmlEnumValue("dataSubscription")
	DATA_SUBSCRIPTION("dataSubscription"),
	
	@XmlEnumValue("advSitDataDep")
	ADV_SIT_DATA_DEP("advSitDataDep"),
	
	@XmlEnumValue("advSitDatDist")
	ADV_SIT_DAT_DIST("advSitDatDist"),
	
	@XmlEnumValue("reserved1")
	RESERVED_1("reserved1"),
	
	@XmlEnumValue("reserved2")
	RESERVED_2("reserved2"),
	
	@XmlEnumValue("objReg")
	OBJ_REG("objReg"),
	
	@XmlEnumValue("objDisc")
	OBJ_DISC("objDisc"),
	
	@XmlEnumValue("intersectionSitDataDep")
	INTER_SIT_DATA_DEP("intersectionSitDataDep"),
	
	@XmlEnumValue("intersectionSitDataQuery")
	INTER_SIT_DATA_QUERY("intersectionSitDataQuery");
	
	private final String value;
	
	DialogID(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}
	
	public static DialogID fromValue(String val) {
		for (DialogID dialogId : DialogID.values()) {
			if (dialogId.value.equals(val)) {
				return dialogId;
			}
		}
		throw new IllegalArgumentException(val);
	}
}
