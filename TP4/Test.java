class Test{
    public static void main(String[] args) {
        Plateau a = new Plateau();
        a.afficher();
        Mouvement m = new Mouvement();
        m.setDepartArrive(a.giveCase(1,1),a.giveCase(4,1));
        a.deplace(m,true);
        a.afficher();
        m.setDepartArrive(a.giveCase(4,1),a.giveCase(2,6));
        a.deplace(m,true);
        a.afficher();
    }
}
