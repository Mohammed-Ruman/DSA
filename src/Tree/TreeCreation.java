package Tree;

public class TreeCreation {
    public static void main(String[] args) {
        TreeNode drinks=new TreeNode("Drinks");
        TreeNode softdrinks=new TreeNode("Soft");
        TreeNode harddrinks=new TreeNode("Hard");
        drinks.addChildren(softdrinks);
        drinks.addChildren(harddrinks);
        TreeNode sprite=new TreeNode("Sprite");
        TreeNode pepsi=new TreeNode("Pepsi");
        softdrinks.addChildren(sprite);
        softdrinks.addChildren(pepsi);
        TreeNode tea=new TreeNode("Tea");
        TreeNode coffee=new TreeNode("Coffee");
        harddrinks.addChildren(tea);
        harddrinks.addChildren(coffee);
        System.out.println(drinks.print(1));
    }
}
