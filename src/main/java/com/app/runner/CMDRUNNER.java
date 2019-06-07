package com.app.runner;


import java.util.List;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import org.springframework.stereotype.Component;

@Component
public class CMDRUNNER   implements    ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
   
	      List<String> nonOptionArgs = args.getNonOptionArgs();
	      System.out.println(nonOptionArgs);
	      
	     
	       Set<String> optionNames = args.getOptionNames();
	          System.out.println(optionNames);
	          
	          
	              List<String> optionValues = args.getOptionValues("k1");
	              System.out.println(optionValues);
	    
		 
		
	}

		
	}

