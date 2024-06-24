package q11.Animal;

public class Pet {
    public String pname;
    String pcolor;
    protected String pbreed;
    private String psound;

    public void setName(String name){
        this.pname = name;
    }
    public String getName(){
        return this.pname;
    }
    public void habit(){
        System.out.println(this.pname + " loves playing.");
    }
    public static void main(String[] args) {
        Pet p = new Pet();
        System.out.println(p.pname);
        System.out.println(p.pcolor);
        System.out.println(p.pbreed);
        System.out.println(p.psound);
    }
}
