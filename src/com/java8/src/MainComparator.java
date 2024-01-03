package com.java8.src;

import java.io.*;
import java.util.*;

// A class 'Movie' that implements Comparable
class Movie1 implements Comparable<Movie1> {
    private double rating;
    private String name;
    private int year;

    // Used to sort movies by year
    public int compareTo(Movie1 m)
    {
        return this.year - m.year;
    }

    // Constructor
    public Movie1(String nm, double rt, int yr)
    {
        this.name = nm;
        this.rating = rt;
        this.year = yr;
    }

    // Getter methods for accessing private data
    public double getRating() { return rating; }
    public String getName() { return name; }
    public int getYear() { return year; }
}

// Class to compare Movies by ratings
class RatingCompare implements Comparator<Movie1> {
    public int compare(Movie1 m1, Movie1 m2)
    {
        if (m1.getRating() < m2.getRating())
            return -1;
        if (m1.getRating() > m2.getRating())
            return 1;
        else
            return 0;
    }
}

// Class to compare Movies by name
class NameCompare implements Comparator<Movie1> {
    public int compare(Movie1 m1, Movie1 m2)
    {
        return m1.getName().compareTo(m2.getName());
    }
}

// Driver class
class MainComparator {
    public static void main(String[] args)
    {
        ArrayList<Movie1> list = new ArrayList<Movie1>();
        list.add(new Movie1("Force Awakens", 8.3, 2015));
        list.add(new Movie1("Star Wars", 8.7, 1977));
        list.add(
                new Movie1("Empire Strikes Back", 8.8, 1980));
        list.add(
                new Movie1("Return of the Jedi", 8.4, 1983));

        // Sort by rating : (1) Create an object of
        // ratingCompare
        //                  (2) Call Collections.sort
        //                  (3) Print Sorted list
        System.out.println("Sorted by rating");
        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(list, ratingCompare);
        for (Movie1 movie : list)
            System.out.println(movie.getRating() + " "
                    + movie.getName() + " "
                    + movie.getYear());

        // Call overloaded sort method with RatingCompare
        // (Same three steps as above)
        System.out.println("\nSorted by name");
        NameCompare nameCompare = new NameCompare();
        Collections.sort(list, nameCompare);
        for (Movie1 movie : list)
            System.out.println(movie.getName() + " "
                    + movie.getRating() + " "
                    + movie.getYear());

        // Uses Comparable to sort by year
        System.out.println("\nSorted by year");
        Collections.sort(list);
        for (Movie1 movie : list)
            System.out.println(movie.getYear() + " "
                    + movie.getRating() + " "
                    + movie.getName() + " ");
    }
}