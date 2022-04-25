
import java.util.ArrayList;

public class StoreController {
	private ArrayList<Store> StoreList = new ArrayList<Store>();

	public StoreController() {
		StoreList.add(new Restaurant("ÇØ¼º½Ä´ç", null, 75, 80, 70, 75));
		StoreList.add(new Restaurant("Á¤¸²ÀÌ³×", null, 100, 90, 85, 92));
		StoreList.add(new Restaurant("¿Õ»À»ç¶û", null, 76, 75, 77, 76));
		StoreList.add(new Salon("¹Ú½ÂÃ¶", null, 89, 91, 88));
		StoreList.add(new Salon("ÀÌ°¡ÀÚ", null, 90, 92, 89));
		StoreList.add(new Salon("¸®¾È", null, 87, 80, 94));
	}

	public ArrayList<Store> getStoreList() {
		return StoreList;
	}	


}