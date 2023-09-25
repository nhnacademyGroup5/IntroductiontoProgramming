package animal;

interface mammalia extends animal {

    @Override
    public default boolean fly() {

        return false;
    }


}
