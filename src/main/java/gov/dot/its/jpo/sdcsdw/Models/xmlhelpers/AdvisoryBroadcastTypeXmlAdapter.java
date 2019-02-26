package gov.dot.its.jpo.sdcsdw.Models.xmlhelpers;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import gov.dot.its.jpo.sdcsdw.Models.AdvisoryBroadcastType;

public class AdvisoryBroadcastTypeXmlAdapter extends XmlAdapter<AdvisoryBroadcastTypeXml, AdvisoryBroadcastType> {

    @Override
    public AdvisoryBroadcastTypeXml marshal(AdvisoryBroadcastType advisoryBroadcastType) throws Exception {
        AdvisoryBroadcastTypeXml returnAdvisoryBroadcastTypeXml = new AdvisoryBroadcastTypeXml();

        switch (advisoryBroadcastType) {
        case SPAT_AGGREGATE:
            returnAdvisoryBroadcastTypeXml.setSpatAggregate("");
            break;
        case MAP:
            returnAdvisoryBroadcastTypeXml.setMap("");
            break;
        case TIM:
            returnAdvisoryBroadcastTypeXml.setTim("");
            break;
        case EV:
            returnAdvisoryBroadcastTypeXml.setEv("");
            break;
        default:
            throw new IllegalArgumentException("Invalid AdvisoryBroadcastType");
        }

        return returnAdvisoryBroadcastTypeXml;
    }

    @Override
    public AdvisoryBroadcastType unmarshal(AdvisoryBroadcastTypeXml advisoryBroadcastTypeXml) throws Exception {
        return AdvisoryBroadcastType.fromValue(advisoryBroadcastTypeXml.getAdvisoryBroadcastType());
    }

}
