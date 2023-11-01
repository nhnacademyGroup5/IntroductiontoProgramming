package com.nhnacademy.group.unit11.jiwon;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfCd {
    private List<Cd> cdList;

    public ListOfCd() {
        cdList = new ArrayList<>();
    }

    public void insertCD(Cd cd) {
        cdList.add(cd);
    }

    public void deleteCD(Cd cd) {
        cdList.remove(cd);
    }

    public void printCDs() {
        cdList.forEach(System.out::println);
    }

    public double calculateTotalPrice() {
        return cdList.stream().mapToInt(Cd::getPrice).sum();
    }

    public List<Cd> findCDsByAuthor(String author) {
        return cdList.stream()
                .filter(cd -> cd.getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        ListOfCd cdCollection = new ListOfCd();

        Cd cd1 = new Cd("jiwon", "chosun", 2023, 15000);
        Cd cd2 = new Cd("jion", "honam", 2022, 12000);

        cdCollection.insertCD(cd1);
        cdCollection.insertCD(cd2);
        cdCollection.printCDs();

        System.out.println("Total Price: " + cdCollection.calculateTotalPrice());


        String author = "jion";
        List<Cd> authorCDs = cdCollection.findCDsByAuthor(author);
        authorCDs.forEach(System.out::println);


    }
}
