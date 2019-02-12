package gov.dot.its.jpo.sdcsdw.xerjaxbcodec;

import javax.xml.bind.JAXBException;

import gov.dot.its.jpo.sdcsdw.Models.AdvisorySituationDataDistribution;
import gov.dot.its.jpo.sdcsdw.Models.Destination;
import gov.dot.its.jpo.sdcsdw.Models.DialogID;
import gov.dot.its.jpo.sdcsdw.Models.DialogIdType;
import gov.dot.its.jpo.sdcsdw.Models.SeqID;
import gov.dot.its.jpo.sdcsdw.Models.ServiceRequest;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class XerJaxbCodecTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public XerJaxbCodecTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(XerJaxbCodecTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testUnmarshallServiceRequest() {
		String rawXER = "<ServiceRequest><dialogID><dialog-id-type>advSitDatDist</dialog-id-type></dialogID><seqID><svcReq/></seqID>"
				+ "<groupID>0000000</groupID><requestID>E054E21B</requestID><destination><port>46750</port></destination></ServiceRequest>";
		ServiceRequest serviceRequest = null;
		try {
			serviceRequest = (ServiceRequest) XerJaxbCodec.XerToJaxbPojo(rawXER);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		assertEquals("0000000", serviceRequest.getGroupID());
		assertEquals("E054E21B", serviceRequest.getRequestID());
		assertEquals("46750", serviceRequest.getDestination().getPort());
		assertEquals("svcReq", serviceRequest.getSeqID().getSeqId());
		assertEquals("advSitDatDist", serviceRequest.getDialogID().getDialogIdType().getValue());
	}

	public void testMarshallServiceRequest() {
		ServiceRequest serviceRequest = new ServiceRequest();

		DialogID dialogID = new DialogID();
		dialogID.setDialogId(DialogIdType.ADV_SIT_DAT_DIST);
		serviceRequest.setDialogID(dialogID);

		SeqID seqID = new SeqID();
		seqID.setSvcReq("");
		serviceRequest.setSeqID(seqID);

		serviceRequest.setGroupID("0000000");
		serviceRequest.setRequestID("E054E21B");

		Destination dest = new Destination();
		dest.setPort("46750");
		serviceRequest.setDestination(dest);

		String outputXER = "";

		try {
			outputXER = XerJaxbCodec.JaxbPojoToXer(serviceRequest);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		assertEquals("<ServiceRequest><dialogID><dialog-id-type>advSitDatDist</dialog-id-type>"
				+ "</dialogID><seqID><svcReq></svcReq></seqID><groupID>0000000</groupID>"
				+ "<requestID>E054E21B</requestID><destination><port>46750</port></destination></ServiceRequest>",
				outputXER);
	}

	public void testSelfClosingTags() {
		String actualSelfClosed = XerJaxbCodec
				.createSelfClosingTags("<ServiceRequest><dialogID><advSitDatDist></advSitDatDist>"
						+ "</dialogID><seqID><svcReq></svcReq></seqID><groupID>0000000</groupID>"
						+ "<requestID>E054E21B</requestID><destination><port>46750</port></destination></ServiceRequest>");

		String expectedSelfClosed = "<ServiceRequest><dialogID><advSitDatDist/></dialogID><seqID><svcReq/></seqID>"
				+ "<groupID>0000000</groupID><requestID>E054E21B</requestID>"
				+ "<destination><port>46750</port></destination></ServiceRequest>";

		assertEquals(expectedSelfClosed, actualSelfClosed);
	}

	public void testUnmarshallServiceResponse() {
		assertTrue(true);
	}

	public void testMarshallServiceResponse() {
		assertTrue(true);
	}

	public void testUnmarshallDataRequest() {
		assertTrue(true);
	}

	public void testMarshalDataRequest() {
		assertTrue(true);
	}

	public void testUnmarshallAdvisorySituationDataDistributionRequest() {
		String rawXER = "<AdvisorySituationDataDistribution><dialogID><advSitDatDist/></dialogID><seqID><data/></seqID><groupID>00000000</groupID><requestID>E054E21B</requestID><recordCount>14</recordCount><bundleCount>2</bundleCount><asdBundles><AdvisorySituationBundle><bundleNumber>1</bundleNumber><bundleId>5B99E92E</bundleId><asdRecords><AdvisoryBroadcast><messagePsid>00008003</messagePsid><broadcastInst><biType><tim/></biType><biPriority>32</biPriority><biDeliveryStart><year>2017</year><month>5</month><day>16</day><hour>1</hour><minute>52</minute></biDeliveryStart><biDeliveryStop><year>2017</year><month>5</month><day>23</day><hour>1</hour><minute>52</minute></biDeliveryStop><biSignature><true/></biSignature><biEncryption><false/></biEncryption><dsrcInst><biTxMode><alternating/></biTxMode><biTxChannel><ch178/></biTxChannel><biTxInterval>1</biTxInterval></dsrcInst></broadcastInst><advisoryMessage>0380820120001F811C2813137434D48564554300004000000001F40100176521EFD9D76E2EBCEB45A8C2FE6E5BF6D7CBCFA09AECFA9E739EE2221F41003808004004000D0C4478374000000A326DC06A2002800000000000000000040416030D05D1D195B9D1A5BDB8B88151A1A5CC81A5CC8185B88115B595C99D95B98DE48105B195C9D0B88151A195C99481A5CC818481A185E985C991BDD5CC81B585D195C9A585B1CC81D1C9D58DAC81BDB88199A5C9948185A19585908185D0811DC9D58988814DD1C99595D0B88119BDC881E5BDD5C881CD859995D1E4B081B585AD9481848154B5D1D5C9B881B9BDDCB0B081BDC881D1D5C9B881B19599D081BDB881CDBDD5D1A081B5A5B1B081CDD1C99595D081D1BC8195E1A5D081D1A1948185C99584B81400</advisoryMessage></AdvisoryBroadcast><AdvisoryBroadcast><messagePsid>00008003</messagePsid><broadcastInst><biType><tim/></biType><biPriority>32</biPriority><biDeliveryStart><year>2017</year><month>4</month><day>31</day><hour>15</hour><minute>57</minute></biDeliveryStart><biDeliveryStop><year>2017</year><month>5</month><day>7</day><hour>15</hour><minute>57</minute></biDeliveryStop><biSignature><true/></biSignature><biEncryption><false/></biEncryption><dsrcInst><biTxMode><alternating/></biTxMode><biTxChannel><ch178/></biTxChannel><biTxInterval>1</biTxInterval></dsrcInst></broadcastInst><advisoryMessage>038082020E001F820A2803137424256455430310004000000001F401005761F372DFB6BE5E7D0457A81033B82C3530FA08E000400792A729454F0EEDAABB119B96FDB3B7F2E9A0457A3ED03B81E0430FA081E008410245111010E878407531300BDC0B718000001464DB81A7400D00000000000000000008082C063A0BA3A32B73A34B7B717102A3434B99034B99030B71022B6B2B933B2B731BC9020B632B93A17102CB7BA9030B9329030B8383937B0B1B434B7339030903230B733B2B937BAB99033B0B9903632B0B59030B432B0B21037B71028BAB4B731BC90283630B1B297102337B9103CB7BAB91039B0B332BA3C96103A3AB937103632B33A1030BA103A3432903334B939BA1039BA3932B2BA1034B73A32B939B2B1BA34B7B71030B432B0B21030B7321032BC34BA103A34329030B932B09034B6B6B2B234B0BA32B63C9702D00000000000000000108082C06020BA3A32B73A34B7B717102A3434B99034B99030B71022B6B2B933B2B731BC9020B632B93A17102A3432B9329034B99030903230B733B2B937BAB99033B0B9903632B0B590189818103CB0B93239903A37903A3432903934B3B43A1037B71028BAB4B731BC90283630B1B297102337B9103CB7BAB91039B0B332BA3C96103237903737BA103A3AB9371037B71028BAB4B731BC90283630B1B2971021B7B73A34B73AB29033B7B4B7339039BA3930B4B3B43A1037B71022B1B5B4B733BA37B717028</advisoryMessage></AdvisoryBroadcast><AdvisoryBroadcast><messagePsid>00008003</messagePsid><broadcastInst><biType><tim/></biType><biPriority>32</biPriority><biDeliveryStart><year>2017</year><month>5</month><day>5</day><hour>21</hour><minute>24</minute></biDeliveryStart><biDeliveryStop><year>2017</year><month>5</month><day>12</day><hour>21</hour><minute>24</minute></biDeliveryStop><biSignature><true/></biSignature><biEncryption><false/></biEncryption><dsrcInst><biTxMode><alternating/></biTxMode><biTxChannel><ch178/></biTxChannel><biTxInterval>1</biTxInterval></dsrcInst></broadcastInst><advisoryMessage>0380820180001F817C28031365F44435F564554000400004F741F40380176269D783C3872DF871E81334535D8F59863643202E0008E00000016C09A6508B604F3284000000B0E36E04ED001448D159E2448D159C0C2020B025482DC40D2DAE0DEE4E8C2DCE840DACAE6E6C2CECA40CCE4DEDA40E8D0CA408886408CD2E4CA4088CAE0C2E4E8DACADCE85C40A8D0CAE4CA40D2E640C240DAC2D4DEE440CCD2E4CA40EED2E8D040E8DEF0D2C640E6DADED6CA40C2E840E8D0CA40A0DEE8DEDAC2C6409ACAE8E4DE40A6E8C2E8D2DEDC5C40A0DEE8C2DAC2F040C2DCC840A0CADCDCE6F2D8ECC2DCD2C24082ECCADCEACAE640DCCAC2E440E8D0CA40E0DEE8DEDAC2C640DACAE8E4DE40E6E8C2E8D2DEDC40C2E4CA40C6D8DEE6CAC840E8DE40C2D8D840E8E4C2CCCCD2C65C40A8DE40C2ECDED2C840E8D0CA40E6DADED6CA5840C240C4E4CAC2E8D0D2DCCE40D0C2F4C2E4C85840F2DEEA40E6D0DEEAD8C840D0CAC2C840E6DEEAE8D040E8DEEEC2E4C840E8D0CA4082DCC2DEE6E8D2C240A4D2ECCAE45C0A0</advisoryMessage></AdvisoryBroadcast><AdvisoryBroadcast><messagePsid>00008003</messagePsid><broadcastInst><biType><tim/></biType><biPriority>32</biPriority><biDeliveryStart><year>2017</year><month>4</month><day>17</day><hour>11</hour><minute>29</minute></biDeliveryStart><biDeliveryStop><year>2017</year><month>4</month><day>24</day><hour>11</hour><minute>29</minute></biDeliveryStop><biSignature><true/></biSignature><biEncryption><false/></biEncryption><dsrcInst><biTxMode><alternating/></biTxMode><biTxChannel><ch178/></biTxChannel><biTxInterval>1</biTxInterval></dsrcInst></broadcastInst><advisoryMessage>038056001F5360000000313744424353573130000B28AA5A46C77085DC620298002449201F40100176369D89A8224684821D3AE818B05154B5B20EE10BB64405012C3F002210008DCA12046E40A000018D4A40218310A11080</advisoryMessage></AdvisoryBroadcast><AdvisoryBroadcast><messagePsid>00008003</messagePsid><broadcastInst><biType><tim/></biType><biPriority>32</biPriority><biDeliveryStart><year>2017</year><month>5</month><day>5</day><hour>21</hour><minute>34</minute></biDeliveryStart><biDeliveryStop><year>2017</year><month>5</month><day>12</day><hour>21</hour><minute>34</minute></biDeliveryStop><biSignature><true/></biSignature><biEncryption><false/></biEncryption><dsrcInst><biTxMode><alternating/></biTxMode><biTxChannel><ch178/></biTxChannel><biTxInterval>1</biTxInterval></dsrcInst></broadcastInst><advisoryMessage>038082010F001F810B2803137444256455430320004000000001F401001761F372DFB62E1E7D04552FFCC3B8468EF0FA0801E040090BA1FD582B87402800000051936E033D00140000000000000000002020B017C82E8E8CADCE8D2DEDC5C40A8D0D2E640D2E640C2DC408ADACAE4CECADCC6F24082D8CAE4E85C40A8D0CAE4CA40D2E640C240D0C2F4C2E4C8DEEAE640DAC2E8CAE4D2C2D8E640E8E4EAC6D640DEDC40CCD2E4CA40C2E8408CD8DEE4D2C8C24082ECCADCEACA5C408CDEE440F2DEEAE440E6C2CCCAE8F25840DAC2D6CA40C240AA5AE8EAE4DC40DCDEEE585840DEE440E8EAE4DC40D8CACCE840DEDC4090C2E4E4F240A8D0DEDAC2E640EEC2F240E8DE40CAF0D2E840E8D0CA40C2E4CAC25C0A0</advisoryMessage></AdvisoryBroadcast><AdvisoryBroadcast><messagePsid>00008003</messagePsid><broadcastInst><biType><tim/></biType><biPriority>32</biPriority><biDeliveryStart><year>2017</year><month>10</month><day>28</day><hour>17</hour><minute>40</minute></biDeliveryStart><biDeliveryStop><year>2017</year><month>11</month><day>5</day><hour>17</hour><minute>40</minute></biDeliveryStop><biSignature><true/></biSignature><biEncryption><false/></biEncryption><dsrcInst><biTxMode><alternating/></biTxMode><biTxChannel><ch178/></biTxChannel><biTxInterval>1</biTxInterval></dsrcInst></broadcastInst><advisoryMessage>03808180001F7D201313744425757453030000708AA588D8770FF8DC0030400001F4038007E1154B11B0EE1FF1B83E8201F80098825A25461EE7DE8CE98FCA19401EDA41B9DF6C182D1FAC21FF79A08B76A611FACD8270DA188F9D6A0268118847117F09F425A14DE3F829400D096A426C6C841A0058804C13BB0CA0A1E8978000000E02</advisoryMessage></AdvisoryBroadcast><AdvisoryBroadcast><messagePsid>00008003</messagePsid><broadcastInst><biType><tim/></biType><biPriority>32</biPriority><biDeliveryStart><year>2017</year><month>4</month><day>23</day><hour>0</hour><minute>31</minute></biDeliveryStart><biDeliveryStop><year>2017</year><month>4</month><day>30</day><hour>0</hour><minute>31</minute></biDeliveryStop><biSignature><true/></biSignature><biEncryption><false/></biEncryption><dsrcInst><biTxMode><alternating/></biTxMode><biTxChannel><ch178/></biTxChannel><biTxInterval>1</biTxInterval></dsrcInst></broadcastInst><advisoryMessage>038082011A001F81162813137444356455430310004000000001F4010017620066E5BF6D7CBCFA099ACC70A7AC673FC1F411C000801540ABFE08A9A25FF7C000000A326DC06C2002800000000000000000040416031D05D1D195B9D1A5BDB8B88151A1A5CC81A5CC8185B88115B595C99D95B98DE48105B195C9D0B88165BDD48185C9948185C1C1C9BD858DA1A5B99C8184819185B99D95C9BDD5CC819D85CC81B19585AC8185A195859081BDB88145D5A5B98DE48141B1858D94B88119BDC881E5BDD5C881CD859995D1E4B081D1D5C9B881B19599D08185D081D1A1948199A5C9CDD081CDD1C99595D081A5B9D195C9CD958DD1A5BDB88185A19585908185B9908195E1A5D081D1A1948185C9958481A5B5B59591A585D195B1E4B81400</advisoryMessage></AdvisoryBroadcast><AdvisoryBroadcast><messagePsid>00008003</messagePsid><broadcastInst><biType><tim/></biType><biPriority>32</biPriority><biDeliveryStart><year>2017</year><month>10</month><day>29</day><hour>19</hour><minute>0</minute></biDeliveryStart><biDeliveryStop><year>2017</year><month>11</month><day>6</day><hour>19</hour><minute>0</minute></biDeliveryStop><biSignature><true/></biSignature><biEncryption><false/></biEncryption><dsrcInst><biTxMode><alternating/></biTxMode><biTxChannel><ch178/></biTxChannel><biTxInterval>1</biTxInterval></dsrcInst></broadcastInst><advisoryMessage>5468697320697320616E2061647669736F7279206D6573736167652E</advisoryMessage></AdvisoryBroadcast><AdvisoryBroadcast><messagePsid>00008003</messagePsid><broadcastInst><biType><tim/></biType><biPriority>32</biPriority><biDeliveryStart><year>2017</year><month>4</month><day>17</day><hour>18</hour><minute>4</minute></biDeliveryStart><biDeliveryStop><year>2017</year><month>4</month><day>24</day><hour>18</hour><minute>4</minute></biDeliveryStop><biSignature><true/></biSignature><biEncryption><false/></biEncryption><dsrcInst><biTxMode><alternating/></biTxMode><biTxChannel><ch178/></biTxChannel><biTxInterval>1</biTxInterval></dsrcInst></broadcastInst><advisoryMessage>03805C001F5960000000313747564353573031000B28E9D43907471B95E2028E000447B81F40100176329D89A823D6410E9D740C18A8E9DD50874728032203C0961F001108117D9A6B020AFCAB059053689933000006352A00860C4A044200</advisoryMessage></AdvisoryBroadcast><AdvisoryBroadcast><messagePsid>00008003</messagePsid><broadcastInst><biType><tim/></biType><biPriority>32</biPriority><biDeliveryStart><year>2017</year><month>10</month><day>29</day><hour>19</hour><minute>1</minute></biDeliveryStart><biDeliveryStop><year>2017</year><month>11</month><day>6</day><hour>19</hour><minute>1</minute></biDeliveryStop><biSignature><true/></biSignature><biEncryption><false/></biEncryption><dsrcInst><biTxMode><alternating/></biTxMode><biTxChannel><ch178/></biTxChannel><biTxInterval>1</biTxInterval></dsrcInst></broadcastInst><advisoryMessage>5468697320697320616E2061647669736F7279206D6573736167652E</advisoryMessage></AdvisoryBroadcast></asdRecords></AdvisorySituationBundle><AdvisorySituationBundle><bundleNumber>2</bundleNumber><bundleId>5B99E92E</bundleId><asdRecords><AdvisoryBroadcast><messagePsid>00008003</messagePsid><broadcastInst><biType><tim/></biType><biPriority>32</biPriority><biDeliveryStart><year>2017</year><month>4</month><day>24</day><hour>3</hour><minute>5</minute></biDeliveryStart><biDeliveryStop><year>2017</year><month>4</month><day>31</day><hour>3</hour><minute>5</minute></biDeliveryStop><biSignature><true/></biSignature><biEncryption><false/></biEncryption><dsrcInst><biTxMode><alternating/></biTxMode><biTxChannel><ch178/></biTxChannel><biTxInterval>1</biTxInterval></dsrcInst></broadcastInst><advisoryMessage>0380820111001F810D2813137444356455430320004000000001F4010017623372DFB676FE5D34099ACF5507AC7BD621F4101C0080136AA1D2309C7993350000000A326DC067A00280000000000000000004041602F905D1D195B9D1A5BDB8B88151A1A5CC81A5CC8185B88115B595C99D95B98DE48105B195C9D0B88151A195C99481A5CC818481A185E985C991BDD5CC81B585D195C9A585B1CC81D1C9D58DAC81BDB88199A5C9948185D08119B1BDC9A591848105D995B9D594B88119BDC881E5BDD5C881CD859995D1E4B081B585AD9481848154B5D1D5C9B881B9BDDCB0B081BDC881D1D5C9B881B19599D081BDB8812185C9C9E48151A1BDB585CC81DD85E481D1BC8195E1A5D081D1A1948185C99584B81400</advisoryMessage></AdvisoryBroadcast><AdvisoryBroadcast><messagePsid>00008003</messagePsid><broadcastInst><biType><tim/></biType><biPriority>32</biPriority><biDeliveryStart><year>2017</year><month>10</month><day>29</day><hour>19</hour><minute>0</minute></biDeliveryStart><biDeliveryStop><year>2017</year><month>11</month><day>6</day><hour>19</hour><minute>0</minute></biDeliveryStop><biSignature><true/></biSignature><biEncryption><false/></biEncryption><dsrcInst><biTxMode><alternating/></biTxMode><biTxChannel><ch178/></biTxChannel><biTxInterval>1</biTxInterval></dsrcInst></broadcastInst><advisoryMessage>5468697320697320616E2061647669736F7279206D6573736167652E</advisoryMessage></AdvisoryBroadcast><AdvisoryBroadcast><messagePsid>00008003</messagePsid><broadcastInst><biType><tim/></biType><biPriority>32</biPriority><biDeliveryStart><year>2017</year><month>10</month><day>29</day><hour>19</hour><minute>0</minute></biDeliveryStart><biDeliveryStop><year>2017</year><month>11</month><day>6</day><hour>19</hour><minute>0</minute></biDeliveryStop><biSignature><true/></biSignature><biEncryption><false/></biEncryption><dsrcInst><biTxMode><alternating/></biTxMode><biTxChannel><ch178/></biTxChannel><biTxInterval>1</biTxInterval></dsrcInst></broadcastInst><advisoryMessage>5468697320697320616E2061647669736F7279206D6573736167652E</advisoryMessage></AdvisoryBroadcast><AdvisoryBroadcast><messagePsid>00008003</messagePsid><broadcastInst><biType><tim/></biType><biPriority>32</biPriority><biDeliveryStart><year>2017</year><month>9</month><day>25</day><hour>16</hour><minute>38</minute></biDeliveryStart><biDeliveryStop><year>2017</year><month>10</month><day>1</day><hour>16</hour><minute>38</minute></biDeliveryStop><biSignature><true/></biSignature><biEncryption><false/></biEncryption><dsrcInst><biTxMode><alternating/></biTxMode><biTxChannel><ch178/></biTxChannel><biTxInterval>1</biTxInterval></dsrcInst></broadcastInst><advisoryMessage>0380820120001F811C2813137434D48564554310004000000001F40100176521EFD9D76E2EBCEB45A8C6FE6E5BF6D7CBCFA09AFB0DEC7391A6D81F41001C08004004000D43B882108000000A326DC06A2002800000000000000000040416030D05D1D195B9D1A5BDB8B88151A1A5CC81A5CC8185B88115B595C99D95B98DE48105B195C9D0B88151A195C99481A5CC818481A185E985C991BDD5CC81B585D195C9A585B1CC81D1C9D58DAC81BDB88199A5C9948185A19585908185D0811DC9D58988814DD1C99595D0B88119BDC881E5BDD5C881CD859995D1E4B081B585AD9481848154B5D1D5C9B881B9BDDCB0B081BDC881D1D5C9B881B19599D081BDB881CDBDD5D1A081B5A5B1B081CDD1C99595D081D1BC8195E1A5D081D1A1948185C99584B81400</advisoryMessage></AdvisoryBroadcast></asdRecords></AdvisorySituationBundle></asdBundles></AdvisorySituationDataDistribution>";
		AdvisorySituationDataDistribution advSitDataDist = null;
		try {
			advSitDataDist = (AdvisorySituationDataDistribution) XerJaxbCodec.XerToJaxbPojo(rawXER);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// assertEquals(advSitDataDist.getAsdBundles().getAdvisorySituationBundle()[0].getBundleId()
		// ,1);
	}

	public void testMarshallAdvisorySituationDataDistributionRequest() {
		assertTrue(true);
	}

	public void testUnmarshallDataAcceptance() {
		assertTrue(true);
	}

	public void testMarshallDataAcceptance() {
		assertTrue(true);
	}

	public void testUnmarshallDataReceipt() {
		assertTrue(true);
	}

	public void testMarshallDataReceipt() {
		assertTrue(true);
	}
}
