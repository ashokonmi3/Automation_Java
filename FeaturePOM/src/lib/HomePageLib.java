package lib;

import static base.InitializeLogging.log;

import po.HomePagePO;

public class HomePageLib {
	HomePagePO hp = new HomePagePO();

	public void searchGoogle(String searchTerm) {
		hp.searchBar().sendKeys(searchTerm);
		log.info("Searching google for the term : " + searchTerm);
		hp.searchButton().click();
		log.info("Google search button clicked");
	}
}