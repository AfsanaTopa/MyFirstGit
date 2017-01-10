package Factory;

import java.io.IOException;

import DataProvider.ConfigurationDataProvider;

public class DataProviderFactory {
	
	public static ConfigurationDataProvider getConfig() throws IOException{
	ConfigurationDataProvider config=new ConfigurationDataProvider();
	return config;
	}
	
}
