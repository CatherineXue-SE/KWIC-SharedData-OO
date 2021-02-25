package com.hxue.kwic;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;

public class steps implements Runnable {
	
	private Filter[] filters;
	
	public steps(Filter ... filters ) throws EOFException {
		this.filters = filters;
		
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