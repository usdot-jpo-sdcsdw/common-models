package gov.dot.its.jpo.sdcsdw.Models;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.fasterxml.jackson.annotation.JsonValue;

import gov.dot.its.jpo.sdcsdw.Models.xmlhelpers.DialogIDXmlAdapter;

@XmlJavaTypeAdapter(DialogIDXmlAdapter.class)
public enum DialogID {
	
    VEH_SIT_DATA("vehSitData", 154),
	DATA_SUBSCRIPTION("dataSubscription", 155),
	ADV_SIT_DATA_DEP("advSitDataDep", 156),
	ADV_SIT_DAT_DIST("advSitDatDist", 157),
	RESERVED_1("reserved1", 158),
	RESERVED_2("reserved2", 159),
	OBJ_REG("objReg", 160),
	OBJ_DISC("objDisc", 161),
	INTER_SIT_DATA_DEP("intersectionSitDataDep", 162),
	INTER_SIT_DATA_QUERY("intersectionSitDataQuery", 163);
	
	private final String stringValue;
	private final int intValue;
	
	DialogID(String stringValue, int intValue) {
		this.stringValue = stringValue;
		this.intValue = intValue;
	}
	
	@JsonValue
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
