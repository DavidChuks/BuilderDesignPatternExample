package com.david.builderpattern;

public class OmeleteMaker
{

    public static void main(String[] args)
    {

        Omelette complexOmelete = new Omelette(2, true, true, true, true);

        complexOmelete.addExtraIngredient("Parsely");
        complexOmelete.addExtraIngredient("Ginger");

        System.out.println(complexOmelete);

        System.out.println("\n----------------------------\n");

        Omelette breakfastOmelete = Omelette.omeletebuilder()
                .numberOfEggs(2)
                .hasCarrots(false)
                .hasOil(true)
                .hasSalt(true)
                .hasGreenPeppers(true)
                .addExtraIngredient("Parsley")
                .addExtraIngredient("Ginger")
                .fry();

        System.out.println(breakfastOmelete);

    }

}
