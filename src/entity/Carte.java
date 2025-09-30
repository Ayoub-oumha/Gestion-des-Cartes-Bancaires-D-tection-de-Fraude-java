package entity;

import entity.enums.StatutCarte;

import java.time.LocalDate;

public sealed class Carte permits  CarteDebit, CarteCredit, CartePrepayee  {
    protected int id;
    protected String numero;
    protected LocalDate dateExpiration ;
    protected StatutCarte statut;
    protected int idClient;

    // Getters, setters, constructeur
}
