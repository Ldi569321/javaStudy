package data;

public class ShopService {
	
	private static ShopService singleton;
	
	
	private  ShopService() {
	}
	
	public static ShopService getInstance() {
		if (singleton == null) {
			singleton = new ShopService();
			return singleton;
		}else {
		return singleton;
		}
		
	}
}
