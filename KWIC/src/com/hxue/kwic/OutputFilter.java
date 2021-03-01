package com.hxue.kwic;

import java.io.EOFException;

public class OutputFilter extends Filter {

	@Override
	public void run() {
		while(!Thread.currentThread().isInterrupted()) {
			try {
				
				//String s = read();
				KWIC.finaloutput += read();
				//System.out.println(read());

				//KWIC.finaloutput+=s;
			} catch(EOFException e) {
				break;
			}
		}
	}



}