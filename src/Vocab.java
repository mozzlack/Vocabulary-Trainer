public class Vocab {
    private String front;
    private String back;
    public Vocab(String frontSide, String backSide) {
        this.front = frontSide;
        this.back = backSide;
    }

    public String getBack() {
        return this.back;
    }

    public String getFront() {
        return this.front;
    }
}
