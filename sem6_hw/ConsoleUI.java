package sem6_hw;

import java.util.List;
import java.util.Scanner;

public class ConsoleUI {

    private LaptopService service = new LaptopService();
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        if (LaptopService.getLaptops().isEmpty()) {
            service.createLaptopSet(10);
        }

        System.out.println(LaptopService.getLaptops());
        while (true) {
              System.out.
              print("> Введите параметр поиска (1 - ОЗУ, 2 - Объем жесткого диска, 3 - Операционная система):  \n"
              );
              String mainSearch = scanner.nextLine();
              if (mainSearch.equals("1")) {
              System.out.print("> Введите нужное количество ГБ ОЗУ (4,8,16,32,64):  \n");
              String paramSearch = scanner.nextLine();
              System.out.println(findBy(1, paramSearch));;
              } else if(mainSearch.equals("2")) {
              System.out.
              print("> Введите нужный объем жесткого диска, ГБ (128,256,512,1024):  \n");
              String paramSearch = scanner.nextLine();
              System.out.println(findBy(2, paramSearch));;
              }
              else if(mainSearch.equals("3")) {
              System.out.
              print("> Введите нужную ОС (Without OS, macOS, Linux,Windows) :  \n");
              String paramSearch = scanner.nextLine();
              System.out.println(findBy(3, paramSearch));;
              }
              else {
              System.out.print("> Введена не верная цифра.");
              }
             

            System.out.println("Искать еще? (y/n)");
            String exitCheck = scanner.nextLine();
            if (exitCheck.equals("n")) {
                LaptopService.ClearSet();
                System.exit(0);
            }
        }

    }

    public static List<String> findBy(int mainSearch, String paramSearch) {
        if (mainSearch == 1) {
            return LaptopService.SearchByRAM(Integer.parseInt(paramSearch));
        } else if (mainSearch == 2) {
            return LaptopService.SearchByHardDriveCapasity(Integer.parseInt(paramSearch));
        } else {
            return LaptopService.SearchByOS(paramSearch);
        }
    }
}
