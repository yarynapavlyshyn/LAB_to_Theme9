package Flowers.Decorator;

public enum Decor {
    PAPER, BUCKET, RIBBON;

    public String toString() {
        switch(this) {
            case PAPER: return "paper";
            case BUCKET: return "bucket";
            case RIBBON: return "ribbon";
        }
        return null;
    }

}