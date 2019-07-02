/**
 * This class tests the functionality of the Peg class
 *
 * author John Akey <jpakey99@gmail.com>
 */
package PegGame;

public class TestPeg {

    /**
     * test to make sure the constructor creates the instance as expected
     */
    private static void testConstructor(){
        System.out.println("Test 1 starting...");
        int id = 1;
        Peg testPeg = new Peg(id);
        if (testPeg.getId() == id){
            System.out.println("\tTest 1 PASSED");
        }
        else{
            System.out.println("\tTest 1 FAILED.  Expected: " + id + " got: " + testPeg.getId());
        }

        System.out.println("Test 2 starting...");
        id = 5;
        Peg testPeg1 = new Peg(id);
        if (testPeg1.getId() == id){
            System.out.println("\tTest 2 PASSED");
        }
        else{
            System.out.println("\tTest 2 FAILED.  Expected: " + id + " got: " + testPeg1.getId());
        }

        System.out.println("Test 3 starting...");
        id = 1;
        Peg testPeg2 = new Peg(id);
        if (testPeg2.nodeType() == Peg.Type.peg){
            System.out.println("\tTest 2 PASSED");
        }
        else{
            System.out.println("\tTest 2 FAILED.  Expected: peg got: empty");
        }
    }

    private static void testChangingTypes() {
        System.out.println("Test 1 starting...");
        Peg testPeg = new Peg(1);
        testPeg.setType();
        if(testPeg.nodeType() == Peg.Type.empty){
            System.out.println("\tTest 1 PASSED");
        }
        else{
            System.out.println("\tTest 1 FAILED.  Expected: empty got: peg");
        }

        System.out.println("Test 2 starting...");
        testPeg.setType();
        if(testPeg.nodeType() == Peg.Type.peg){
            System.out.println("\tTest 2 PASSED");
        }
        else{
            System.out.println("\tTest 2 FAILED.  Expected: peg got: empty");
        }
    }

    public static void main(String[] args) {
        System.out.println("~~~~~~~~Starting Peg Tests~~~~~~~~");
        System.out.println("Testing Constructor:");
        testConstructor();
        System.out.println("Testing Creating Changing Type");
        testChangingTypes();
        System.out.println("~~~~~~~~Ending Peg Tests~~~~~~~~");

    }
}
