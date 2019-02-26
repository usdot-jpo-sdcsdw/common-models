package gov.dot.its.jpo.sdcsdw.Models.xmlhelpers;

import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.fasterxml.jackson.annotation.JsonIgnore;

import gov.dot.its.jpo.sdcsdw.Models.DialogID;
import gov.dot.its.jpo.sdcsdw.Models.SemiSequenceID;

public class SemiSequenceIDXmlAdapter extends XmlAdapter<SemiSequenceIDXml, SemiSequenceID>{
    @Override
    public SemiSequenceIDXml marshal(SemiSequenceID semiSequenceID) throws Exception {
        SemiSequenceIDXml returnSemiSequenceIDXml = new SemiSequenceIDXml();

        switch (semiSequenceID) {
        case SVC_REQ:
            returnSemiSequenceIDXml.setSvcReq("");
            break;
        case SVC_RESP:
            returnSemiSequenceIDXml.setSvcResp("");
            break;
        case DATA_REQ:
            returnSemiSequenceIDXml.setDataReq("");
            break;
        case DATA_CONF:
            returnSemiSequenceIDXml.setDataConf("");
            break;
        case DATA:
            returnSemiSequenceIDXml.setData("");
            break;
        case ACCEPT:
            returnSemiSequenceIDXml.setAccept("");
            break;
        case RECEIPT:
            returnSemiSequenceIDXml.setReceipt("");
            break;
        case SUBSCRIPTION_REQ:
            returnSemiSequenceIDXml.setSubscriptionReq("");
            break;
        case SUBSCRIPTINO_RESP:
            returnSemiSequenceIDXml.setSubscriptinoResp("");
            break;
        case SUBSCRIPTION_CANCEL:
            returnSemiSequenceIDXml.setSubscriptionCancel("");
            break;
        default:
            throw new IllegalArgumentException("Invalid SemiSequenceID");
        }

        return returnSemiSequenceIDXml;
    }

    @Override
    public SemiSequenceID unmarshal(SemiSequenceIDXml semiSequenceIDXml) throws Exception {
        return SemiSequenceID.fromValue(semiSequenceIDXml.getSemiSequenceID());
    }

    
}
