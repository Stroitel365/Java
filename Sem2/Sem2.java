
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Sem2 {


    static final Logger LOGGER = Log.getLogger(Sem2.class.getName());


    public static void main(String[] args) {
        // task1(100);
        writeToFile("lesson2.txt", "C:\\Users\\Polina\\Desktop\\Рабочий стол");
   
   
    }

    /**
     * Дано четное число N (>0) и строки c1 и c2, которые следует учитывать как 1
     * символ.
     * Написать метод, который вернет строку длины N*2, которая состоит из
     * чередующихся
     * последовательностей c1 и c2, начиная с c1.
     * 
     */

    public static void task1(int n) {
        String c1 = "c1";
        String c2 = "c2";

        StringBuilder result = new StringBuilder();

        int k = n * 2;
        for (int i = 0; i < k; i++) {
            result.append(c2);
            result.append(c1);
        }

        System.out.println(result);
    }

    /**
         * Напишите метод, который вернет содержимое текущей папки в виде массива строк.
         * Напишите метод, который запишет массив, возвращенный предыдущим методом в
         * файл.
         * Обработайте ошибки с помощью try-catch конструкции. В случае возникновения
         * исключения,
         * оно должно записаться в лог-файл.
         */

    public static List readDir(String path) {
        File folder = new File(path);

        if (!folder.isDirectory()){
            throw new RuntimeException("File is not directory");
        }
        File[] files = folder.listFiles();
        List<String> result = new ArrayList<>();
        
        for (File file: files){
            String name = file.getName();
            result.add(name);
            if (isThrow()){
                LOGGER.log(Level.INFO, "Error reading directory: "+folder.getAbsolutePath());
            } 
        }

        return result;
    }
    public static void writeToFile(String pathIn, String pathOut) {
        List<String> list = readDir(pathOut);
         try(FileWriter fw = new FileWriter(pathIn);){
            for (String s:list){
                fw.write(s+"\n");
                fw.flush();
                 if (isThrow()){
                    LOGGER.log(Level.INFO, "Error writing directory: "+ s);
                } 
            }
         }catch (Exception e){
            e.printStackTrace();
         }
    }  


    private static boolean isThrow() {
        int a = 0;
        int b = 2;
        int digit = a + (int) (Math.random() * b);
//        System.out.println(digit);
        return digit > 0;
    }

/*     private static void foo() {
        File f = new File("Hello word!");
        try {
            FileWriter fw = new FileWriter(f);
        } catch (Exception e) {
            System.out.println(e);
        }

    } */
}
