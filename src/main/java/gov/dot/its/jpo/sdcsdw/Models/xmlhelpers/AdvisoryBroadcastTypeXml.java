package gov.dot.its.jpo.sdcsdw.Models.xmlhelpers;

import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

class AdvisoryBroadcastTypeXml{
    private String advisoryBroadcastType;
    private String spatAggregate;
    private String map;
	private String tim;
	private String ev;

	public String getSpatAggregate()
    {
        return spatAggregate;
    }

    public void setSpatAggregate(String spatAggregate)
    {
        this.spatAggregate = spatAggregate;
        advisoryBroadcastType = "spatAggregate";
    }

    public String getMap()
    {
        return map;
    }

    public void setMap(String map)
    {
        this.map = map;
        advisoryBroadcastType = "map";
    }
    
    public String getTim() {
        return tim;
    }

    public void setTim(String tim) {
        this.tim = tim;
        advisoryBroadcastType = "tim";
    }

    public String getEv()
    {
        return ev;
    }

    public void setEv(String ev)
    {
        this.ev = ev;
        advisoryBroadcastType = "ev";
    }

    @XmlTransient
    @JsonIgnore
    public String getAdvisoryBroadcastType()
    {
        return advisoryBroadcastType;
    }
}
