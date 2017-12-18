package gov.dot.its.jpo.sdcsdw.xerjaxbcodec;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import gov.dot.its.jpo.sdcsdw.MessageTypes.DialogMessage;

/**
 * Hello world!
 *
 */
public class XerJaxbCodec {

	/**
	 * Given an XER string representing one of the messages from the dialog create a
	 * POJO object
	 * 
	 * @param decodedXER
	 * @throws JAXBException
	 */
	public static DialogMessage XerToJaxbPojo(String decodedXER) throws JAXBException {

		StringReader reader = new StringReader(decodedXER);
		// At the onset we won't know what th e type of the unmarshalled object is
		DialogMessage unmarshalledObject = null;

		unmarshalledObject = (DialogMessage) unmarshaller.unmarshal(reader);
		return unmarshalledObject;

	}

	public static String JaxbPojoToXer(DialogMessage dialogMessageObject) throws JAXBException {

		// Given an object of type DialogMessage, create its XML (XER) representation
		StringWriter writer = new StringWriter();

		marshaller.marshal(dialogMessageObject, writer);

		return writer.toString();
	}

	
	public static String createSelfClosingTags(String xerToModify) {
		return xerToModify.replaceAll("<([^>]*)><\\/\\1>", "<$1\\/>");
	}
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}

	private static JAXBContext jaxbContext = null;
	private static Marshaller marshaller = null;
	private static Unmarshaller unmarshaller = null;

	static {
		try {
			jaxbContext = JAXBContext.newInstance("gov.dot.its.jpo.sdcsdw.MessageTypes");
		} catch (JAXBException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
			
		} catch (JAXBException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			unmarshaller = jaxbContext.createUnmarshaller();
		} catch (JAXBException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
}
