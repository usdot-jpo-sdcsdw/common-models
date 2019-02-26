package gov.dot.its.jpo.sdcsdw.Models;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlJavaTypeAdapter(DialogIDXmlAdapter.class)
public enum DialogID {
	VEH_SIT_DATA("vehSitData"),
	
	DATA_SUBSCRIPTION("dataSubscription"),
	
	ADV_SIT_DATA_DEP("advSitDataDep"),
	
	ADV_SIT_DAT_DIST("advSitDatDist"),
	
	RESERVED_1("reserved1"),
	
	RESERVED_2("reserved2"),
	
	OBJ_REG("objReg"),
	
	OBJ_DISC("objDisc"),
	
	INTER_SIT_DATA_DEP("intersectionSitDataDep"),
	
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
