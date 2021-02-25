package com.hxue.kwic;

import java.io.EOFException;
import java.util.concurrent.ConcurrentSkipListSet;

public class Alphabetizer extends Filter {
	
	private ConcurrentSkipListSet<String> buffer;
	public Alphabetizer() {
		buffer = new ConcurrentSkipListSet<String>(String.CASE_INSENSITIVE_ORDER);
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				String s = read();
				buffer.add(s);
				System.out.println("sort + " + buffer);

			} catch(EOFException e) {
				break;
			}
		}
		
		while(!buffer.isEmpty())
		{
			write(buffer.pollFirst());
		}
		
		write(null);
	}
	
}
