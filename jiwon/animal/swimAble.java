package animal;

 interface swimAble extends animal {
    public default boolean swim(){
        return false;
    }
}
