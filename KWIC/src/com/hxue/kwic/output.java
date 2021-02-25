package com.hxue.kwic;

import java.io.EOFException;

public class output extends Filter {

	@Override
	public void run() {
		while(true) {
			try {
				System.out.print("output + " + read());
			} catch(EOFException e) {
				break;
			}
		}
	}
	public String outputValue() throws EOFException
	{
		return read();
	}

}