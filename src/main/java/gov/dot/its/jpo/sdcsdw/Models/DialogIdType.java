package gov.dot.its.jpo.sdcsdw.Models;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "dialog-id-type")
@XmlEnum
public enum DialogIdType {
	@XmlEnumValue("vehSitData")
	VEH_SIT_DATA("vehSitData"),
	
	@XmlEnumValue("dataSubscription")
	DATA_SUBSCRIPTION("dataSubscription"),
	
	@XmlEnumValue("advSitDatDep")
	ADV_SIT_DAT_DEP("advSitDatDep"),
	
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
	
	DialogIdType(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}
	
	public static DialogIdType fromValue(String val) {
		for (DialogIdType dialogId : DialogIdType.values()) {
			if (dialogId.value.equals(val)) {
				return dialogId;
			}
		}
		throw new IllegalArgumentException(val);
	}
}
