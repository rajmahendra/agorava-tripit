package org.agorava.tripit.test;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.After;
import org.junit.Before;

/**
* Test class for Tripit Service 
*
* @author Rajmahendra Hegde
*/
@RunWith(Arquillian.class)
public class TripitServiceTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	 @Deployment
	    public static JavaArchive createDeployment() {
	        return ShrinkWrap.create(JavaArchive.class,"tripitservicetest.jar")
	            .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
	    }

	    @Test
	    public void dummyTest() {
	        Assert.fail("Not yet implemented");
	    }

}
