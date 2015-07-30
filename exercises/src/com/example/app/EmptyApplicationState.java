package com.example.app;

import java.util.Collections;
import java.util.List;

public class EmptyApplicationState implements ApplicationState {

	@Override
	public String getCommand() {
		return new String();
	}

	@Override
	public String getArgument() {
		return new String();
	}

	@Override
	public List<String> getWords() {
		return Collections.emptyList();
	}

}
