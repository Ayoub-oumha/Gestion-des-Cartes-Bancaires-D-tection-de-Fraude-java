package entity;

import entity.enums.NiveauAlerte;

public record AlerteFraude(int id,
                           String description,
                           NiveauAlerte niveau,
                           int idCarte) {
}
