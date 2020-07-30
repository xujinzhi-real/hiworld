
public class HiWorld {
    public static void main(String[] args) {
        System.out.println("Hi world!!!");
        Hero hero=null;

        for(int i=0;i<3;i++){
            hero=new Hero();
            hero.setName("hero"+i);
            System.out.println(hero.getName());
        }
    }
}
