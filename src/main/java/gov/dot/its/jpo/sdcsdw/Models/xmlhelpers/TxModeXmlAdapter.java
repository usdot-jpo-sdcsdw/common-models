package gov.dot.its.jpo.sdcsdw.Models.xmlhelpers;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import gov.dot.its.jpo.sdcsdw.Models.TxMode;

public class TxModeXmlAdapter extends XmlAdapter<TxModeXml, TxMode>{
    @Override
    public TxModeXml marshal(TxMode dialogId) throws Exception {
        TxModeXml returnTxModeXml = new TxModeXml();

        switch (dialogId) {
        case ALTERNATING:
            returnTxModeXml.setAlternating("");
            break;
        case CONTINUOUS:
            returnTxModeXml.setContinuous("");
            break;
        default:
            throw new IllegalArgumentException("Invalid TxMode");
        }

        return returnTxModeXml;
    }

    @Override
    public TxMode unmarshal(TxModeXml txModeXml) throws Exception {
        return TxMode.fromValue(txModeXml.getTxMode());
    }

    
}
