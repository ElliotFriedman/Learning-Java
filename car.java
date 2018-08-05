class car{
    public int Power;
    public int Serial_no;
    public car(int p, int s){
        Power = p;
        Serial_no = s;
    }
    
}

class Ar1{
    public static void main(String[] args){
        car[] c;
        c = new car[10];
        c[0] = new car(800,111);
    }
    
}