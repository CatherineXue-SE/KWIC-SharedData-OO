package com.hxue.kwic;
import java.util.Scanner;

public class InputFilter extends Filter{
	
private String reader;
	
	public InputFilter(String inputdata) {
		reader = inputdata;
	}
	
	@Override
	public void run() {	
		try {
			String read;
			Scanner scanner = new Scanner(reader);
			while(scanner.hasNextLine()) {
				read = scanner.nextLine();
				if(read == null) {
					write(null);
					break;
				}
				write(read + "\n");
			}
		} catch (Exception e) {
			System.err.println("IOException caught in Filter::StandardIn");
		}
	}
}
