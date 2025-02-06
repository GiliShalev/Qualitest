public class Eagle extends Birds{

    @Override
    public void land() {
        System.out.println("I'm landing");
    }


    String eagleType;

    public Eagle(String eagleType, boolean canFly) {
        super(canFly);
        this.eagleType = eagleType;
    }



    public Eagle() {
        super();
    }

    @Override
    public void fly(){
        System.out.println("I'm hunting");
    }

}


