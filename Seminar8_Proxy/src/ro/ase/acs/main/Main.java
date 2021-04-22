package ro.ase.acs.main;

import java.util.Scanner;

import ro.ase.acs.proxy.Authentication;
import ro.ase.acs.proxy.AuthenticationProxy;
import ro.ase.acs.proxy.SecurityAuthenticationException;
import ro.ase.acs.proxy.WebsiteAuthentication;

public class Main {

	public static void main(String[] args) {
		Authentication authentication = 
				new AuthenticationProxy(new WebsiteAuthentication());
		Scanner scanner = new Scanner(System.in);
		System.out.print("Username: ");
		String username;
		username = scanner.nextLine();
		System.out.print("Password: ");
		String password;
		password = scanner.nextLine();

		try {
			while (!authentication.login(username, password)) {
				System.out.println("Invalid credentials");
				System.out.print("Username: ");
				username = scanner.nextLine();
				System.out.print("Password: ");
				password = scanner.nextLine();
			}

			if (authentication.login(username, password)) {
				System.out.println("Logged in successfully");
			}
		} catch (SecurityAuthenticationException e) {
			System.out.println(e.getMessage());
		}

		scanner.close();
	}

}
