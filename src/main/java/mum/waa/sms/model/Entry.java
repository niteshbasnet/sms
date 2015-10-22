package mum.waa.sms.model;

import java.util.EnumSet;

public enum Entry {
	NONE, FEB, MAY, JULY, OCT, AUG;
	public static final EnumSet<Entry> all = EnumSet.of(NONE, FEB, MAY, JULY, OCT, AUG);
}
