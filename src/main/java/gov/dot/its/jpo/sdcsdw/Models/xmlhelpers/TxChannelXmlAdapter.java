package gov.dot.its.jpo.sdcsdw.Models.xmlhelpers;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import gov.dot.its.jpo.sdcsdw.Models.TxChannel;

public class TxChannelXmlAdapter extends XmlAdapter<TxChannelXml, TxChannel>{
    @Override
    public TxChannelXml marshal(TxChannel dialogId) throws Exception {
        TxChannelXml returnTxChannelXml = new TxChannelXml();

        switch (dialogId) {
        case CH_CONTROL:
            returnTxChannelXml.setChControl("");
            break;
        case CH_SERVICE:
            returnTxChannelXml.setChService("");
            break;
        case CH_172:
            returnTxChannelXml.setCh172("");
            break;
        case CH_174:
            returnTxChannelXml.setCh174("");
            break;
        case CH_176:
            returnTxChannelXml.setCh176("");
            break;
        case CH_178:
            returnTxChannelXml.setCh178("");
            break;
        case CH_180:
            returnTxChannelXml.setCh180("");
            break;
        case CH_182:
            returnTxChannelXml.setCh182("");
            break;
        case CH_184:
            returnTxChannelXml.setCh184("");
            break;
        default:
            throw new IllegalArgumentException("Invalid TxChannel");
        }

        return returnTxChannelXml;
    }

    @Override
    public TxChannel unmarshal(TxChannelXml txChannelXml) throws Exception {
        return TxChannel.fromValue(txChannelXml.getTxChannel());
    }

    
}
