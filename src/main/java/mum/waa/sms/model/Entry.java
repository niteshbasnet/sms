package mum.waa.sms.model;

import java.util.EnumSet;

public enum Entry {
	FEB, MAY, JULY, OCT;
	public static final EnumSet<Entry> all = EnumSet.of(FEB, MAY, JULY, OCT);
}
