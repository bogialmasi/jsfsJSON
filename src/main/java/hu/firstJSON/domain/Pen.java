package hu.firstJSON.domain;

public class Pen {
    private int serialNum;
    private String color;
    private boolean empty;

    public Pen(int serialNum, String color, boolean empty) {
        this.serialNum = serialNum;
        this.color = color;
        this.empty = empty;
    }

    public int getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }
}
