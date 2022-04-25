
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		
		StoreController storeController = new StoreController();
		ArrayList<Store> storeList = storeController.getStoreList();
		
		while(true) {
			System.out.print("[1]���������� [2]�̿�Ǻ��� [3]�󼼺��� [4]�������� [5]����>>");
			int menu = sc.nextInt();
			
		if(menu == 1) {
			System.out.println("====����������====");
			int cnt = 1;
			for(Store r : storeList) {
				if (r instanceof Restaurant) {
					System.out.println(cnt+". "+r.getName()+"\t���� : "+r.grade());
					cnt++;
				}
			}
				
		}else if (menu ==2) {
		
			System.out.println("====�̿�Ǻ���====");
			int cnt = 1;
			for(Store s : storeList) {
				if (s instanceof Salon) {
					System.out.println(cnt+". "+s.getName()+"\t���� : "+s.grade());
					cnt++;
				}
			}
			
		}else if (menu ==3) {
			System.out.println("====������====");
			System.out.print("���Ը� �Է� : ");
			String storeName = sc.next();
			
			
			double score = -1;
			
			for(Store s : storeList) {
				if(s.getName().equals(storeName))
					score = s.grade();
			}
			if(score>=0) {
				for(int i = 1; i<=10; i++)
					System.out.print(i*10+"\t");
				
				System.out.println();
				
				for(int i =0; i<(int)(score/10); i++)
					System.out.print("*\t");
				
				System.out.println("\n���� : "+score);
			}else
				System.out.println("������ �̸��� Ʋ�Ȱų� ������ �����ϴ�.");
			
		}else if (menu ==4) {
			
			for(int i = 10; i>0; i--) {
				System.out.print(i*10+"\t");
				for(Store s : storeList) {
					if((int)(s.grade()/(i*10))>0)
						System.out.print("*\t");
					else
						System.out.print("\t");
				}
				System.out.println();
			}

			for(Store s : storeList) {
				System.out.print("\t"+s.getName());
			}
			System.out.println();
			
			
		}else if (menu ==5) {
			break;
		}else
			System.out.println("��Ȯ�� ���ڸ� �Է����ּ���");
		
		}
	}
}