import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        //Создали объекты всех классов потомков
        PlasticFactory plasticFactory1 = new PlasticFactory("name1", "adr1", "type1");
        PlasticFactory plasticFactory2 = new PlasticFactory("name2", "adr2", "type2");

        CarFactory carFactory1 = new CarFactory("car1", "addr1", "mod1", "Blacl1", 100);
        CarFactory carFactory2 = new CarFactory("car2", "addr2", "mod2", "Blacl2", 200);

        FurnitureFactory furnitureFactory1 = new FurnitureFactory("Furn1", "ADDRES1", "Name1", "RED1");
        FurnitureFactory furnitureFactory2 = new FurnitureFactory("Furn2", "ADDRES2", "Name2", "RED2");

        //Создание массива
        Factory[] mass = {plasticFactory1, plasticFactory2, carFactory1, carFactory2, furnitureFactory1, furnitureFactory2};
//        // Создание массива вторым способом
//        Factory[] mass2 = new Factory[6];
//        mass2[0] = plasticFactory1;
//        mass2[1] = plasticFactory2;
//        mass2[2] = carFactory1;
//        mass2[3] = carFactory2;
//        mass2[4] = furnitureFactory1;
//        mass2[5] = furnitureFactory2;

        int count = 0;
        double sum = 0;

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] instanceof CarFactory) {
                count++;
                CarFactory carFactory = (CarFactory) mass[i];
                sum += carFactory.getCost();
                System.out.println(mass[i]);
            }
        }
        System.out.println("=========================================");
        double sr = sum / count;
        System.out.println("Среднее значение " + sr);
        System.out.println("=========================================");

        List<Factory> factoryList = new ArrayList<Factory>();
        factoryList.add(plasticFactory1);
        factoryList.add(plasticFactory2);

        factoryList.add(carFactory1);
        factoryList.add(carFactory2);

        factoryList.add(furnitureFactory1);
        factoryList.add(furnitureFactory2);

        for (Factory factory : factoryList) {
            if (factory instanceof PlasticFactory) {
                System.out.println(factory);
            }
        }
        for (Factory factory : factoryList) {
            if (factory instanceof CarFactory) {
                System.out.println(factory);
            }
        }
        for (Factory factory : factoryList) {
            if (factory instanceof FurnitureFactory) {
                System.out.println(factory);
            }
        }

        System.out.println("Vvedite type =>  ");


    }
}
