package org.jiopi.framework.util;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.jiopi.framework.version.JIOPI;

@JIOPI
public class Config {
	
	public static final String CONFIG_FILE = "jiopi.properties";
	
	private static Properties pro = new Properties();
	
	static {
		InputStream in = null;
		try {
			in = Config.class.getClassLoader().getResourceAsStream( CONFIG_FILE );
			if( in!=null ) {
				pro.load( in );
			} else {
				throw new RuntimeException( "cannot find configuration file: " + CONFIG_FILE
					+ " in class path.");
			}
		} catch (IOException e) {
			throw new RuntimeException( e );
		} finally {
			close( in );
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
