package com.example.demo;

import java.io.IOException;
import java.io.Writer;

import com.samskivert.mustache.Mustache;
import com.samskivert.mustache.Mustache.Compiler;
import com.samskivert.mustache.Template.Fragment;

class Layout implements Mustache.Lambda {

	  String body;

	  private Compiler compiler;

	  public Layout(Compiler compiler) {
	    this.compiler = compiler;
	  }

	  @Override
	  public void execute(Fragment frag, Writer out) throws IOException {
	    body = frag.execute();
	    compiler.compile("{{>layout}}").execute(frag.context(), out);
	  }

	}