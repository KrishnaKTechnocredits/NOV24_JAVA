package anuja.returntype_test;
/*
  with more details object creation- instance is new and changes only limited to the instance only.
  Object 0 cnt: 4
Object 1 cnt: 4
Object 2 cnt: 4
Object 3 cnt: 4
New instance cnt: 2
 */
public class Question4_1 {

    int cnt = 2;

    void m1() {
        cnt++;
        m2();
    }

    void m2() {
        cnt++;
    }

    public static void main(String[] args) {
        Question4_1[] objects = new Question4_1[4]; // Array to store instances
        for (int i = 0; i < 4; i++) {
            objects[i] = new Question4_1();
            objects[i].m1();
        }

        // Print the cnt of each object
        for (int i = 0; i < 4; i++) {
            System.out.println("Object " + i + " cnt: " + objects[i].cnt);
        }

        System.out.println("New instance cnt: " + new Question4_1().cnt);
    }
}
