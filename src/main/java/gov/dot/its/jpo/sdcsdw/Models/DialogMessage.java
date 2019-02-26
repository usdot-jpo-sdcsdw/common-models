package gov.dot.its.jpo.sdcsdw.Models;

public abstract class DialogMessage {

	public abstract String getRequestID();
	public abstract SemiSequenceID getSeqID();
	public abstract DialogID getDialogID();
	public abstract String getGroupID();
	public abstract String getASN1MessageType();
}
