
package tests;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.CTHackATAhon;

/**
 * 
 * @author saurav
 *
 */
public class CTHackATAhonTest extends BaseTest
{
	public static Logger LOG=Logger.getLogger(CTHackATAhonTest.class);

	@Test
	public void cTHackATAhonCountTest()
	{
		LOG.info("***cTHackATAhonCountTest****");
		CTHackATAhon cTHackATAhon = new CTHackATAhon(driver);
		LOG.info("#CTHackATAhon count :"+cTHackATAhon.getCount());		
		Assert.assertEquals(2, cTHackATAhon.getCount());
	}	
	
	@Test
	public void NSETopGainersTest()
	{
		LOG.info("****NSETopGainersTest****");
		CTHackATAhon cTHackATAhon = new CTHackATAhon(driver);	
	}	
	
	@Test
	public void NSETopLosersTest()
	{
		LOG.info("****NSETopLosersTest****");
		CTHackATAhon cTHackATAhon = new CTHackATAhon(driver);	
	}	
	
	@Test
	public void NSEQuotesTest()
	{
		LOG.info("****NSEQuotesTest****");
		CTHackATAhon cTHackATAhon = new CTHackATAhon(driver);	
	}	
	
}
