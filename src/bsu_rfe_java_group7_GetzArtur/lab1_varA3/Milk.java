package bsu_rfe_java_group7_GetzArtur.lab1_varA3;

public class Milk extends Food
{
    private String fat;
    public Milk(String fat)
    {
        super("Молоко");
        this.fat = fat;
    }
    public void consume()
    {
        System.out.println(this + " выпили ");
    }
    public String getFat()
    {
        return fat;
    }
    public void setFat(String fat)
    {
        this.fat = fat;
    }
    /*public boolean equals(Object arg0)
    {
        if (super.equals(arg0))
        {
            if (!(arg0 instanceof IceCream)) return false;
            return syrup.equals(((IceCream)arg0).syrup);
        }
        else
            return false;
    }*/
    public String toString()
    {
        return super.toString() + " жирностью: " + fat.toUpperCase();
    }
}

