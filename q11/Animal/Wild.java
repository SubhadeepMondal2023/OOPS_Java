package q11.Animal;

public class Wild extends Pet{
    private String wname;

    public void setName(String name){
        this.wname = name;
    }
    public String getName(){
        return this.wname;
    }
    public void habit(){
        System.out.println(this.wname + " loves hunting.");
    }
    public static void main(String[] args) {
        Pet p = new Pet();
        System.out.println(p.pname);
        System.out.println(p.pcolor);
        System.out.println(p.pbreed);
        System.out.println(p.psound);
    }
}

