package org.venkattest.model;

import java.sql.Date;

public interface Utilization {

	final double DEFAULT_CAPACITY_HOURS = 40.0;
	final double DEFAULT_CREDITED_HOURS = 40.0;
	final double ZERO_UTILIZATION = 0.0;
	
	final Date DEFAULT_START_DATE = Date.valueOf("2015-01-01");
	final Date DEFAULT_END_DATE = new java.sql.Date((new java.util.Date()).getTime());;
	
	public double getUtilization();
}
