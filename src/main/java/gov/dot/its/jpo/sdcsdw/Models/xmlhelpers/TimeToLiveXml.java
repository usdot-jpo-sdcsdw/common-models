package gov.dot.its.jpo.sdcsdw.Models.xmlhelpers;

import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

class TimeToLiveXml {
    private String timeToLive;
    
    private String minute;
    private String halfHour;
    private String day;
	private String week;
	private String month;
	private String year;

	public String getWeek() {
		return week;
	}

	public void setWeek(String week) {
		this.week = week;
		timeToLive = "week";
	}

    public String getMinute()
    {
        return minute;
    }

    public void setMinute(String minute)
    {
        this.minute = minute;
        timeToLive = "minute";
    }

    public String getHalfHour()
    {
        return halfHour;
    }

    public void setHalfHour(String halfHour)
    {
        this.halfHour = halfHour;
        timeToLive = "halfHour";
    }

    public String getDay()
    {
        return day;
    }

    public void setDay(String day)
    {
        this.day = day;
        timeToLive = "day";
    }

    public String getMonth()
    {
        return month;
    }

    public void setMonth(String month)
    {
        this.month = month;
        timeToLive = "month";
    }

    public String getYear()
    {
        return year;
    }

    public void setYear(String year)
    {
        this.year = year;
        timeToLive = "year";
    }
    
    @XmlTransient
    @JsonIgnore
    public String getTimeToLive() {
        return timeToLive;
    }

}
