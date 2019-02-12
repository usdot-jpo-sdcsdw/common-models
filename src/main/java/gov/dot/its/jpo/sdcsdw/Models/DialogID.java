package gov.dot.its.jpo.sdcsdw.Models;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "DialogID")
@XmlType(propOrder = { "dialogIdType" })
public class DialogID {
	@XmlElement(name = "dialog-id-type")
	private DialogIdType dialogIdType;
	
	public DialogIdType getDialogIdType() {
		return this.dialogIdType;
	}
	
	public void setDialogId(DialogIdType dialogIdType) {
		this.dialogIdType = dialogIdType;
	}
}
