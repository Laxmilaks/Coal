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
public interface MiningService {

	/**
	 * @param coords
	 * returns mining for given coords
	 */
	public int reteriveMiningData(Coords coords);
	

	public void reteriveResults(List<Coords> myList);
}
