package com.hxue.kwic;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;

public class steps implements Runnable {
	
	private Filter[] filters;
	
	public steps(Filter ... filters ) throws EOFException {
		this.filters = filters;
		//System.out.println(KWIC.count + " =  =  " + KWIC.numofraws);
		//System.out.println(filters[1].getClass().getSimpleName().toString());

		if(filters[1].getClass().getSimpleName().toString().equals("Alphabetizer"))
		{
			KWIC.count = KWIC.numofraws + 0;
		}
		for(int i = 0; i < filters.length - 1; i++) {
			Pipe p = new Pipe();
			filters[i].exportdata(p);
			filters[i+1].importdata(p);
		}
	}

	@Override
	public void run() {
		//List<Thread> newthreadarr = new ArrayList<>();
		for(Filter f : filters) {
			Thread newthread = new Thread(f);
			newthread.start();		

		}
	}
	
	

}