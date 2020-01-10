package com.designpattern.abstractfactory.unittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.designpattern.abstractfactory.Client;

class ClientTest {

	Client client = new Client(new FactoryMock());
	
	@Test
	void testOperation() {
		assertEquals("Create ProductAMock and ProductBMock", client.operation());
	}

}
