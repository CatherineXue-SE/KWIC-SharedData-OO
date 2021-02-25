package com.hxue.kwic;

import java.io.EOFException;
import java.util.concurrent.ConcurrentSkipListSet;

public class Alphabetizer extends Filter {
	
	public static ConcurrentSkipListSet<String> buffer;
	public Alphabetizer() {
		buffer = new ConcurrentSkipListSet<String>(String.CASE_INSENSITIVE_ORDER);
	}
	
	@Override
	public void run() {	
		while(!Thread.currentThread().isInterrupted())
		 {
				try {
					String s = read();
					System.out.println(s);
					buffer.add(s);
					KWIC.finaloutput = "";
					for(String x: buffer)
					{
						KWIC.finaloutput += x ;
					}
				} 
				catch(EOFException e) {
					break;
				}
		 }

        System.out.print(KWIC.finaloutput);
		while(KWIC.finaloutput.length() > 0)
		{
			//write(buffer.pollFirst());

			write(KWIC.finaloutput);
			}
		
		write(null);
	}

}
