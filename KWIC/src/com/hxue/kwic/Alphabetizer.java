package com.hxue.kwic;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListSet;


public class Alphabetizer extends Filter {
	
	//public ConcurrentSkipListSet<String> buffer;
	public List<String> buffer;
	
	public Alphabetizer() {
		buffer = new ArrayList();//new ConcurrentSkipListSet<String>(String.CASE_INSENSITIVE_ORDER);
	}
	
	@Override
	public void run() {	
		int count = 0;
		while(!Thread.currentThread().isInterrupted())
		 {
			
				try {
					String s = read();
					buffer.add(s);
					//buffer.sort((object1, object2) -> object1.compareTo(object2));
					Collections.sort(buffer, new Comparator<String>() {
						  public int compare(String o1, String o2)
						  {
						    String sub1 = o1.charAt(0)+"";
						    String sub2 = o2.charAt(0) +"";
						   // System.out.println(o1.trim() + "----" + o2.trim());
						   // System.out.println(sub1 + "----" + sub2);
						   // System.out.println(sub1.compareTo (sub2));

						    int number = 0;
						    if(sub1.compareTo (sub2) == 32)
						    {
						    	number =  -1;
						    }
						    else if(sub1.compareTo (sub2) == -32)
						    {
						    	number =  1;
						    }
						    else
						    {
						    	number = sub1.toLowerCase().compareTo (sub2.toLowerCase());
						    }
						   
						   return number;
						  }
						});
					KWIC.finaloutput = "";
					if(buffer.size() == KWIC.count)
					{
						for(int i = 0;i < KWIC.count; i++)
						{
							//System.out.print(buffer.get(i));

							write(buffer.get(i));
						}
						/*while(!buffer.isEmpty())
						{
							write(buffer.pollFirst());
							//KWIC.finaloutput += s;
						}*/
						
						//buffer=null;
						buffer =  new ArrayList();
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
