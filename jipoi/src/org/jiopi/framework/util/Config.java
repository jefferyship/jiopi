package org.jiopi.framework.util;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {
	
	public static final String CONFIG_FILE = "jiopi.properties";
	
	private static Properties pro = new Properties();
	
	static {
		InputStream in = null;
		try {
			in = Thread.currentThread().getContextClassLoader()
				.getResourceAsStream( CONFIG_FILE );
			if( in!=null ) {
				pro.load( in );
			} else {
				throw new RuntimeException( "cannot find configuration file: " + CONFIG_FILE
					+ " in class path.");
			}
//			System.out.println( pro );
		} catch (IOException e) {
			throw new RuntimeException( e );
		} finally {
			close( in );		// fixed bug.
		}
	}
	
	private static void close( Closeable c ) {
		if( c!=null ) {
			try {
				c.close();
			} catch (IOException e) {
			}
		}
	}
	
	public static String getConfig( String key ) {
		return pro.getProperty( key );
	}
	
}
