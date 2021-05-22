package ro.ase.acs.main;

import ro.ase.acs.simplefactory.before.RestApiDevelopment;

public class Main {

    public static void main(String[] args) {
        RestApiDevelopment api = new RestApiDevelopment();
        api.connect();
    }
}
