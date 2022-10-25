/**
 * 
 */
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
public class MiningServiceImpl implements MiningService{

	private Map<Coords, Integer>  miningData = new HashMap<Coords, Integer>();

	/**
	 * Mining service initial data
	 */
	public MiningServiceImpl() {

			miningData.put(new Coords(4, 3), 120);
			miningData.put(new Coords(7, 9), 80);
			miningData.put(new Coords(9, 3), 90);
			miningData.put(new Coords(2, 2), 250);
			miningData.put(new Coords(8, 5), 50);
			miningData.put(new Coords(2, 2), 250);
			
	}
	
	/**
	 * @param coords
	 * returns mining for given coords
	 */
	public int reteriveMiningData(Coords coords) {
		
		if(this.miningData.get(coords)!=null)
		return this.miningData.get(coords);
		return 0;
	}
	

	public void reteriveResults(List<Coords> myList) {
		// For loop for iterating over the List
        for (int i = 0; i < myList.size(); i++) {
 
            // Print all elements of List
	            if(this.reteriveMiningData(myList.get(i))!=0)
	    			System.out.println("Value for coordinate ("+myList.get(i).latitude+","+myList.get(i).longitude+") is "+this.reteriveMiningData(myList.get(i)));
	    		else
	    			System.out.println("Data not Found for "+"("+myList.get(i).latitude+","+myList.get(i).longitude+")  ");
        	}
	}
}
