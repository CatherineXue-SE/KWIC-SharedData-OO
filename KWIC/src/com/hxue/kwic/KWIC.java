package com.hxue.kwic;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class KWIC {
		
	 static String finaloutput="";
    public String parse(String input) throws EOFException
    {
		    steps newstep = new steps(
		    		new InputFilter(input),
					new CircularShifter(),
					new Alphabetizer(),
					new OutputFilter()
					);
			Thread thread = new Thread(newstep);;
			thread.run();

			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			/*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			try {
				String read;
				while(true) {
					read = reader.readLine();
					if(read == null) {
						break;
					}
					System.out.println(read);
				}
			} catch (IOException e) {
				System.err.println("IOException caught in Filter::StandardIn");
			}*/
		return  getOutput();//newoutput.read();//newoutput.read().toString();
		
    }
   
    public static void setOutput(String addinput)
    {
    	finaloutput =addinput;
    	System.out.println(finaloutput);
    }
  
    public static String getOutput()
    {
    	return finaloutput;
    }
  

	

}

