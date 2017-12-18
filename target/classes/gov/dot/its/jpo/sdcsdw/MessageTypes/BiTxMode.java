package gov.dot.its.jpo.sdcsdw.MessageTypes;

public class BiTxMode {
	private String alternating;
	private String continuous;

    public String getAlternating ()
    {
        return alternating;
    }

    public void setAlternating (String alternating)
    {
        this.alternating = alternating;
    }
    
    public String getContinuous ()
    {
        return continuous;
    }

    public void setContinuous (String continuous)
    {
        this.continuous = continuous;
    }

	public void setMode(int txMode) {
		// TODO Auto-generated method stub
		switch (txMode) {
		case 0:
			this.setContinuous("");
			break;
		case 1:
			this.setAlternating("");
			break;

		default:
			break;
		}
	}
}
