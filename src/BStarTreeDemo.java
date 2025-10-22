import ru.vsu.cs.tolkacheva_u_a.bstartree.BStarTree;

public class BStarTreeDemo {
    public static void main(String[] args) {
        System.out.println("=== B* Tree Console Demo ===");

        // Создаем B* дерево порядка 3
        BStarTree<Integer> tree = new BStarTree<>(3);

        System.out.println("Initial tree:");
        System.out.println("Size: " + tree.size());
        System.out.println("Height: " + tree.getHeight());
        System.out.println("Is empty: " + tree.isEmpty());

        // Вставляем значения
        System.out.println("\n--- Inserting values ---");
        int[] values = {10, 20, 5, 15, 25, 30, 3, 8, 12, 18};

        for (int value : values) {
            System.out.println("Inserting: " + value);
            tree.insert(value);
            System.out.println("Size after insert: " + tree.size());
            System.out.println("Height after insert: " + tree.getHeight());
        }

        // Поиск значений
        System.out.println("\n--- Searching values ---");
        int[] searchValues = {10, 15, 7, 25, 100};

        for (int value : searchValues) {
            boolean found = tree.search(value);
            System.out.println("Value " + value + ": " + (found ? "FOUND" : "NOT FOUND"));
        }

        // Демонстрация удаления (заглушка)
        System.out.println("\n--- Remove demonstration ---");
        tree.remove(10);
        System.out.println("Size after remove: " + tree.size());

        // Очистка дерева
        System.out.println("\n--- Clearing tree ---");
        tree.clear();
        System.out.println("Size after clear: " + tree.size());
        System.out.println("Is empty: " + tree.isEmpty());

    }
}