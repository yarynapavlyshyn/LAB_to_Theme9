package Flowers.Enums;

public enum  FlowerType {
    ROSE, POPPY, ROMASHKA, CARNATION, PEONY, MALLOW, CORNFLOWER, CACTUS;

    public String toString() {
        switch(this) {
            case ROSE: return "rose";
            case POPPY: return "poppy";
            case ROMASHKA: return "romashka";
            case CARNATION: return "carnation";
            case PEONY: return "peony";
            case MALLOW: return "mallow";
            case CORNFLOWER: return "cornflower";
            case CACTUS: return "cactus";
        }
        return null;
    }
}

