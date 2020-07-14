package webScrape;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class WebScrape {

	public static void main(String[] args) {
		
		final String url = "https://criptoeconomia.com.br/cotacoes/";
		
		try {
			
			final Document document = Jsoup.connect(url).get();
			
			for(Element row: document.select("table.coin-table tr")) {
				if(row.select("th:nth-of-type(1)").text().equals("")) {
					continue;
				}else {
					final String code = row.select("th:nth-of-type(1)").text();
					System.out.println(code);
					
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			
	}

}
;