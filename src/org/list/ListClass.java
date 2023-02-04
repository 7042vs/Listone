package org.list;

import java.util.ArrayList;
import java.util.List;

public class ListClass {
	  public static void main(String[] args) {
	        List<String> list = new ArrayList<>();

	        // Adding elements to the list
	        list.add("Item 1");
	        list.add("Item 2");
	        list.add("Item 3");

	        // Displaying the list elements
	        System.out.println("List elements: " + list);

	        // Removing an element from the list
	        list.remove("Item 2");

	        // Displaying the list elements after removal
	        System.out.println("List elements after removal: " + list);

	        // Checking the size of the list
	        System.out.println("List size: " + list.size());

	        // Checking if an element exists in the list
	        System.out.println("Item 3 exists in the list: " + list.contains("Item 3"));
	    }
	}


