class A{
    private int attr;
    A(int value_attr){
        this.attr = value_attr;
    }
    public bool egal (A b){
        return (this.attr == b.attr);
    }
    public int getAttr(){
        return this.attr;
    }
    public static void main(String [] args){
        A obj = new A(2);
        A obj2 = obj;
        A obj3 = new A(2);
        System.out.println((obj.egal(obj2)) ? "Egal" : "Different");
        System.out.println((obj2.egal(obj3)) ? "Egal" : "Different");
        System.out.println((obj.egal(obj3)) ? "Egal" : "Different");
        System.out.println((obj==obj2) ? "Egal" : "Different");
        System.out.println((obj==obj3) ? "Egal" : "Different");
        System.out.println((obj2==obj3) ? "Egal" : "Different");

    }
}
