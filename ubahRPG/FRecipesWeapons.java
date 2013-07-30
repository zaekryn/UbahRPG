package ubahRPG;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class FRecipesWeapons
{
    private String[][] recipePatterns = new String[][] {{"X", "X", "#"}};
    private Object[][] recipeItems;

    public FRecipesWeapons()
    {
        this.recipeItems = new Object[][] {{Block.planks, Block.cobblestone, Item.ingotIron, Item.diamond, Item.ingotGold}, {Item.swordWood, Item.swordStone, Item.swordIron, Item.swordDiamond, Item.swordGold}};
    }

    /**
     * Adds the weapon recipes to the ForgeCraftingManager.
     */
    public void addRecipes(ForgeCraftingManager par1ForgeCraftingManager)
    {
        for (int i = 0; i < this.recipeItems[0].length; ++i)
        {
            Object object = this.recipeItems[0][i];

            for (int j = 0; j < this.recipeItems.length - 1; ++j)
            {
                Item item = (Item)this.recipeItems[j + 1][i];
                par1ForgeCraftingManager.addRecipe(new ItemStack(item), new Object[] {this.recipePatterns[j], '#', Item.stick, 'X', object});
            }
        }

        par1ForgeCraftingManager.addRecipe(new ItemStack(Item.bow, 1), new Object[] {" #X", "# X", " #X", 'X', Item.silk, '#', Item.stick});
    }
}
