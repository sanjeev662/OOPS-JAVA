public class Inheritance {
    public static void main(String[] args)
    {
        suzuki s=new suzuki();
        s.CarName="alto";
        s.speed();
        s.tyres();
        s.material();
        s.uniqueQuality();
    }
}
class car
{
    String CarName;
    void speed()
    {
        System.out.println(CarName+ " faster then human");
    }
    void tyres()
    {
        System.out.println(CarName+ " generally four tyres found");
    }
    void material()
    {
        System.out.println(CarName+ " generally made of metal");
    }
}
class suzuki extends car
{
    void uniqueQuality()
    {
        System.out.println("Easily available and pocket friendly");
    }
}
class bmw extends car
{
    void uniqueQuality()
    {
        System.out.println("having standered engine with high speed and fine body");
    }
}