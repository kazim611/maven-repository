package com.mulesoft.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mule.api.MuleEvent;
import org.mule.tck.junit4.FunctionalTestCase;

public class HelloMavenTest extends FunctionalTestCase {

	@Test
    public void testHello() throws Exception{
	MuleEvent event = runFlow("flights");
    String contentType = event.getMessage().getOutboundProperty("Content-Type");
    assertEquals("application/json", contentType);
	}
	@Override
	protected String getConfigFile(){
	return "mule-project.xml";
}
}
