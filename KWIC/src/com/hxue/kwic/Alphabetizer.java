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
		int count = 0;
		while(!Thread.currentThread().isInterrupted())
		 {
			
				try {
					String s = read();
					buffer.add(s);
					KWIC.finaloutput = "";
					if(buffer.size() == KWIC.count)
					{
						while(!buffer.isEmpty())
						{
							write(buffer.pollFirst());
							//KWIC.finaloutput += s;
						}
						buffer=null;
						break;
					}
					
					
				/*	for(String x: buffer)
					{
						KWIC.finaloutput += x ;
					}*/

				} 
				catch(EOFException e) {
					break;
				} 
		 }
		/*while(KWIC.finaloutput.length() > 0)
        while(!buffer.isEmpty())
		{
			System.out.print(buffer.size());

			//write(buffer.pollFirst());
			write(KWIC.finaloutput);
			}*/
		
		write(null);
	}

}
