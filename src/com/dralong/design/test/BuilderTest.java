package com.dralong.design.test;

import com.dralong.design.builder.Builder;
import com.dralong.design.builder.Sender;

public class BuilderTest {

	public static void main(String[] args) {

		Builder builder = new Builder();
		builder.produceMailSender(10);
	}

}
