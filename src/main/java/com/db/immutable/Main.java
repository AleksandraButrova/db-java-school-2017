package com.db.immutable;

public class Main {
    public static void main(String[] args) {
        Client.Builder builder = new Client.Builder();
        Client client = builder.name("Vasya").bonus(12).debt(15).build();
        client = client.addBonus(2);
        System.out.println("client = " + client);

        Client armen = builder.bonus(100000).debt(100).name("Armen").build();
        System.out.println("client = " + armen);

        ClientManager cm = new ClientManager();
        cm.addClient(client).addClient(armen);
        cm.printSorted();
    }
}
