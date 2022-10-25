/**
 * 
 */
package com.mining.coal.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import com.mining.coal.dto.Coords;

/**
 * @author laxmim
 *
 */
class MiningServiceTest {
	
	private static Map<Coords, Integer> miningData;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		miningData = new HashMap<Coords, Integer>();
		miningData.put(new Coords(4, 3), 120);
		miningData.put(new Coords(7, 9), 80);
		miningData.put(new Coords(9, 3), 90);
		miningData.put(new Coords(2, 2), 250);
		miningData.put(new Coords(8, 5), 50);
		miningData.put(new Coords(2, 2), 250);
	}
	

	@Test
	void reteriveMiningDataTestWirhGivenCoord() {
		assertEquals(120,miningData.get(new Coords(4, 3)));
	}
	
	@Test
	void reteriveMiningDataTestForNonExisitingCoord() {
		assertEquals(null,miningData.get(new Coords(3, 5)));
	}
	
	@Test
	void reteriveMininDataTestForExistingValue() {
		MiningService miningService = mock(MiningService.class);
		when(miningService.reteriveMiningData(any(Coords.class))).thenReturn(10000);
		assertEquals(10000,miningService.reteriveMiningData(new Coords(2, 5)));
	}
	
	@Test
	void reteriveMiningDataTestForNonExistingValue() {
		MiningService miningService = mock(MiningService.class);
		when(miningService.reteriveMiningData(any(Coords.class))).thenReturn(0);
		assertEquals(0,miningService.reteriveMiningData(new Coords(6, 5)));
	}


}
