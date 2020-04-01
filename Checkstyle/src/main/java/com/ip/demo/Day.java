package com.ip.demo;

import java.text.SimpleDateFormat;

import javax.swing.text.DateFormatter;

public class Day {

	     public final static ThreadLocal<DateFormatter> formatter = ThreadLocal.withInitial(() -> new DateFormatter(new SimpleDateFormat("dd-MMM-yyyy")));

	}

