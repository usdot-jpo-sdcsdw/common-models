package gov.dot.its.jpo.sdcsdw.Models.xmlhelpers;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import gov.dot.its.jpo.sdcsdw.Models.DialogID;

public class DialogIDXmlAdapter extends XmlAdapter<DialogIDXml, DialogID> {

    @Override
    public DialogIDXml marshal(DialogID dialogId) throws Exception {
        DialogIDXml returnDialogIdXml = new DialogIDXml();

        switch (dialogId) {
        case VEH_SIT_DATA:
            returnDialogIdXml.setVehSitData("");
            break;
        case DATA_SUBSCRIPTION:
            returnDialogIdXml.setDataSubscription("");
            break;
        case ADV_SIT_DATA_DEP:
            returnDialogIdXml.setAdvSitDataDep("");
            break;
        case ADV_SIT_DAT_DIST:
            returnDialogIdXml.setAdvSitDatDist("");
            break;
        case RESERVED_1:
            returnDialogIdXml.setReserved1("");
            break;
        case RESERVED_2:
            returnDialogIdXml.setReserved2("");
            break;
        case OBJ_REG:
            returnDialogIdXml.setObjReg("");
            break;
        case OBJ_DISC:
            returnDialogIdXml.setObjDisc("");
            break;
        case INTER_SIT_DATA_DEP:
            returnDialogIdXml.setIntersectionSitDataDep("");
            break;
        case INTER_SIT_DATA_QUERY:
            returnDialogIdXml.setIntersectionSitDataQuery("");
            break;
        default:
            throw new IllegalArgumentException("Invalid DialogID");
        }

        return returnDialogIdXml;
    }

    @Override
    public DialogID unmarshal(DialogIDXml dialogIdXml) throws Exception {
        return DialogID.fromValue(dialogIdXml.getDialogId());
    }

}
