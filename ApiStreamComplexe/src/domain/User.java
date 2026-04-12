package domain;

import java.util.ArrayList;

public record User(String name, int age, Sex sex, ArrayList<Contact> contacts ) {

}
