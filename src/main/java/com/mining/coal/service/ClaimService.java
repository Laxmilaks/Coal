package com.mining.coal.service;

import java.util.List;

import com.mining.coal.dto.Coords;

/**
 * @author laxmim
 *
 */
public interface ClaimService {

	
	/**
	 * @param coords
	 * returns mining for given coords
	 */
	public int reteriveClaimData(Coords coords);

	/**
	 * @param coords
	 * @param claimValue
	 * returns mining for given coords with more than given Claim value
	 */
	public int reteriveClaimData(Coords coords, int claimValue);

	
	/**
	 * @param List of coords
	 * @param claimValue
	 * returns mining for given coords with more than given Claim value
	 */
	public void reteriveResults(List<Coords> coords, int claimValue);
}

