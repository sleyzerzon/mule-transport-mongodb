/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.transport.mongodb;

import org.mule.tck.FunctionalTestCase;

/**
 * NamespaceHandler for MongoDB configuration
 */
public class MongoDBNamespaceHandlerTestCase extends FunctionalTestCase {
    protected String getConfigResources() {
        return "mongodb-namespace-config.xml";
    }

    public void testMongodbConfig() throws Exception {
        MongoDBConnector c = (MongoDBConnector) muleContext.getRegistry().lookupConnector("mongodbConnector");
        assertNotNull(c);
        assertTrue(c.isConnected());
        assertTrue(c.isStarted());
        assertEquals(c.getHostname(), "localhost");
        assertEquals(c.getPort(), "1234");
        assertEquals(c.getDatabase(), "myDB");
        assertEquals(c.getUsername(), "user");
        assertEquals(c.getPassword(), "pass");

    }
}
