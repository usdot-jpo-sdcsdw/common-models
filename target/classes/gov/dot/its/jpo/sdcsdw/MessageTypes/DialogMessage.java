package gov.dot.its.jpo.sdcsdw.MessageTypes;

public abstract class DialogMessage {

	public abstract String getRequestID();
	public abstract SeqID getSeqID();
	public abstract DialogID getDialogID();
	public abstract String getGroupID();
	public abstract String getASN1MessageType();
}
