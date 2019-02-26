package gov.dot.its.jpo.sdcsdw.Models;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.fasterxml.jackson.annotation.JsonProperty;

import gov.dot.its.jpo.sdcsdw.Models.xmlhelpers.DialogIDXmlAdapter;

@XmlJavaTypeAdapter(DialogIDXmlAdapter.class)
public enum DialogID {
	@JsonProperty("vehSitData")
	VEH_SIT_DATA("vehSitData", 154),
	
	@JsonProperty("dataSubscription")
	DATA_SUBSCRIPTION("dataSubscription", 155),
	
	@JsonProperty("advSitDataDep")
	ADV_SIT_DATA_DEP("advSitDataDep", 156),
	
	@JsonProperty("advSitDatDist")
	ADV_SIT_DAT_DIST("advSitDatDist", 157),
	
	@JsonProperty("reserved1")
	RESERVED_1("reserved1", 158),
	
	@JsonProperty("reserved2")
	RESERVED_2("reserved2", 159),
	
	@JsonProperty("objReg")
	OBJ_REG("objReg", 160),
	
	@JsonProperty("objDisc")
	OBJ_DISC("objDisc", 161),
	
	@JsonProperty("intersectionSitDataDep")
	INTER_SIT_DATA_DEP("intersectionSitDataDep", 162),
	
	@JsonProperty("intersectionSitDataQuery")
	INTER_SIT_DATA_QUERY("intersectionSitDataQuery", 163);
	
	private final String stringValue;
	private final int intValue;
	
	DialogID(String stringValue, int intValue) {
		this.stringValue = stringValue;
		this.intValue = intValue;
	}
	
	public String getString() {
		return this.stringValue;
	}
	
	public int getInt() {
	    return this.intValue;
	}
	
	
	public static DialogID fromValue(String val) {
		for (DialogID dialogId : DialogID.values()) {
			if (dialogId.stringValue.equals(val)) {
				return dialogId;
			}
		}
		throw new IllegalArgumentException(val);
	}
	
	public static DialogID fromValue(int val) {
        for (DialogID dialogId : DialogID.values()) {
            if (dialogId.intValue == val) {
                return dialogId;
            }
        }
        throw new IllegalArgumentException(Integer.toString(val));
    }
}
