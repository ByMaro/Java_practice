
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		
		StoreController storeController = new StoreController();
		ArrayList<Store> storeList = storeController.getStoreList();
		
		while(true) {
			System.out.print("[1]음식점보기 [2]미용실보기 [3]상세보기 [4]평점보기 [5]종료>>");
			int menu = sc.nextInt();
			
		if(menu == 1) {
			System.out.println("====음식점보기====");
			int cnt = 1;
			for(Store r : storeList) {
				if (r instanceof Restaurant) {
					System.out.println(cnt+". "+r.getName()+"\t평점 : "+r.grade());
					cnt++;
				}
			}
				
		}else if (menu ==2) {
		
			System.out.println("====미용실보기====");
			int cnt = 1;
			for(Store s : storeList) {
				if (s instanceof Salon) {
					System.out.println(cnt+". "+s.getName()+"\t평점 : "+s.grade());
					cnt++;
				}
			}
			
		}else if (menu ==3) {
			System.out.println("====상세정보====");
			System.out.print("가게명 입력 : ");
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
				
				System.out.println("\n평점 : "+score);
			}else
				System.out.println("가게의 이름이 틀렸거나 정보가 없습니다.");
			
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
			System.out.println("정확한 숫자를 입력해주세요");
		
		}
	}
}