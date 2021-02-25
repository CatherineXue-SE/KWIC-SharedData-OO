package com.hxue.kwic;

import java.io.EOFException;

public abstract class Filter implements Runnable {

	protected Pipe in, out;

	public void importdata(Pipe p) {
		in = p;
	}

	public void exportdata(Pipe p) {
		out = p;
	}

	public void write(String s) {
		if (s == null) {
			out.close();
			return;
		}
		out.write(s);
	}

	public String read() throws EOFException {
		return in.read();
	}

}