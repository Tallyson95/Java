package model.entities;

import model.exception.DomainException;

public class Account {
    private Integer numberAccount;
    private String holder;
    private Double balance;
    private Double withDrawLimit;

    public Account(Integer numberAccount, String holder, Double balance, Double withDrawLimit) throws DomainException{

        if (numberAccount == null || numberAccount <= 0) {
            throw new DomainException("Número da conta inválido");
        }

        if (holder == null || holder.isBlank()) {
            throw new DomainException("Titular inválido");
        }

        if (balance == null || balance < 0) {
            throw new DomainException("Saldo inválido");
        }

        if (withDrawLimit == null || withDrawLimit < 0) {
            throw new DomainException("Limite inválido");
        }

        this.numberAccount = numberAccount;
        this.holder = holder;
        this.balance = balance;
        this.withDrawLimit = withDrawLimit;
    }


    public Integer getNumberAccount() {
        return numberAccount;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithDrawLimit() {
        return withDrawLimit;
    }

    public void deposit(Double value) throws DomainException{
        if (value <= 0.0){
            throw new DomainException("Valor de despósito inválido!");
        }
        this.balance += value;
    }

    public void withDraw(Double value) throws DomainException{
        if(getBalance() - value < 0){
            throw new DomainException("O valor sacado excede o limite de " + getWithDrawLimit() + " reais da conta!");

        }
        this.balance -= value;
    }

}
