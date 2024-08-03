public class Sportarten implements Comparable<Sportarten>{

    private String name;
    private boolean olympisch;
    public Sportarten(String name, boolean olympisch){

        //wir müssen hier der setter methode übergeben das wirklich nichts passiert
        this.setName(name);
        this.setOlympisch(olympisch);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        final int MIN=4;
        if(name != null && name.length()<=MIN){
            throw new IllegalArgumentException("Name der Sportart muss mind. 3 Zeichen enthalten: " + name);
        }
        this.name = name;
    }
//JavaBeans boolean kann 'is' auch sein, muss nicht 'get' sein
    public boolean isOlympisch() {
        return olympisch;
    }

    public void setOlympisch(boolean olympisch) {
        this.olympisch = olympisch;
    }
    @Override
    public boolean equals(Object o){
        if(this==o){
            return true;
        }
        if(o==null){
            return false;
        }
        if (!(o instanceof Sportarten)){
            return false;
        }
        Sportarten s=(Sportarten) o;
        return this.name.equals(s.name) && this.olympisch==s.olympisch;
    }

    public String toString(){
        return "Sportart";
    }

    @Override
    public int compareTo(Sportarten s) {

        return this.name.compareTo(s.name);
    }
}
