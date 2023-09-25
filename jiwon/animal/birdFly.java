package animal;

interface birdFly extends animal {
    @Override
    public default boolean fly() {

        return true;
    }

}
