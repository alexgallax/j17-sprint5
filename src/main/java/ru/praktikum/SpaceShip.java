package ru.praktikum;

import java.util.Comparator;
import java.util.Objects;

public class SpaceShip implements Comparable<SpaceShip> {

    private final String model;
    private final int crew;

    public SpaceShip(String model, int crew) {
        this.model = model;
        this.crew = crew;
    }

    @Override
    public String toString() {
        return "SpaceShip{" +
                "model='" + model + '\'' +
                ", crew=" + crew +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpaceShip spaceShip = (SpaceShip) o;
        return crew == spaceShip.crew && Objects.equals(model, spaceShip.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, crew);
    }

    @Override
    public int compareTo(SpaceShip o) {
        return Comparator.comparingInt((SpaceShip obj) -> obj.crew)
                .thenComparing((SpaceShip obj) -> obj.model)
                .compare(this, o);
    }
}
