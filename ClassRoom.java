public class ClassRoom
{
private String gebaeude;
private int stock;
private boolean beamer;
private int anzPlaetze;
 
public ClassRoom(String newGebaeude, int newStock, boolean newBeamer, int newAnzPlaetze)
    {
        setGebaeude      (newGebaeude);
        setStock         (newStock);
        setBeamer        (newBeamer);
        setAnzPlaetze    (newAnzPlaetze);
    }
    
public void setGebaeude(String newGebaeude)
{
        gebaeude = newGebaeude;
}
    
public void setStock (int newStock)
{
        stock = newStock;
}
    
public void setBeamer(boolean newBeamer)
{
        beamer = newBeamer;
}
    
public void setAnzPlaetze (int newAnzPlaetze)
{
        anzPlaetze = newAnzPlaetze;
}
    
public String getGebaeude()
{
        return gebaeude;
}
    
public int getStock()
{
        return stock;
}
    
public boolean getBeamer()
{
        return beamer;
}    
    
public int getAnzPlaetze()
{
        return anzPlaetze;
}



}