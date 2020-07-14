package sp.dloading.libsrc;

public class BClass {

	public String getAddedString(String a, String b){
		Integer first = Integer.parseInt(a);
		Integer second = Integer.parseInt(b);
		Integer random = (int)(Math.random() * 100);
		return (first + second + random) + "";
	}

}
