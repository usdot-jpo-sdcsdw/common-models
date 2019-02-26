package gov.dot.its.jpo.sdcsdw.Models;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Asn1BooleanXmlAdapter extends XmlAdapter<Asn1BooleanXml, Boolean> {

    @Override
    public Asn1BooleanXml marshal(Boolean value) throws Exception {
        Asn1BooleanXml returnAsn1BooleanXml = new Asn1BooleanXml();

        if (value) {
            returnAsn1BooleanXml.setTrue("");
        } else {
            returnAsn1BooleanXml.setFalse("");
        }

        return returnAsn1BooleanXml;
    }

    @Override
    public Boolean unmarshal(Asn1BooleanXml asn1BooleanXml) throws Exception {
        return asn1BooleanXml.getValue();
    }

}
