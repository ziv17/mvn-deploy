package com.bmc.ctm;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple Gen.
 */
public class GenTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public GenTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( GenTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testGen()
    {
        assertTrue( true );
    }
}
