package com.mining.coal.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.mining.coal.dto.Coords;

/**
 * @author laxmim
 *
 */
public class ClaimServiceImpl implements ClaimService {

	private Map<Coords, Integer>  claimData = new HashMap<Coords, Integer>();

	/**
	 * Mining service initial data
	 */
	public ClaimServiceImpl() {
		claimData.put(new Coords(2, 5), 10000);
		claimData.put(new Coords(4, 4), 30000);
		claimData.put(new Coords(1, 4), 500);	
}
	
	/**
	 * @param coords
	 * returns mining for given coords
	 */
	public int reteriveClaimData(Coords coords) {
		
		if(this.claimData.get(coords)!=null)
		return this.claimData.get(coords);
		return 0;
	}

	/**
	 * @param coords
	 * @param claimValue
	 * returns mining for given coords with more than given Claim value
	 */
	public int reteriveClaimData(Coords coords, int claimValue) {
		
		if(this.claimData.get(coords)!=null && this.claimData.get(coords) > claimValue)
		return this.claimData.get(coords);
		return 0;
	}

	
	/**
	 * @param List of coords
	 * @param claimValue
	 * returns mining for given coords with more than given Claim value
	 */
	public void reteriveResults(List<Coords> coords, int claimValue) {
		// For loop for iterating over the List
        for (int i = 0; i < coords.size(); i++) {
        	int data = 0;
        	
        	if(claimValue>0) {
        		data = this.reteriveClaimData(coords.get(i), claimValue);
        	} else {
        		data = this.reteriveClaimData(coords.get(i));
        	}
            // Print all elements of List
            if(data!=0)
    			System.out.println("Value for coordinate ("+coords.get(i).latitude+","+coords.get(i).longitude+") is "+this.reteriveClaimData(coords.get(i)));
    		else
    			System.out.println("Data not Found for "+"("+coords.get(i).latitude+","+coords.get(i).longitude+")  ");

        }
	}
}

