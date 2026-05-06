package anuja.collection.Comparable;

// This class implements Comparable to allow sorting of its objects.
public class ComprableInOneClass implements Comparable<ComprableInOneClass> {
    int id;       // Unique ID for each object
    String name;  // Name of the person/object
    int rollNum;  // Roll number of the person/object
    char grade;   // Grade of the person/object

    // Constructor to initialize the fields
    public ComprableInOneClass(int id, String name, int rollNum, char grade) {
        this.id = id;
        this.name = name;
        this.rollNum = rollNum;
        this.grade = grade;
    }

    // Overriding toString() to display object information in a readable format
    @Override
    public String toString() {
        return "grade " + grade + " ,id " + id + " ,name " + name + ", rollnum " + rollNum;
    }

    // Overriding compareTo to sort by 'id' (default sorting order)
    @Override
    public int compareTo(ComprableInOneClass o) {
        // Sorting by integer 'id'
        return this.id - o.id;
    }

    /* Uncomment this compareTo() method to sort by 'name' instead:
    @Override
    public int compareTo(ComprableInOneClass o) {
        // Sorting by string 'name' in lexicographical order
        return this.name.compareTo(o.name);
    }
    */
}
