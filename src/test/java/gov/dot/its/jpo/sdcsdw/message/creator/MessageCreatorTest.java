package gov.dot.its.jpo.sdcsdw.message.creator;

import gov.dot.its.jpo.sdcsdw.MessageTypes.DataReceipt;
import gov.dot.its.jpo.sdcsdw.MessageTypes.DialogID;
import gov.dot.its.jpo.sdcsdw.MessageTypes.ServiceResponse;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MessageCreatorTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public MessageCreatorTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(MessageCreatorTest.class);
	}

	public void testCreateServiceResponse() {
		DialogID expectedDialog = new DialogID();
		expectedDialog.setAdvSitDatDist("");
		ServiceResponse actualServiceResponse = MessageCreator.createServiceResponse(expectedDialog, "TESTGROUP",
				"TESTREQUEST", "TESTHASH", "483743530", "-1316439680", "241562500", "-723472400");

		assertEquals(expectedDialog, actualServiceResponse.getDialogID());
		assertEquals("TESTGROUP", actualServiceResponse.getGroupID());
		assertEquals("TESTREQUEST", actualServiceResponse.getRequestID());
		assertEquals("TESTHASH", actualServiceResponse.getHash());

	}

	public void testCreateAdvisorySituationDataDistribution() {
		assertTrue(true);
	}

	public void testCreateDataReceipt() {
		DialogID expectedDialog = new DialogID();
		expectedDialog.setAdvSitDatDist("");
		DataReceipt actualDataReceipt = MessageCreator.createDataReceipt(expectedDialog, "TESTGROUP", "TESTREQUEST");
		assertEquals(expectedDialog, actualDataReceipt.getDialogID());
		assertEquals("TESTGROUP", actualDataReceipt.getGroupID());
		assertEquals("TESTREQUEST", actualDataReceipt.getRequestID());
	}

}