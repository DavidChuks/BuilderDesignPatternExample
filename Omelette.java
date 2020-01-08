package com.david.builderpattern;

import java.util.ArrayList;

public class Omelette
{
    private int numberOfEggs;
    private boolean hasCarrots;
    private boolean hasSalt;
    private boolean hasOil;
    private boolean hasGreenPeppers;
    private ArrayList<String> extraIngredientsList;

    public Omelette(int numberOfEggs, boolean hasCarrots, boolean hasSalt, boolean hasOil,
            boolean hasGreenPeppers, ArrayList<String> extraIngredientsList)
    {
        this.numberOfEggs = numberOfEggs;
        this.hasCarrots = hasCarrots;
        this.hasSalt = hasSalt;
        this.hasOil = hasOil;
        this.hasGreenPeppers = hasGreenPeppers;
        this.extraIngredientsList = extraIngredientsList;
    }

    public Omelette(int numberOfEggs, boolean hasCarrots, boolean hasSalt, boolean hasOil,
            boolean hasGreenPeppers)
    {
        super();
        this.numberOfEggs = numberOfEggs;
        this.hasCarrots = hasCarrots;
        this.hasSalt = hasSalt;
        this.hasOil = hasOil;
        this.hasGreenPeppers = hasGreenPeppers;
    }

    public int getNumberOfEggs()
    {
        return numberOfEggs;
    }

    public void setNumberOfEggs(int numberOfEggs)
    {
        this.numberOfEggs = numberOfEggs;
    }

    public boolean isHasCarrots()
    {
        return hasCarrots;
    }

    public void setHasCarrots(boolean hasCarrots)
    {
        this.hasCarrots = hasCarrots;
    }

    public boolean isHasSalt()
    {
        return hasSalt;
    }

    public void setHasSalt(boolean hasSalt)
    {
        this.hasSalt = hasSalt;
    }

    public boolean isHasOil()
    {
        return hasOil;
    }

    public void setHasOil(boolean hasOil)
    {
        this.hasOil = hasOil;
    }

    public boolean isHasGreenPeppers()
    {
        return hasGreenPeppers;
    }

    public void setHasGreenPeppers(boolean hasGreenPeppers)
    {
        this.hasGreenPeppers = hasGreenPeppers;
    }

    public ArrayList<String> getExtraIngredientsList()
    {
        return extraIngredientsList;
    }

    public void setExtraIngredientsList(ArrayList<String> extraIngredientsList)
    {
        this.extraIngredientsList = extraIngredientsList;
    }

    public void addExtraIngredient(String ingredient)
    {

        if (extraIngredientsList == null)
        {
            extraIngredientsList = new ArrayList<>();
            extraIngredientsList.add(ingredient);
        }
        else
        {
            extraIngredientsList.add(ingredient);
        }

    }

    @Override
    public String toString()
    {
        return "This Omelette is made from [numberOfEggs=" + numberOfEggs + ", hasCarrots="
                + hasCarrots
                + ", hasSalt="
                + hasSalt + ", hasOil=" + hasOil + ", hasGreenPeppers=" + hasGreenPeppers
                + ", extraIngredientsList=" + extraIngredientsList + "]";
    }

    public static OmeleteBuilder omeletebuilder()
    {
        return new OmeleteBuilder();
    }

    static class OmeleteBuilder
    {

        private int numberOfEggs;
        private boolean hasCarrots;
        private boolean hasSalt;
        private boolean hasOil;
        private boolean hasGreenPeppers;
        private ArrayList<String> extraIngredientsList;

        OmeleteBuilder()
        {}

        public OmeleteBuilder numberOfEggs(int number)
        {
            numberOfEggs = number;
            return this;
        }

        public OmeleteBuilder hasCarrots(boolean bool)
        {
            hasCarrots = bool;
            return this;
        }

        public OmeleteBuilder hasSalt(boolean bool)
        {
            hasSalt = bool;
            return this;
        }

        public OmeleteBuilder hasOil(boolean bool)
        {
            hasOil = bool;
            return this;
        }

        public OmeleteBuilder hasGreenPeppers(boolean bool)
        {
            hasGreenPeppers = bool;
            return this;
        }

        public OmeleteBuilder addExtraIngredient(String ingredient)
        {

            if (extraIngredientsList == null)
            {
                extraIngredientsList = new ArrayList<>();
                extraIngredientsList.add(ingredient);
            }
            else
            {
                extraIngredientsList.add(ingredient);
            }

            return this;
        }

        public Omelette fry()
        {

            return new Omelette(numberOfEggs, hasCarrots, hasSalt, hasOil, hasGreenPeppers,
                    extraIngredientsList);
        }

    }

}
