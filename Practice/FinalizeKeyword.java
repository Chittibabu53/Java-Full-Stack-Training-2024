class MyClass {
    private int id;

    // Constructor
    public MyClass(int id) {
        this.id = id;
    }

    // Override finalize method

//    protected void finalize() throws Throwable {
//        try {
//            System.out.println("Finalizing object with id: " + id);
//            // Perform cleanup actions, such as closing resources
//        }
//        finally {
//
//        }
//    }
}

public class FinalizeKeyword {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass(1);
        MyClass obj2 = new MyClass(2);

        // Nullifying references to make objects eligible for garbage collection
        obj1 = null;
        obj2 = null;

        // Explicitly requesting garbage collection
        System.gc();

    }
}
