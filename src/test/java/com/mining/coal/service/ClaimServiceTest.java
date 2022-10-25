/**
 * 
 */
package com.mining.coal.service;

import static org.junit.Assert.assertEquals;
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
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import com.mining.coal.dto.Coords;

/**
 * @author laxmim
 *
 */
@RunWith(MockitoJUnitRunner.class)
class ClaimServiceTest {
	private static Map<Coords, Integer> claimData;
	private static List<Coords> claimingList;

	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		claimData = new HashMap<Coords, Integer>();

		claimData.put(new Coords(2, 5), 10000);
		claimData.put(new Coords(4, 4), 30000);
		claimData.put(new Coords(1, 4), 500);
		
		
		// Creating a ArrayList
		claimingList = new ArrayList<Coords>();

        // Adding elements to the list
        // Custom inputs
		claimingList.add(new Coords(1,2));
		claimingList.add(new Coords(4,2));
		claimingList.add(new Coords(4,5));
		claimingList.add(new Coords(1,5));
		claimingList.add(new Coords(1,2));
	}

	@Test
	void reteriveClaimDataTestWirhGivenCoord() {
		assertEquals(10000,claimData.get(new Coords(2, 5)));
	}
	
	@Test
	void reteriveClaimDataTestForNonExisitingCoord() {
		assertEquals(null,claimData.get(new Coords(3, 5)));
	}
	
	@Test
	void reteriveClaimDataTestForExistingValue() {
		ClaimService claimService = mock(ClaimService.class);
		when(claimService.reteriveClaimData(any(Coords.class))).thenReturn(10000);
		assertEquals(10000,claimService.reteriveClaimData(new Coords(2, 5)));
	}
	
	@Test
	void reteriveClaimDataTestForNonExistingValue() {
		ClaimService claimService = mock(ClaimService.class);
		when(claimService.reteriveClaimData(new Coords(2, 5))).thenReturn(0);
		assertEquals(0,claimService.reteriveClaimData(new Coords(6, 5)));
	}
	
	@Test
	void reteriveClaimDataTestWithClaimValueForExistingValue() {
		ClaimService claimService = mock(ClaimService.class);
		when(claimService.reteriveClaimData(any(Coords.class),Mockito.anyInt())).thenReturn(10000);
		assertEquals(10000,claimService.reteriveClaimData(new Coords(2, 5),500));
	}
	
	@Test
	void reteriveClaimDataTestWithClaimValueForNonExistingValue() {
		ClaimService claimService = mock(ClaimService.class);
		when(claimService.reteriveClaimData(any(Coords.class),Mockito.anyInt())).thenReturn(0);
		assertEquals(0,claimService.reteriveClaimData(new Coords(2, 5) ,500));
	}
}
