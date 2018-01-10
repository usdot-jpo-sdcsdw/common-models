package gov.dot.its.jpo.sdcsdw.Models;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "year", "month", "day", "hour", "minute", "second", "offset" })
public class Expiration {

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	private int minute;
	private int second;
	private int month;
	private int year;
	private int day;
	private int hour;
	private int offset;
}