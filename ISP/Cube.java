package ISP;

class Cube implements ThreeDShape {

    @Override
    public int area(int l, int b) {
        return l * b;
    }

    @Override
    public int volume(int l, int b, int h) {
        return l * b * h;
    }
}