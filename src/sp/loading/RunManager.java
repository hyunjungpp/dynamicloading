package sp.loading;

import java.net.MalformedURLException;

public class RunManager {
	
	public static void main(String[] args) throws MalformedURLException{
		new DynamicLoading().run();
		System.out.println("== done.");
	}

}
