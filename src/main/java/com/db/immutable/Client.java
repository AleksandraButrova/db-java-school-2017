package com.db.immutable;

public class Client {
    private final String name;
    private final int bonus;
    private final int debt;



    private Client(String name, int bonus, int debt){
        this.name = name;
        this.bonus = bonus;
        this.debt = debt;
    }

    public Client addBonus(int bonus){
        return new Client(this.name, this.bonus + bonus, this.debt);
    }

    public Client addDebt(int debt){
        return new Client(this.name, this.bonus, this.debt + debt);
    }

    public int getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return name + " bonus = " + bonus + " debt = " + debt;
    }

    public static class Builder {
        private String name;
        private int bonus;
        private int debt;

        private boolean alreadyUsed;

        public Builder bonus(int bonus) {
            this.bonus = bonus;
            return this;
        }

        public Builder debt(int debt) {
            this.debt = debt;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Client build(){
            return new Client(name, bonus, debt);
        }

        private void validate(){
            if(alreadyUsed){

            }else{

            }
        }
    }
}
