
import java.util.Arrays;



 public class Sem2_task1{
    public static void main(String[] args) {
    String  fstr = "select * from students where ";
	 String par = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
    System.out.println(par);
    
    //String nakedPar = par.replaceAll("^\"+|\"+$", "").replace(" ", "");
    par = par.replace("\"", "").replace("{", "").replace("}", "");
    //System.out.println(nakedPar);
    System.out.println(par);
    String[] arr = par.split(",");
    System.out.println(Arrays.toString(arr));
    StringBuilder sb = new StringBuilder(fstr);
    String[] arrRez;
        for (String arr1 : arr) {
            arrRez = arr1.split(":");
            if (arrRez[1].contains("null")){
                sb = sb.delete(sb.length()-4, sb.length());
            } else {
                sb = sb.append(arrRez[0]).append("=").append("'").append(arrRez[1]).append("'").append(" and");
            }
        }
   System.out.println(sb);
    }
   
      //StringBuilder sb = new StringBuilder(par);
      // par.replace("{","");
      //.replace("}","").replace("\",");

      //String newPar = par.replace("{", "").replace("}", "").replace("\","");
 }

/*       String[] arr = strs.split(",");
      String[] arrName = arr[0].split(":");
      sb.append(" ").append(arrName[0]).append("=").append(arrName[1]);
     
      if(!arrName[1].equals("null")
 }
 */