package ro.ase.acs.main;

import ro.ase.acs.simplefactory.after.RestApi;
import ro.ase.acs.simplefactory.after.RestApiFactory;

public class NewMain {

    public static void main(String[] args) {
      RestApi api = RestApiFactory.createConnection("release");
      api.connect();
    }
}
