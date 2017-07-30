package org.tanzeem.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tester {

	private static final Logger LOG = LoggerFactory.getLogger(Tester.class);

	@Test
	public void assertTrue() {

		LOG.info("Running sample test");
		Assert.assertTrue(true, "Value mismatch");
	}

	@Test
	public void assertFalse() {

		LOG.info("Running sample test");
		Assert.assertTrue(true, "Value mismatch");
	}
}
