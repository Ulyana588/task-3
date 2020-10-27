package ru.vsu.num20;

public class Picture {
    private Line line1;
    private Line line2;
    private Parabola parabola1;
    private Parabola parabola2;
    private Parabola parabola3;

    public Picture(Line line1, Line line2, Parabola parabola1, Parabola parabola2, Parabola parabola3){
        this.line1 = line1;
        this.line2 = line2;
        this.parabola1 = parabola1;
        this.parabola2 = parabola2;
        this.parabola3 = parabola3;
    }
    public  SimpleColor getColor(double x, double y){
        if((parabola3.isRightOfParabola(x, y) && line2.isAboveLine(x, y)) ||
        (parabola3.isRightOfParabola(x, y) && parabola2.isRightOfParabola(x,y)) ||
        (parabola1.isRightOfParabola(x, y) && parabola2.isRightOfParabola(x,y) && line1.isAboveLine(x,y)) ||
        (parabola2.isRightOfParabola(x,y) && !parabola1.isRightOfParabola(x,y) && !line1.isAboveLine(x,y)))
            return SimpleColor.YELLOW;

        if(parabola2.isRightOfParabola(x,y) && !parabola1.isRightOfParabola(x,y) && line1.isAboveLine(x,y))
            return SimpleColor.BLUE;

        if(parabola2.isRightOfParabola(x,y) && !parabola3.isRightOfParabola(x,y) && !line2.isAboveLine(x,y))
            return SimpleColor.ORANGE;

        if(parabola1.isRightOfParabola(x,y) && !parabola2.isRightOfParabola(x,y) && !parabola3.isRightOfParabola(x,y))
            return SimpleColor.GRAY;

        return SimpleColor.WHITE;
    }
}
