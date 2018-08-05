class rect{
    private int length;
    private int breadth;
    public rect(int l, int b){
        length = l;
        breadth = b;
    }
    public int getArea(){
        return length*breadth;
    }
}
class cl2{
    public static void main(String[] args){
        rect r = new rect(2,4);
        System.out.println(r.getArea());
    }
}