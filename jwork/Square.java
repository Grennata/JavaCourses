public class Square extends Figure {
    int side = 0;
    public int getSide() {
        return(side);
    }
    public void setSide(int value) {
        side = value;
        area = side * side;
    }
}
