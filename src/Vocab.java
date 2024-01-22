public class Vocab {
    private String front;
    private String back;
    private int failures = 0;
    private int succeds = 0;
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
