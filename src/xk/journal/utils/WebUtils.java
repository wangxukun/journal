package xk.journal.utils;

import java.util.UUID;

public class WebUtils{
    public static String generateID(){
	return UUID.randomUUID().toString();
    }
}
