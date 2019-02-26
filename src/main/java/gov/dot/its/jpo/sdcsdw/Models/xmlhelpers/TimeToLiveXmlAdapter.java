package gov.dot.its.jpo.sdcsdw.Models.xmlhelpers;

import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.fasterxml.jackson.annotation.JsonIgnore;

import gov.dot.its.jpo.sdcsdw.Models.DialogID;
import gov.dot.its.jpo.sdcsdw.Models.SemiSequenceID;
import gov.dot.its.jpo.sdcsdw.Models.TimeToLive;

public class TimeToLiveXmlAdapter extends XmlAdapter<TimeToLiveXml, TimeToLive>{
    @Override
    public TimeToLiveXml marshal(TimeToLive dialogId) throws Exception {
        TimeToLiveXml returnTimeToLiveXml = new TimeToLiveXml();

        switch (dialogId) {
        case MINUTE:
            returnTimeToLiveXml.setMinute("");
            break;
        case HALF_HOUR:
            returnTimeToLiveXml.setHalfHour("");
            break;
        case DAY:
            returnTimeToLiveXml.setDay("");
            break;
        case WEEK:
            returnTimeToLiveXml.setWeek("");
            break;
        case MONTH:
            returnTimeToLiveXml.setMonth("");
            break;
        case YEAR:
            returnTimeToLiveXml.setYear("");
            break;
        default:
            throw new IllegalArgumentException("Invalid TimeToLive");
        }

        return returnTimeToLiveXml;
    }

    @Override
    public TimeToLive unmarshal(TimeToLiveXml timeToLiveXml) throws Exception {
        return TimeToLive.fromValue(timeToLiveXml.getTimeToLive());
    }

    
}
