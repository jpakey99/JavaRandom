/**
 * Classic Peg game that can be played.  The goal is to get down to 1 peg
 * This class represents 1 (one) peg in the game
 *
 * author John Akey <jpakey99@gmail.com>
 */
package PegGame;

public class Peg {

    public static Type Type;
    /**
     * the id number of the individual peg
     */
    private final int id;

    /**
     * Holds whether the peg is in the slot or if the slot is empty
     */
    private Type type;


    /**
     * the slot can only have 2 types, empty and peg.
     */
    public enum Type{
        empty,
        peg;
    }

    /**
     * Constructor.  Every peg hole starts with a peg.
     */
    public Peg(int id){
        this.id = id;
        type = Type.peg;
    }

    /**
     * Access the Id of the requested Peg
     * @return the Id of the peg
     */
    public int getId(){
        return id;
    }

    /**
     * Access what the instance of peg is holding
     * @return the type
     */
    public Type nodeType(){
        return type;
    }

    /**
     * set the type for the peg to be the opposite of what it currently is.
     * Ex: if empty, this sets it to peg
     */
    public void setType(){
        if(nodeType() == Type.empty){
            type = Type.peg;
        }
        else{
            type = Type.empty;
        }
    }

    /**
     * String representation of the peg
     * @return a String that represents a peg
     */
    public String toString(){
        if (nodeType() == Type.empty){
            return "" + id + ": Empty";
        }
        else{
            return "" + id + ": Peg";
        }
    }
}
