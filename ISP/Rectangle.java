package ISP;

class Rectangle implements RectangleShape {

    @Override
    public int area(int l, int b) {
        return l * b;
    }
}