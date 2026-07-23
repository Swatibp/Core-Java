package org.encapsulation;
//Encapsulation
class Customer {
    private int cID;
    private String cName;
    private long cNum;

    //Constructor is special type of method that is automatically called when object is created. It is used to initialize state of the object. Constructor which has same name as class and does not have any return tyype not even void.
    public Customer(int cID, String cName, long cNum) {
        //Dont use the diff local and instance variable instead use same local
        // and instance variable in tht case it will print 0, null, 0 (shadowing problem) hence use this keyword.
//        cID = x;
//        cName = y;
//        cNum = z;
        this.cID = cID;
        this.cName = cName;
        this.cNum = cNum;
    }

    public int getcID() {
        return cID;
    }

    public String getcName() {
        return cName;
    }

    public long getcNum() {
        return cNum;
    }
}
    public class CustomerClass {
        public static void main(String[] args) {
            Customer c = new Customer(1, "Swati", 8088777777L);
            System.out.println(c.getcID());
            System.out.println(c.getcName());
            System.out.println(c.getcNum());
        }
    }
