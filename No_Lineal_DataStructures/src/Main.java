public class Main{

    public static void main(String[] args) {
        var tree = new Tree();
        tree.insert(10);
        tree.insert(20);
        tree.insert(8);
        tree.insert(4);
        tree.insert(9);

        System.out.println(tree.getAncestors(9));

    }
}