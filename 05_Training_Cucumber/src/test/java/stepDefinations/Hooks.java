package stepDefinations;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before("@MobileTest")
	public void beforevaldiation() {
		System.out.println("Hook: Before Mobile  hook");
	}

	@After("@MobileTest")
	public void Aftervaldiation() {
		System.out.println("Hook: After Mobile before hook");
	}

	@Before("@WebTest")
	public void beforeWebvaldiation() {
		System.out.println("Hook :Before Web  hook");
	}

	@After("@WebTest")
	public void AfterWebvaldiation() {
		System.out.println("  Hook: After Web before hook");
	}
}
