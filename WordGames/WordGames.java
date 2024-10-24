import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WordGames here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WordGames extends Actor
{
    /**
     * Act - do whatever the WordGames wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private GreenfootImage img;
    private String word;
    
    public void act()
    {
        // Add your action code here.
        word = scramble();
        img = new GreenfootImage(word, 24, Color.BLUE, Color.WHITE);
        setImage(img);
        Greenfoot.delay(100);
        
        int index=Greenfoot.getRandomNumber(word.length());
        bananaSplit(index, "Hello");
        Greenfoot.delay(100);
       
        bananaSplit("e", "World");
        Greenfoot.delay(100);
    }
    
    public WordGames(String text){
        word = text;
        img = new GreenfootImage(word, 24, Color.RED, Color.BLACK);
        setImage(img);
    }
    
    public String scramble(){
        return word.substring(word.length()/2) + word.substring(0, word.length()/2);
    }
    
    public String bananaSplit(int insertIdx, String insertText){
        word = word.substring(0, insertIdx) + insertText + word.substring(insertIdx);
        img = new GreenfootImage(word, 24, Color.BLUE, Color.WHITE);
        setImage(img);
        return word;
    }
    
    public String bananaSplit(String insertChar, String insertText){
        word = word.substring(0, word.indexOf(insertChar)) + insertText + word.substring(word.indexOf(insertChar));
        img = new GreenfootImage(word, 24, Color.BLUE, Color.WHITE);
        setImage(img);
        return word;
    }
    
    public String toString(){
        return "[" + word + "]";
    }
}
