public class President {
    private String name;
    private String picture_path;
    private int term;

    public President(String name, String picture_path, int term){
        name = name;
        picture_path = picture_path;
        term = term;
    }

    public String getName(){
        return name;
    }

    public String getPicture_path(){
        return picture_path;
    }

    public int getTerm(){
        return term;
    }

    public void changePresident(String new_name, String new_picture_path, int new_term){
        name = new_name;
        picture_path = new_picture_path;
        term = new_term;
    }

    public String toString(){
        return name + picture_path + term;
    }

    public static void main(String[] args){
        President pres = new President("Trump", "examplepath", 45);
        System.out.println(pres);

        pres.changePresident("Biden", "examplepath2", 46);
    }
}
