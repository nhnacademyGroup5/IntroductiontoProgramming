package animal;

class Penguin implements mammalia, swimAble {


    @Override
    public String type() {

        return "penguin";

    }

    @Override
    public boolean swim() {
        return true;
    }

}
