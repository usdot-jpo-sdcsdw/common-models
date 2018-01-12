package gov.dot.its.jpo.sdcsdw.Models;

public class ServiceRegion {

	public NwCorner getNwCorner() {
		return nwCorner;
	}

	public void setNwCorner(NwCorner nwCorner) {
		this.nwCorner = nwCorner;
	}

	public SeCorner getSeCorner() {
		return seCorner;
	}

	public void setSeCorner(SeCorner seCorner) {
		this.seCorner = seCorner;
	}

	private NwCorner nwCorner;
	private SeCorner seCorner;
}
