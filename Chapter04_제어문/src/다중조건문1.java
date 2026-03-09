import java.util.Scanner;
import org.jsoup.Jsoup;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.w3c.dom.Element;

public class 다중조건문1 {
	public static void main(String[] args) throws Exception{
//		Scanner scan = new Scanner(System.in);
//		System.out.println("메뉴선택(0~1) : ");
//		int menu = scan.nextInt();
//		String baseurl = "https://www.genie.co.kr/genre/";
//		String url = "";
//		if(menu == 0) {
//			url = "M0100"; 
//		}
//		else if(menu == 1) {
//			url = "M0200";
//		}
//		else
//			System.out.println("없는 링크");
//		
//		System.out.println(baseurl + url);
//		
//		
//		Document doc = Jsoup.connect(baseurl+url).get();
//		Elements title = doc.select("table.list-wrap a.title");
//		for(int i=0 ; i<title.size() ; i ++) {
//			System.out.println((i+1)+"."+title.get(i).text());
//		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("메뉴선택(0~1) : ");
		String baseurl = "https://www.genie.co.kr/genre/";
		String url = scan.next();
		
		Document doc = Jsoup.connect(baseurl+url).get();
		Elements title = doc.select("table.list-wrap a.title");
		for(int i=0;i<title.size();i++) {
			System.out.println((i+1)+". "+title.get(i).text());
		}
		
		

	}
}
	
