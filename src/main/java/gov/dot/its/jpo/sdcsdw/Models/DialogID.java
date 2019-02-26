package gov.dot.its.jpo.sdcsdw.Models;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.fasterxml.jackson.annotation.JsonProperty;

@XmlJavaTypeAdapter(DialogIDXmlAdapter.class)
public enum DialogID {
	@JsonProperty("vehSitData")
	VEH_SIT_DATA("vehSitData"),
	
	@JsonProperty("dataSubscription")
	DATA_SUBSCRIPTION("dataSubscription"),
	
	@JsonProperty("advSitDataDep")
	ADV_SIT_DATA_DEP("advSitDataDep"),
	
	@JsonProperty("advSitDatDist")
	ADV_SIT_DAT_DIST("advSitDatDist"),
	
	@JsonProperty("reserved1")
	RESERVED_1("reserved1"),
	
	@JsonProperty("reserved2")
	RESERVED_2("reserved2"),
	
	@JsonProperty("objReg")
	OBJ_REG("objReg"),
	
	@JsonProperty("objDisc")
	OBJ_DISC("objDisc"),
	
	@JsonProperty("intersectionSitDataDep")
	INTER_SIT_DATA_DEP("intersectionSitDataDep"),
	
	@JsonProperty("intersectionSitDataQuery")
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
