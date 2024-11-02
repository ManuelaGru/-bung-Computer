public class ClassRoom
{
    private boolean laptop;
    private String  Hersteller;
    private int     preis;
    private int     mhz;
    
    public ClassRoom(String newHersteller, boolean newLaptop, int newPreis, int newMhz)
    {
        setLaptop       (newLaptop);
        setHersteller   (newHersteller);
        setPreis        (newPreis);
        setMhz          (newMhz);
    }
    
    public ClassRoom(String newHersteller, boolean newLaptop, int newPreis)
    {
        setHersteller   (newHersteller);
        setLaptop       (newLaptop);
        setPreis        (newPreis);
    }
    
    public ClassRoom(int newPreis, String newHersteller)
    {
        setPreis(newPreis);
        setHersteller(newHersteller);
    }
    
    public void setLaptop(boolean newLaptop)
    {
        laptop = newLaptop;
    }
    
    public void setHersteller (String newHersteller)
    {
        Hersteller = newHersteller;
    }
    
    public void setPreis(int newPreis)
    {
        preis = newPreis;
    }
    
    public void setMhz (int newMhz)
    {
        mhz = 2000;
    }
    
    public boolean getLaptop()
    {
        return laptop;
    }
    
    public String getHersteller()
    {
        return Hersteller;
    }
    
    public int getPreis()
    {
        return preis;
    }    
    
    public int getMhz()
    {
        return 2000;
    }
}
