
import java.util.ArrayList;

public class StoreController {
	private ArrayList<Store> StoreList = new ArrayList<Store>();

	public StoreController() {
		StoreList.add(new Restaurant("�ؼ��Ĵ�", null, 75, 80, 70, 75));
		StoreList.add(new Restaurant("�����̳�", null, 100, 90, 85, 92));
		StoreList.add(new Restaurant("�ջ����", null, 76, 75, 77, 76));
		StoreList.add(new Salon("�ڽ�ö", null, 89, 91, 88));
		StoreList.add(new Salon("�̰���", null, 90, 92, 89));
		StoreList.add(new Salon("����", null, 87, 80, 94));
	}

	public ArrayList<Store> getStoreList() {
		return StoreList;
	}	


}