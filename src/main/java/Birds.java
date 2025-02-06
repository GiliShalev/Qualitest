public abstract class Birds {

    public abstract void land();


    private boolean canFly;

    public Birds(boolean canFly) {
        this.canFly = canFly;
    }

    public Birds() {

    }



    public void fly(){
        System.out.println("I'm flying");
    }
}


