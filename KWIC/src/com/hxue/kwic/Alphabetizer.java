package com.hxue.kwic;

import java.io.EOFException;
import java.util.concurrent.ConcurrentSkipListSet;

public class Alphabetizer extends Filter {
	
	public ConcurrentSkipListSet<String> buffer;
	public Alphabetizer() {
		buffer = new ConcurrentSkipListSet<String>(String.CASE_INSENSITIVE_ORDER);
	}
	
	@Override
	public void run() {	
		while(!Thread.currentThread().isInterrupted())
		 {
			
				try {
					String s = read();
					buffer.add(s);
					KWIC.finaloutput = "";
					for(String x: buffer)
					{
						KWIC.finaloutput += x ;
					}
					System.out.println(buffer);
					System.out.println(KWIC.finaloutput);

				} 
				catch(EOFException e) {
					break;
				} 
		 }
		System.out.print(buffer.size());
        System.out.print(KWIC.finaloutput);
		while(KWIC.finaloutput.length() > 0)
       // while(!buffer.isEmpty())
		{
			//write(buffer.pollFirst());
			write(KWIC.finaloutput);
			}
		
		write(null);
	}

}
