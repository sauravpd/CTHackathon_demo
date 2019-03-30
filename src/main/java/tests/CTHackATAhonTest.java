package tests;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.CTHackATAhon;


public class CTHackATAhonTest extends BaseTest
{
	public static Logger LOG=Logger.getLogger(CTHackATAhonTest.class);

	@Test
	public void loginTest()
	{
		LOG.info("****CTHackATAhon Test****");
		CTHackATAhon cTHackATAhon = new CTHackATAhon(driver);

	}	
}
