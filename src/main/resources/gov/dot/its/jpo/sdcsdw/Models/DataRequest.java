package gov.dot.its.jpo.sdcsdw.Models;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "DataRequest")
@XmlType(propOrder = { "dialogID", "seqID", "groupID", "requestID","serviceRegion","distType" })
public class DataRequest extends DialogMessage{
	private DialogID dialogID;

    private String groupID;

    private String requestID;

    private ServiceRegion serviceRegion;

    private SeqID seqID;

    private String distType;

    public DialogID getDialogID ()
    {
        return dialogID;
    }

    public void setDialogID (DialogID dialogID)
    {
        this.dialogID = dialogID;
    }

    public String getGroupID ()
    {
        return groupID;
    }

    public void setGroupID (String groupID)
    {
        this.groupID = groupID;
    }

    public String getRequestID ()
    {
        return requestID;
    }

    public void setRequestID (String requestID)
    {
        this.requestID = requestID;
    }

    public ServiceRegion getServiceRegion ()
    {
        return serviceRegion;
    }

    public void setServiceRegion (ServiceRegion serviceRegion)
    {
        this.serviceRegion = serviceRegion;
    }

    public SeqID getSeqID ()
    {
        return seqID;
    }

    public void setSeqID (SeqID seqID)
    {
        this.seqID = seqID;
    }

    public String getDistType ()
    {
        return distType;
    }

    public void setDistType (String distType)
    {
        this.distType = distType;
    }


	public String getASN1MessageType() {
		// TODO Auto-generated method stub
		return "DataRequest";
	}
}
