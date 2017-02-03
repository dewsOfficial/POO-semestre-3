class MainFM{
    public static void main(String[] args) {
        Mere m=new Mere();
        Fille f=new Fille();
        m.f(3);
        f.f(4);
        m=f;
        m.f(5);
        ((Fille)m).g();
        f.g();
    }
}
