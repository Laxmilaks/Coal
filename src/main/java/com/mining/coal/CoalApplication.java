package com.mining.coal;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mining.coal.dto.Coords;
import com.mining.coal.service.ClaimService;
import com.mining.coal.service.ClaimServiceImpl;
import com.mining.coal.service.MiningService;
import com.mining.coal.service.MiningServiceImpl;

@SpringBootApplication
public class CoalApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoalApplication.class, args);
	
		MiningService ms = new MiningServiceImpl();
		ClaimService cs = new ClaimServiceImpl();
		
		System.out.println();
		System.out.println("======================================Query 1========================================");
		System.out.println("Mine entries on or within the boundary (1,2),(4,2),(4,5),(1,5),(1,2) : ");
		System.out.println();
		
		// Creating a ArrayList
        List<Coords> miningList = new ArrayList<Coords>();
 
        // Adding elements to the list
        // Custom inputs
        miningList.add(new Coords(1,2));
        miningList.add(new Coords(4,2));
        miningList.add(new Coords(4,5));
        miningList.add(new Coords(1,5));
        miningList.add(new Coords(1,2));
        
        //call reteriveRestuls by passing minindata as true
        ms.reteriveResults(miningList);
 
        
        System.out.println();
        System.out.println("======================================End Query 1========================================");
        
        System.out.println();
		System.out.println("======================================Query 2========================================");
		System.out.println("Mine entries on or within the boundary (1,2),(4,2),(4,5),(1,5),(1,2) : ");
		System.out.println(".........................................................................");
		System.out.println();
		
		
		//call reteriveRestuls for MiningData
        ms.reteriveResults(miningList);
        System.out.println();
        System.out.println("Mine entries on or within the boundary (8,2),(9,2),(9,3),(8,3),(8,2) : ");
        System.out.println(".........................................................................");
        System.out.println();
        miningList = new ArrayList<Coords>();
        miningList.add(new Coords(8,2));
        miningList.add(new Coords(9,2));
		miningList.add(new Coords(9,3));
		miningList.add(new Coords(8,3));
		miningList.add(new Coords(8,2));
        
      //call reteriveRestuls for MiningData
        ms.reteriveResults(miningList);
        System.out.println();
		
		// Creating a ArrayList
		List<Coords> claimingList = new ArrayList<Coords>();

        // Adding elements to the list
        // Custom inputs
		claimingList.add(new Coords(1,2));
		claimingList.add(new Coords(4,2));
		claimingList.add(new Coords(4,5));
		claimingList.add(new Coords(1,5));
		claimingList.add(new Coords(1,2));
		
		System.out.println();
		
		System.out.println("Claim entries on or within the boundary (1,2),(4,2),(4,5),(1,5),(1,2) : ");
		System.out.println(".........................................................................");
		System.out.println();
        //call reteriveRestuls for ClaimingData
        cs.reteriveResults(claimingList, 0);
 
        
        System.out.println();
        
		System.out.println("Claim entries on or within the boundary (8,2),(9,2),(9,3),(8,3),(8,2) : ");
		System.out.println(".........................................................................");
		System.out.println();
		claimingList = new ArrayList<Coords>();
		claimingList.add(new Coords(8,2));
		claimingList.add(new Coords(9,2));
		claimingList.add(new Coords(9,3));
		claimingList.add(new Coords(8,3));
		claimingList.add(new Coords(8,2));
        //call reteriveRestuls for ClaimingData
        cs.reteriveResults(claimingList, 0);
 
        
        System.out.println();
        System.out.println("======================================End Query 2========================================");
        System.out.println();
        
        
        System.out.println("======================================Query 3========================================");
		System.out.println("Mine entries on or within the boundary (1,2),(4,2),(4,5),(1,5),(1,2) : ");
		System.out.println(".........................................................................");
		System.out.println();
        // Custom inputs
		miningList = new ArrayList<Coords>();
        miningList.add(new Coords(1,2));
        miningList.add(new Coords(4,2));
        miningList.add(new Coords(4,5));
        miningList.add(new Coords(1,5));
        miningList.add(new Coords(1,2));
		
		//call reteriveRestuls for MiningData
        ms.reteriveResults(miningList);
        System.out.println();
        System.out.println("Mine entries on or within the boundary (8,2),(9,2),(9,3),(8,3),(8,2) : ");
        System.out.println(".........................................................................");
        System.out.println();
        miningList = new ArrayList<Coords>();
        miningList.add(new Coords(8,2));
        miningList.add(new Coords(9,2));
		miningList.add(new Coords(9,3));
		miningList.add(new Coords(8,3));
		miningList.add(new Coords(8,2));
        
      //call reteriveRestuls for MiningData
        ms.reteriveResults(miningList);
        System.out.println();
		
		// Creating a ArrayList
		claimingList = new ArrayList<Coords>();

        // Adding elements to the list
        // Custom inputs
		claimingList.add(new Coords(4,3));
		claimingList.add(new Coords(4,2));
		claimingList.add(new Coords(4,5));
		claimingList.add(new Coords(1,5));
		claimingList.add(new Coords(1,2));
//		claimingList.add(new Coords(2,5));
//		claimingList.add(new Coords(4,4));
		
		System.out.println();
		
		System.out.println("Claim entries on or within the boundary (1,2),(4,2),(4,5),(1,5),(1,2) -  with Claim Value passed : 30000");
		System.out.println("............................................................................................................");
		System.out.println();
        //call reteriveRestuls for ClaimingData
        cs.reteriveResults(claimingList, 10000);
 
        
        System.out.println();
        
		System.out.println("Claim entries on or within the boundary (8,2),(9,2),(9,3),(8,3),(8,2) - with Claim Value passed : 4000");
		System.out.println("............................................................................................................");
		System.out.println();
		claimingList = new ArrayList<Coords>();
		claimingList.add(new Coords(8,2));
		claimingList.add(new Coords(9,2));
		claimingList.add(new Coords(9,3));
		claimingList.add(new Coords(8,3));
		claimingList.add(new Coords(8,2));
//		claimingList.add(new Coords(2,5));
//		claimingList.add(new Coords(4,4));
        //call reteriveRestuls for ClaimingData
        cs.reteriveResults(claimingList, 500);
 
        
        System.out.println();
        System.out.println("======================================End Query 3========================================");
	}

}
