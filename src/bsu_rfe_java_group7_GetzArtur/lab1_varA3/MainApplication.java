package bsu_rfe_java_group7_GetzArtur.lab1_varA3;

public class MainApplication
{
    @SuppressWarnings ("unchecked")
    public static void main(String[] args) throws Exception
    {
        Food[] breakfast = new Food[20];
        breakfast[0] = new Milk("1.5%");
        breakfast[1] = new Apple("средний");
        breakfast[2] = new Cheese();
        breakfast[3] = new Milk("2.5%");
        breakfast[4] = new Milk("5%");
        int itemsSoFar = 0;
        for(String arg:args)
        {
            String parts[] = arg.split("/");
            if (parts[0].equals("Cheese"))
            {
                breakfast[itemsSoFar] = new Cheese();
            } else
            if (parts[0].equals("Apple"))
            {
                breakfast[itemsSoFar] = new Apple(parts[1]);
            } else
            if (parts[0].equals("Milk"))
            {
                breakfast[itemsSoFar] = new Milk(parts[1]);
            }
        }
        int ApplesConsumed = 0;
        int CheeseConsumed = 0;
        int MilkConsumed = 0;
        for (Food item: breakfast)
            if (item!=null)
            {
                item.consume();
                if (item.equals(new Apple("")))
                    ApplesConsumed++;
                if (item.equals(new Cheese()))
                    CheeseConsumed++;
                if (item.equals(new Milk("")))
                    MilkConsumed++;
            }
            else
                break;
        System.out.println("\nСъедено яблок:" + ApplesConsumed +
                "\nСъедено порций сыра:" + CheeseConsumed +
                "\nВыпито порций молока:" + MilkConsumed +
                "\nВсего хорошего!");
    }
}
