package com.db.immutable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClientManager {
    List<Client> clients;

    public  ClientManager(){
        clients = new ArrayList<>();
    }



    public void sortByBonus(){
        clients.sort(new Comparator<Client>() {
            @Override
            public int compare(Client o1, Client o2) {
                if (o1.getBonus() == o2.getBonus()) {
                    return 0;
                } else if (o1.getBonus() > o2.getBonus()){
                    return 1;
                } else {
                    return -1;
                }
            }
        });
    }

    public ClientManager addClient(Client c){
        clients.add(c);
        return this;
    }

    public void printSorted(){
        sortByBonus();
        for( Client c : clients){
            System.out.println(c.toString());
        }
    }
}
