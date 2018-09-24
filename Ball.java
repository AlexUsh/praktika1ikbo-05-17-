public class Ball {
    private String type;
    private int diameter;

    public Ball(String t, int d)
    {
        type = t;
        diameter = d;
    }

    public Ball(String t)
    {
        type = t;
        diameter = 0;
    }

    public Ball()
    {
        type = "Pup";
        diameter = 0;
    }

    public void setDiametet(int diameter)
    {
        this.diameter = diameter;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getType(String type)
    {
        return type;
    }

    public int getDiameter()
    {
        return diameter;
    }
    public String toString()
    {
        return this.type+" мяч диаметром "+this.diameter+" см";
    }

    public void intoBallType()
    {
        System.out.println(type+"мяч, диаметр этого мяча "+diameter+" см");
    }
}
