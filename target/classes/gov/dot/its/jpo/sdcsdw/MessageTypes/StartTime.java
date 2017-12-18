package gov.dot.its.jpo.sdcsdw.MessageTypes;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "StartTime", propOrder = { "year", "month", "day", "hour", "minute" })
public class StartTime {
	private String minute;

	private String month;

	private String year;

	private String day;

	private String hour;

	public String getMinute() {
		return minute;
	}

	public void setMinute(String minute) {
		this.minute = minute;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}
	
	public void fillAllFields(BiDeliveryStart timeObject) {
		this.setHour(timeObject.getHour());
		this.setDay(timeObject.getDay());
		this.setMinute(timeObject.getMinute());
		this.setMonth(timeObject.getMonth());
		this.setYear(timeObject.getYear());
	}
	
}
